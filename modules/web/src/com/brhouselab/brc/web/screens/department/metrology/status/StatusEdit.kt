package com.brhouselab.brc.web.screens.department.metrology.status

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.StatusItem

@UiController("brc_Status.edit")
@UiDescriptor("status-edit.xml")
@EditedEntityContainer("statusDc")
@LoadDataBeforeShow
class StatusEdit : StandardEditor<StatusItem>()