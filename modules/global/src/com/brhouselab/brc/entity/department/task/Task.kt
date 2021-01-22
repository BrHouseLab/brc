package com.brhouselab.brc.entity.department.task

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import com.haulmont.cuba.security.entity.User
import java.time.LocalDateTime
import javax.persistence.*

@NamePattern("%s %s|createTs,description")
@Table(name = "BRC_TASK")
@javax.persistence.Entity(name = "brc_Task")
open class Task : StandardEntity() {
    @Column(name = "DESCRIPTION", nullable = false, length = 500)
    var description: String? = null

    @Lookup(type = LookupType.DROPDOWN, actions = ["lookup", "open", "clear"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXECUTOR_ID")
    var executor: User? = null

    @Column(name = "DATE_TO")
    var dateTo: LocalDateTime? = null

    @Column(name = "RESULTS", length = 1000)
    var results: String? = null

    @Column(name = "DONE_DATE")
    var doneDate: LocalDateTime? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FROM_ID")
    var from: User? = null

    companion object {
        private const val serialVersionUID = 4847138760424440175L
    }
}