package com.brhouselab.brc.web.screens.department.contract.contractorder

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.ContractOrder

@UiController("brc_ContractOrder.edit")
@UiDescriptor("contract-order-edit.xml")
@EditedEntityContainer("contractOrderDc")
@LoadDataBeforeShow
class ContractOrderEdit : StandardEditor<ContractOrder>()