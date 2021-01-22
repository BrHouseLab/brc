package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_ITEM_UNIT")
@javax.persistence.Entity(name = "brc_ItemUnit")
open class ItemUnit : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = -7314956308071493869L
    }
}