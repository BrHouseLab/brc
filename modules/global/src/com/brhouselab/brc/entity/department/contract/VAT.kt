package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|value")
@Table(name = "BRC_VAT")
@javax.persistence.Entity(name = "brc_VAT")
open class VAT : StandardEntity() {
    @Column(name = "VALUE_", nullable = false)
    var value: Double? = null

    @Column(name = "NOTE")
    var note: String? = null

    companion object {
        private const val serialVersionUID = 8923029878116163913L
    }
}