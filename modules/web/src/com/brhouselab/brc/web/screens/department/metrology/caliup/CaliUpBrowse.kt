package com.brhouselab.brc.web.screens.department.metrology.caliup

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.CaliUp

@UiController("brc_CaliUp.browse")
@UiDescriptor("cali-up-browse.xml")
@LookupComponent("caliUpsTable")
@LoadDataBeforeShow
class CaliUpBrowse : StandardLookup<CaliUp>()