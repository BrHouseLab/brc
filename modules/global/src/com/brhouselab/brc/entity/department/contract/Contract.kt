package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.Composition
import com.haulmont.chile.core.annotations.MetaProperty
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.*
import com.haulmont.cuba.core.global.DeletePolicy
import java.time.LocalDate
import javax.persistence.*

@NamePattern(value = "%s (%s, %s)|firm, number, contractDate")
@Table(name = "BRC_CONTRACT")
@javax.persistence.Entity(name = "brc_Contract")
open class Contract : StandardEntity() {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FIRM_ID")
    var firm: Firm? = null

    @Column(name = "NUMBER_", nullable = false)
    var number: String? = null

    @Column(name = "CONTRACT_DATE", nullable = false)
    var contractDate: LocalDate? = null

    @CurrencyValue(currency = "BYN")
    @Column(name = "COST", nullable = false)
    var cost: Double? = null

    @Column(name = "WITH_VAT", nullable = false)
    var withVAT: Boolean? = false

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VALUE_OF_VAT_ID")
    var valueOfVAT: VAT? = null

    @Transient
    @MetaProperty(related = ["cost", "withVAT"])
    @CurrencyValue(currency = "BYN")
    var costVAT: Double? = null

    @Column(name = "EXPIRED_DATE", nullable = false)
    var expiredDate: LocalDate? = null

    @Column(name = "DESCRIPTION", nullable = false, length = 500)
    var description: String? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "WORKS_TYPE_ID")
    var worksType: WorksType? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAY_TYPE_ID")
    var payType: PayType? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAY_ATTACHMENT_ID")
    var payAttachment: PayAttachment? = null

    @Column(name = "NOTE", length = 500)
    var note: String? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATUS_ID")
    var status: ContractStatus? = null

    @OrderBy("date DESC")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "contract")
    var orders: MutableList<ContractOrder>? = mutableListOf()

    companion object {
        private const val serialVersionUID = -2780644579410632137L
    }

    @PostLoad
    open fun postLoad() {
        if (withVAT == true) {
            costVAT = (valueOfVAT?.value ?: 0.0) * (cost ?: 0.0)
        }
    }
}