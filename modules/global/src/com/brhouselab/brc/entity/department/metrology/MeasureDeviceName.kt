package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import javax.persistence.*

@NamePattern("%s|name")
@Table(name = "BRC_MEASURE_DEVICE_NAME")
@javax.persistence.Entity(name = "brc_MeasureDeviceName")
open class MeasureDeviceName : StandardEntity() {
    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURE_DEVICE_NODE_ID")
    var measureDeviceNode: MeasureDeviceName? = null

    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = -1897426251939750483L
    }
}