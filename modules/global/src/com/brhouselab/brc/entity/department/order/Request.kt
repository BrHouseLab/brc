package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.Composition
import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.OnDelete
import com.haulmont.cuba.core.global.DeletePolicy
import java.util.*
import javax.persistence.*

@NamePattern("#namePattern|requestType,year")
@Table(name = "BRC_REQUEST")
@javax.persistence.Entity(name = "brc_Request")
open class Request : StandardEntity() {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REQUEST_TYPE_ID")
    var requestType: RequestType? = null

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "request")
    var requestItems: MutableList<RequestItem>? = mutableListOf()

    @Column(name = "NOTE", length = 500)
    var note: String? = null

    @Column(name = "IS_CLOSE", nullable = false)
    var isClose: Boolean? = false

    @Temporal(TemporalType.DATE)
    @Column(name = "YEAR_", nullable = false)
    var year: Date? = null

    fun namePattern():String {
        return "${requestType?.name} $year"
    }

    companion object {
        private const val serialVersionUID = -698602234067165602L
    }
}