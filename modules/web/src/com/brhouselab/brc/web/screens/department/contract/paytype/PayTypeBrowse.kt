package com.brhouselab.brc.web.screens.department.contract.paytype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.PayType

@UiController("brc_PayType.browse")
@UiDescriptor("pay-type-browse.xml")
@LookupComponent("payTypesTable")
@LoadDataBeforeShow
class PayTypeBrowse : StandardLookup<PayType>()