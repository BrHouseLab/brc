package com.brhouselab.brc.web.screens.department.metrology.caliuptype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.CaliUpType

@UiController("brc_CaliUpType.browse")
@UiDescriptor("cali-up-type-browse.xml")
@LookupComponent("caliUpTypesTable")
@LoadDataBeforeShow
class CaliUpTypeBrowse : StandardLookup<CaliUpType>()