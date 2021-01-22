package com.brhouselab.brc.web.screens.department.metrology.measure

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Measure

@UiController("brc_Measure.browse")
@UiDescriptor("measure-browse.xml")
@LookupComponent("measuresTable")
@LoadDataBeforeShow
class MeasureBrowse : StandardLookup<Measure>()