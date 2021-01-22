package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_CALI_UP_INTERVAL")
@javax.persistence.Entity(name = "brc_CaliUpInterval")
open class CaliUpInterval : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "PERIOD_", nullable = false)
    var period: Int? = null

    @Column(name = "NOTE")
    var note: String? = null

    companion object {
        private const val serialVersionUID = -7880798838445744482L
    }
}