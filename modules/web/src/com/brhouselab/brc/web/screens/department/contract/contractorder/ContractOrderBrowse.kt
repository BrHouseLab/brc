package com.brhouselab.brc.web.screens.department.contract.contractorder

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.ContractOrder

@UiController("brc_ContractOrder.browse")
@UiDescriptor("contract-order-browse.xml")
@LookupComponent("contractOrdersTable")
@LoadDataBeforeShow
class ContractOrderBrowse : StandardLookup<ContractOrder>()