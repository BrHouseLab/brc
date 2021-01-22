package com.brhouselab.brc.web.screens.department.metrology.unit

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Unit

@UiController("brc_Unit.edit")
@UiDescriptor("unit-edit.xml")
@EditedEntityContainer("unitDc")
@LoadDataBeforeShow
class UnitEdit : StandardEditor<Unit>()