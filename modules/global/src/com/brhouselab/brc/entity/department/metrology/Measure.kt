package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import javax.persistence.*

@NamePattern("%s|name")
@Table(name = "BRC_MEASURE")
@javax.persistence.Entity(name = "brc_Measure")
open class Measure : StandardEntity() {

    @Lookup(type = LookupType.SCREEN, actions = ["open"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "POSITION_ID")
    var position: Position? = null

    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "open"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CALI_UP_TYPE_ID")
    var caliUpType: CaliUpType? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "clear"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MEASURE_TYPE_ID")
    var measureType: MeasureType? = null

    @Column(name = "RED_VALUE")
    var redValue: Double? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RED_VALUE_UNIT_ID")
    var redValueUnit: Unit? = null

    @Column(name = "SCHEME")
    var scheme: String? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTACHMENT_ID")
    var attachment: Attachment? = null

    @Column(name = "ACCURACY")
    var accuracy: String? = null

    @Column(name = "NOTE")
    var note: String? = null

    @Column(name = "KKS")
    var kks: String? = null

    companion object {
        private const val serialVersionUID = 1796050485655610238L
    }
}