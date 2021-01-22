package com.brhouselab.brc.web.screens.department.metrology.measuretype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.MeasureType

@UiController("brc_MeasureType.browse")
@UiDescriptor("measure-type-browse.xml")
@LookupComponent("measureTypesTable")
@LoadDataBeforeShow
class MeasureTypeBrowse : StandardLookup<MeasureType>()