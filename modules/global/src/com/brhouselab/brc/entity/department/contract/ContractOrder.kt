package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.CurrencyValue
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import java.time.LocalDate
import javax.persistence.*

@NamePattern("%s - %s|contract,number")
@Table(name = "BRC_CONTRACT_ORDER")
@javax.persistence.Entity(name = "brc_ContractOrder")
open class ContractOrder : StandardEntity() {
    @Column(name = "DATE_", nullable = false)
    var date: LocalDate? = null

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CONTRACT_ID")
    var contract: Contract? = null

    @Column(name = "NUMBER_", nullable = false)
    var number: String? = null

    @CurrencyValue(currency = "BYN")
    @Column(name = "COST", nullable = false)
    var cost: Double? = null

    @Column(name = "STATUS", nullable = false)
    var status: String? = null

    @Column(name = "NOTE")
    var note: String? = null

    @JoinTable(
        name = "BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK",
        joinColumns = [JoinColumn(name = "CONTRACT_ORDER_ID")],
        inverseJoinColumns = [JoinColumn(name = "MEASURE_DEVICE_PACKAGE_ID")]
    )
    @ManyToMany
    var packageMD: MutableList<MeasureDevicePackage>? = mutableListOf()

    companion object {
        private const val serialVersionUID = 7404158832745589334L
    }
}