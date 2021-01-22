package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import java.util.*
import javax.persistence.*

@NamePattern("%s:%s|date,requestItem")
@Table(name = "BRC_ORDER")
@javax.persistence.Entity(name = "brc_Order")
open class Order : StandardEntity() {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REQUEST_ITEM_ID")
    var requestItem: RequestItem? = null

    @Column(name = "VALUE_", nullable = false)
    var value: Int? = null

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    var date: Date? = null

    @Column(name = "NUMBER_")
    var number: Int? = null

    @Column(name = "NOTE")
    var note: String? = null

    companion object {
        private const val serialVersionUID = -4401948094225895692L
    }
}