package com.brhouselab.brc.web.screens.department.metrology.accounting

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Accounting

@UiController("brc_Accounting.browse")
@UiDescriptor("accounting-browse.xml")
@LookupComponent("accountingsTable")
@LoadDataBeforeShow
class AccountingBrowse : StandardLookup<Accounting>()