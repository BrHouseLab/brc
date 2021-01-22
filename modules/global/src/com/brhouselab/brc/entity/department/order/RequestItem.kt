package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.MetaProperty
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import java.util.*
import javax.persistence.*

@NamePattern("%s:%s|item,value")
@Table(name = "BRC_REQUEST_ITEM")
@javax.persistence.Entity(name = "brc_RequestItem")
open class RequestItem : StandardEntity() {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REQUEST_ID")
    var request: Request? = null

    @Lookup(type = LookupType.SCREEN, actions = [])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ITEM_ID")
    var item: Item? = null

    @Column(name = "VALUE_", nullable = false)
    var value: Int? = null

    @Column(name = "NOTE", length = 500)
    var note: String? = null

    @Column(name = "CONSUMER")
    var consumer: String? = null

    @Temporal(TemporalType.DATE)
    @Column(name = "DELIVERY_DATE")
    var deliveryDate: Date? = null

    @Transient
    @MetaProperty
    var totalCost: Double? = null

    companion object {
        private const val serialVersionUID = 1318402334937135418L
    }

    @PostLoad
    open fun postLoad() {
        calcTotalCost()
    }

    @PostUpdate
    open fun postUpdate() {
        calcTotalCost()
    }

    private fun calcTotalCost(){
        val cost = item?.cost ?: 0.0
        val count = value?.toDouble() ?: 0.0
        totalCost = cost * count
    }
}