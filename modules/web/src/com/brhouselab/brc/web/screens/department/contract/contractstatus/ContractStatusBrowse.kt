package com.brhouselab.brc.web.screens.department.contract.contractstatus

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.ContractStatus

@UiController("brc_ContractStatus.browse")
@UiDescriptor("contract-status-browse.xml")
@LookupComponent("contractStatusesTable")
@LoadDataBeforeShow
class ContractStatusBrowse : StandardLookup<ContractStatus>()