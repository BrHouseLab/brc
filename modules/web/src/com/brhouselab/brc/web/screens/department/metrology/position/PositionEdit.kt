package com.brhouselab.brc.web.screens.department.metrology.position

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Position

@UiController("brc_Position.edit")
@UiDescriptor("position-edit.xml")
@EditedEntityContainer("positionDc")
@LoadDataBeforeShow
class PositionEdit : StandardEditor<Position>()