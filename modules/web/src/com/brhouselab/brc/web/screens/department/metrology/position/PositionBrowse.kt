package com.brhouselab.brc.web.screens.department.metrology.position

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Position

@UiController("brc_Position.browse")
@UiDescriptor("position-browse.xml")
@LookupComponent("positionsTable")
@LoadDataBeforeShow
class PositionBrowse : StandardLookup<Position>()