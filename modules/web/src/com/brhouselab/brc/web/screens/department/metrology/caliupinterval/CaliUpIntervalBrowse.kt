package com.brhouselab.brc.web.screens.department.metrology.caliupinterval

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.CaliUpInterval

@UiController("brc_CaliUpInterval.browse")
@UiDescriptor("cali-up-interval-browse.xml")
@LookupComponent("caliUpIntervalsTable")
@LoadDataBeforeShow
class CaliUpIntervalBrowse : StandardLookup<CaliUpInterval>()