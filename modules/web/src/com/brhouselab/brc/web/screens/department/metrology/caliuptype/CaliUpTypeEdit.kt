package com.brhouselab.brc.web.screens.department.metrology.caliuptype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.CaliUpType

@UiController("brc_CaliUpType.edit")
@UiDescriptor("cali-up-type-edit.xml")
@EditedEntityContainer("caliUpTypeDc")
@LoadDataBeforeShow
class CaliUpTypeEdit : StandardEditor<CaliUpType>()