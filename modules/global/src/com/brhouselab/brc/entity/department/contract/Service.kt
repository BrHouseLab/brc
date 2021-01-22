package com.brhouselab.brc.entity.department.contract

import com.brhouselab.brc.entity.department.metrology.MeasureDeviceName
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.CurrencyValue
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import org.hibernate.validator.constraints.Currency
import javax.persistence.*

@NamePattern("%s (%s)|name,cost")
@Table(name = "BRC_SERVICE")
@javax.persistence.Entity(name = "brc_Service")
open class Service : StandardEntity() {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FIRM_ID")
    var firm: Firm? = null

    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @CurrencyValue(currency = "BYN")
    @Column(name = "COST", nullable = false)
    var cost: Double? = null

    @Column(name = "CODE")
    var code: String? = null

    @JoinTable(
        name = "BRC_SERVICE_MEASURE_DEVICE_NAME_LINK",
        joinColumns = [JoinColumn(name = "SERVICE_ID")],
        inverseJoinColumns = [JoinColumn(name = "MEASURE_DEVICE_NAME_ID")]
    )
    @ManyToMany
    var targetMD: MutableList<MeasureDeviceName>? = mutableListOf()

    companion object {
        private const val serialVersionUID = 5536907751675256138L
    }
}