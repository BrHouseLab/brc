package com.brhouselab.brc.entity.department.contract

import com.brhouselab.brc.entity.department.metrology.MeasuringDevice
import com.brhouselab.brc.entity.department.metrology.Position
import com.brhouselab.brc.entity.department.metrology.Status
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import java.time.LocalDateTime
import javax.persistence.*

@NamePattern("%s -> %s|fromPosition,toDestination")
@Table(name = "BRC_MEASURE_DEVICE_PACKAGE")
@javax.persistence.Entity(name = "brc_MeasureDevicePackage")
open class MeasureDevicePackage : StandardEntity() {
    @Lookup(type = LookupType.SCREEN, actions = ["open"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FROM_POSITION_ID")
    var fromPosition: Position? = null

    @Lookup(type = LookupType.SCREEN, actions = ["open"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TO_DESTINATION_ID")
    var toDestination: Position? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACT_ID")
    var contract: Contract? = null

    @Column(name = "TO_STATUS", nullable = false)
    private var toStatus: String? = null

    @OrderBy("name")
    @JoinTable(
        name = "BRC_MEASURE_DEVICE_PACKAGE_MEASURING_DEVICE_LINK",
        joinColumns = [JoinColumn(name = "MEASURE_DEVICE_PACKAGE_ID")],
        inverseJoinColumns = [JoinColumn(name = "MEASURING_DEVICE_ID")]
    )
    @ManyToMany
    var mdPackage: MutableList<MeasuringDevice>? = mutableListOf()

    @Column(name = "NOTE")
    var note: String? = null

    @Column(name = "DONE_DATE")
    var doneDate: LocalDateTime? = null

    fun getToStatus(): Status? = toStatus?.let { Status.fromId(it) }

    fun setToStatus(toStatus: Status?) {
        this.toStatus = toStatus?.id
    }

    companion object {
        private const val serialVersionUID = -3609985288715076276L
    }
}