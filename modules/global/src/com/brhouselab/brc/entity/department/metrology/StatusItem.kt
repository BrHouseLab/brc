package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.FileDescriptor
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.security.entity.User
import javax.persistence.*

@NamePattern(value = "%s|status")
@Table(name = "BRC_STATUS_ITEM")
@javax.persistence.Entity(name = "brc_StatusItem")
open class StatusItem : StandardEntity() {

    @Column(name = "STATUS", nullable = false)
    private var status: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    var user: User? = null

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DOCUMENT_ID")
    var document: FileDescriptor? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MEASURING_DEVICE_ID")
    var measuringDevice: MeasuringDevice? = null

    fun getStatus(): Status? = status?.let { Status.fromId(it) }

    fun setStatus(status: Status?) {
        this.status = status?.id
    }

    companion object {
        private const val serialVersionUID = 9207047182970795254L
    }
}