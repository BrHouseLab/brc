package com.brhouselab.brc.web.screens.department.task

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.task.Task
import com.haulmont.cuba.gui.components.ActionsAwareDialogFacet
import com.haulmont.cuba.gui.components.Button
import com.haulmont.cuba.gui.components.OptionDialogFacet
import com.haulmont.cuba.security.global.UserSession
import java.time.LocalDateTime
import javax.inject.Inject

@UiController("brc_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
@LoadDataBeforeShow
class TaskEdit : StandardEditor<Task>() {
    @Inject
    private lateinit var userSession: UserSession

    @Subscribe
    private fun onInitEntity(event: InitEntityEvent<Task>) {
        event.entity.from = userSession.currentOrSubstitutedUser
    }

    @Inject
    private lateinit var doneBtn: Button

    @Subscribe
    private fun onAfterShow(event: AfterShowEvent) {
        isReadOnly = editedEntity.doneDate != null
        doneBtn.isVisible = editedEntity.doneDate == null
    }


    @Install(to = "confirmDlg.ok", subject = "actionHandler")
    private fun confirmDlgOkActionHandler(dialogActionPerformedEvent: ActionsAwareDialogFacet.DialogActionPerformedEvent<OptionDialogFacet>?) {
        editedEntity.doneDate = LocalDateTime.now()
        closeWithCommit()
    }
}