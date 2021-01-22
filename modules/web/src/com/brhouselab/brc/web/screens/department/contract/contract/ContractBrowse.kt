package com.brhouselab.brc.web.screens.department.contract.contract

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.Contract
import com.haulmont.cuba.gui.UiComponents
import com.haulmont.cuba.gui.components.Component
import com.haulmont.cuba.gui.components.Label
import javax.inject.Inject

@UiController("brc_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
class ContractBrowse : StandardLookup<Contract>() {
    @Inject
    private lateinit var uiComponents: UiComponents

    @Install(to = "contractsTable.totalPays", subject = "columnGenerator")
    private fun contractsTableTotalPaysColumnGenerator(contract: Contract?): Component {
        return uiComponents.create(Label::class.java).apply {
            value = contract?.orders?.sumByDouble { it.cost ?: 0.0 }
        }
    }

    @Install(to = "contractsTable.mod", subject = "columnGenerator")
    private fun contractsTableModColumnGenerator(contract: Contract?): Component {
        return uiComponents.create(Label::class.java).apply {
            value = (contract?.cost ?: 0.0) - (contract?.orders?.sumByDouble { it.cost ?: 0.0 } ?: 0.0)
        }
    }
}