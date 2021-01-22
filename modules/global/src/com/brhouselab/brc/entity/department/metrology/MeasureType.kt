package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s (%s)|name, code")
@Table(name = "BRC_MEASURE_TYPE")
@javax.persistence.Entity(name = "brc_MeasureType")
open class MeasureType : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "CODE", nullable = false)
    var code: Int? = null

    @Column(name = "DESCRIPTION", nullable = false)
    var description: String? = null

    companion object {
        private const val serialVersionUID = 7964273268084190529L
    }
}