package com.brhouselab.brc.web.screens.department.contract.vat

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.VAT

@UiController("brc_VAT.browse")
@UiDescriptor("vat-browse.xml")
@LookupComponent("vATsTable")
@LoadDataBeforeShow
class VATBrowse : StandardLookup<VAT>()