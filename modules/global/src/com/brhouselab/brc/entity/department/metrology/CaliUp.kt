package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.Composition
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.FileDescriptor
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import com.haulmont.cuba.core.entity.annotation.OnDelete
import com.haulmont.cuba.core.global.DeletePolicy
import java.time.LocalDate
import javax.persistence.*

@NamePattern("%s %s|caliUpType,date")
@Table(name = "BRC_CALI_UP")
@javax.persistence.Entity(name = "brc_CaliUp")
open class CaliUp : StandardEntity() {
    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CALI_UP_TYPE_ID")
    var caliUpType: CaliUpType? = null

    @Column(name = "DATE_", nullable = false)
    var date: LocalDate? = null

    @Column(name = "NUMBER_")
    var number: String? = null

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_ID")
    var document: FileDescriptor? = null

    @OneToMany(mappedBy = "caliUp")
    var measureDevice: MutableList<MeasuringDevice>? = mutableListOf()

    companion object {
        private const val serialVersionUID = 8479509178213137131L
    }
}