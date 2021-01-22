package com.brhouselab.brc.web.screens.department.contract.firm

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.Firm

@UiController("brc_Firm.browse")
@UiDescriptor("firm-browse.xml")
@LookupComponent("firmsTable")
@LoadDataBeforeShow
class FirmBrowse : StandardLookup<Firm>()