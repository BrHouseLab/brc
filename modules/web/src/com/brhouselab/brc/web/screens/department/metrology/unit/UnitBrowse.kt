package com.brhouselab.brc.web.screens.department.metrology.unit

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Unit

@UiController("brc_Unit.browse")
@UiDescriptor("unit-browse.xml")
@LookupComponent("unitsTable")
@LoadDataBeforeShow
class UnitBrowse : StandardLookup<Unit>()