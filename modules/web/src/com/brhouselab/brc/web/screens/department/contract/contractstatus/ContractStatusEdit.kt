package com.brhouselab.brc.web.screens.department.contract.contractstatus

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.ContractStatus

@UiController("brc_ContractStatus.edit")
@UiDescriptor("contract-status-edit.xml")
@EditedEntityContainer("contractStatusDc")
@LoadDataBeforeShow
class ContractStatusEdit : StandardEditor<ContractStatus>()