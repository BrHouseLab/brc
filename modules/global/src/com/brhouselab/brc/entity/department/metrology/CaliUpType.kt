package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|shortName")
@Table(name = "BRC_CALI_UP_TYPE")
@javax.persistence.Entity(name = "brc_CaliUpType")
open class CaliUpType : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null


    @Column(name = "SHORT_NAME", nullable = false)
    var shortName: String? = null

    companion object {
        private const val serialVersionUID = 4066749450247745902L
    }
}