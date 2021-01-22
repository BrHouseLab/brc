package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_UNIT")
@javax.persistence.Entity(name = "brc_Unit")
open class Unit : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = 974316321761107405L
    }
}