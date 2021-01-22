package com.brhouselab.brc.web.screens.department.contract.contract

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.Contract

@UiController("brc_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
@LoadDataBeforeShow
class ContractEdit : StandardEditor<Contract>()