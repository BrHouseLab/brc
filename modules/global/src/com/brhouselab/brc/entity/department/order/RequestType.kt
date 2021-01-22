package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import java.util.*
import javax.persistence.Column
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType

@NamePattern("%s|name")
@Table(name = "BRC_REQUEST_TYPE")
@javax.persistence.Entity(name = "brc_RequestType")
open class RequestType : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "SHORT_NAME", nullable = false)
    var shortName: String? = null

    @Column(name = "PERIOD_")
    var period: Int? = null

    companion object {
        private const val serialVersionUID = -6536148831342142474L
    }
}