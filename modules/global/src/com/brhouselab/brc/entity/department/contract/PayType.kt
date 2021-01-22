package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_PAY_TYPE")
@javax.persistence.Entity(name = "brc_PayType")
open class PayType : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = -6749961377397682708L
    }
}