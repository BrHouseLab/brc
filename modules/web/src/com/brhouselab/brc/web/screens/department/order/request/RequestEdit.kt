package com.brhouselab.brc.web.screens.department.order.request

import com.brhouselab.brc.entity.department.order.Request
import com.brhouselab.brc.entity.department.order.RequestItem
import com.haulmont.cuba.core.global.DataManager
import com.haulmont.cuba.core.global.Metadata
import com.haulmont.cuba.core.global.MetadataTools
import com.haulmont.cuba.gui.Dialogs
import com.haulmont.cuba.gui.UiComponents
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions
import com.haulmont.cuba.gui.app.core.inputdialog.DialogOutcome
import com.haulmont.cuba.gui.app.core.inputdialog.InputParameter
import com.haulmont.cuba.gui.components.Button
import com.haulmont.cuba.gui.model.CollectionPropertyContainer
import com.haulmont.cuba.gui.screen.*
import java.util.*
import javax.inject.Inject

@UiController("brc_Request.edit")
@UiDescriptor("request-edit.xml")
@EditedEntityContainer("requestDc")
@LoadDataBeforeShow
class RequestEdit : StandardEditor<Request>() {
    @Inject
    private lateinit var dataManager: DataManager

    @Inject
    private lateinit var metadataTools: MetadataTools

    @Inject
    private lateinit var requestItemsDc: CollectionPropertyContainer<RequestItem>

    @Inject
    private lateinit var dialogs: Dialogs

    @Inject
    private lateinit var uiComponents: UiComponents

    @Inject
    private lateinit var metadata: Metadata

    @Subscribe("copyFromRequest")
    private fun onCopyFromRequestClick(event: Button.ClickEvent) {
        dialogs.createInputDialog(this)
                .withParameter(InputParameter.entityParameter("request", Request::class.java))
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener {
                    if (it.closedWith(DialogOutcome.OK)) {
                        it.getValue<Request>("request")?.let { rqt ->
                            val rqtReloaded = dataManager.reload(rqt, "request-with-items")

                            val items = rqtReloaded.requestItems
                                    ?.map { reqItem ->
                                        val res = metadataTools.copy(reqItem).apply {
                                            request = editedEntity
                                            id = UUID.randomUUID()
                                        }
                                        this.screenData.dataContext.merge(res)
                                    }

                            requestItemsDc.setItems(items)
                        }
                    }
                }
                .build()
                .show()
    }

}