package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import javax.persistence.*

@NamePattern("%s|name")
@Table(name = "BRC_ITEM")
@javax.persistence.Entity(name = "brc_Item")
open class Item : StandardEntity() {
    @Column(name = "NAME", nullable = false, length = 500)
    var name: String? = null

    @Column(name = "CODE")
    var code: Int? = null

    @Column(name = "SPECIFIC_")
    var specific: Int? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORY_ID")
    var category: Category? = null

    @Column(name = "COST", nullable = false)
    var cost: Double? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UNIT_ID")
    var unit: ItemUnit? = null

    @Column(name = "TECH_SPECIFICATION", length = 1000)
    var techSpecification: String? = null

    companion object {
        private const val serialVersionUID = -586141498044917239L
    }
}