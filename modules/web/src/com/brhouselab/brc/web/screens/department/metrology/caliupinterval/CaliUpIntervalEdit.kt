package com.brhouselab.brc.web.screens.department.metrology.caliupinterval

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.CaliUpInterval

@UiController("brc_CaliUpInterval.edit")
@UiDescriptor("cali-up-interval-edit.xml")
@EditedEntityContainer("caliUpIntervalDc")
@LoadDataBeforeShow
class CaliUpIntervalEdit : StandardEditor<CaliUpInterval>()