package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s %s|type,number")
@Table(name = "BRC_ACCOUNTING")
@javax.persistence.Entity(name = "brc_Accounting")
open class Accounting : StandardEntity() {
    @Column(name = "TYPE_", nullable = false)
    private var type: String? = null

    @Column(name = "NUMBER_", nullable = false)
    var number: String? = null

    @Column(name = "DATE_", nullable = false)
    var date: LocalDate? = null

    @Column(name = "DESCRIPTION")
    var description: String? = null

    fun getType(): AccountingType? = type?.let { AccountingType.fromId(it) }

    fun setType(type: AccountingType?) {
        this.type = type?.id
    }

    companion object {
        private const val serialVersionUID = 8030460888163026220L
    }
}