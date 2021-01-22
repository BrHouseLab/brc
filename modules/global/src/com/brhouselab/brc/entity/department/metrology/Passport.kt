package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.*

@NamePattern("%s|number")
@Table(name = "BRC_PASSPORT")
@javax.persistence.Entity(name = "brc_Passport")
open class Passport : StandardEntity() {
    @Column(name = "NUMBER_", nullable = false)
    var number: Int? = null

    @JoinTable(
        name = "BRC_PASSPORT_MEASURING_DEVICE_LINK",
        joinColumns = [JoinColumn(name = "PASSPORT_ID")],
        inverseJoinColumns = [JoinColumn(name = "MEASURING_DEVICE_ID")]
    )
    @ManyToMany
    var devices: MutableList<MeasuringDevice>? = mutableListOf()

    companion object {
        private const val serialVersionUID = -193449255580940229L
    }
}