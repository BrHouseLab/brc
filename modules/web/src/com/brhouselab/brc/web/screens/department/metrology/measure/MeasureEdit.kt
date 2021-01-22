package com.brhouselab.brc.web.screens.department.metrology.measure

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Measure

@UiController("brc_Measure.edit")
@UiDescriptor("measure-edit.xml")
@EditedEntityContainer("measureDc")
@LoadDataBeforeShow
class MeasureEdit : StandardEditor<Measure>()