package com.brhouselab.brc.web.screens.department.metrology.caliup

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.CaliUp

@UiController("brc_CaliUp.edit")
@UiDescriptor("cali-up-edit.xml")
@EditedEntityContainer("caliUpDc")
@LoadDataBeforeShow
class CaliUpEdit : StandardEditor<CaliUp>()