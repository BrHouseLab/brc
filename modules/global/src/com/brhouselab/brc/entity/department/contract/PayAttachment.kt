package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_PAY_ATTACHMENT")
@javax.persistence.Entity(name = "brc_PayAttachment")
open class PayAttachment : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = -5400932951863579710L
    }
}