package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.Composition
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.chile.core.annotations.NumberFormat
import com.haulmont.cuba.core.app.UniqueNumbersService
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import com.haulmont.cuba.core.entity.annotation.OnDelete
import com.haulmont.cuba.core.global.AppBeans
import com.haulmont.cuba.core.global.DeletePolicy
import javax.annotation.PostConstruct
import javax.persistence.*

@NamePattern("%s %s|name,series")
@Table(name = "BRC_MEASURING_DEVICE")
@javax.persistence.Entity(name = "brc_MeasuringDevice")
open class MeasuringDevice : StandardEntity() {
    @NumberFormat(pattern = "000,000,000", groupingSeparator = "-")
    @Column(name = "BARCODE", nullable = false, unique = true)
    var barcode: Long? = null
    private set

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NAME_ID")
    var name: MeasureDeviceName? = null

    @Column(name = "SERIES", nullable = false)
    var series: String? = null

    @Column(name = "FACTORY_NUMBER", nullable = false)
    var factoryNumber: String? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MEASURE_TYPE_ID")
    var measureType: MeasureType? = null

    @Column(name = "LOW_LEVEL")
    var lowLevel: Double? = null

    @Column(name = "HIGHT_LEVEL")
    var highLevel: Double? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIT_ID")
    var unit: Unit? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CALI_UP_INTERVAL_ID")
    var caliUpInterval: CaliUpInterval? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CALI_UP_ID")
    var caliUp: CaliUp? = null

    @Column(name = "ACCURANCY", nullable = false)
    var accuracy: String? = null

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PASSPORT_ID")
    var passport: Passport? = null

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNTING_ID")
    var accounting: Accounting? = null

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTACHMENT_ID")
    var attachment: Attachment? = null

    @Column(name = "NOTE")
    var note: String? = null

    @OrderBy("createTs DESC")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "measuringDevice")
    var statuses: MutableList<StatusItem>? = mutableListOf()

    @PostLoad
    open fun postLoad() {
    val generator = AppBeans.get(UniqueNumbersService::class.java)

        barcode = generator.getNextNumber(this::javaClass.name)
    }

    @PostConstruct
    open fun postConstruct() {
        val generator = AppBeans.get(UniqueNumbersService::class.java)

        barcode = generator.getNextNumber(this::javaClass.name)
    }

    companion object {
        private const val serialVersionUID = 4322013974193524905L
    }
}