package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_CONTRACT_STATUS")
@javax.persistence.Entity(name = "brc_ContractStatus")
open class ContractStatus : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = 8084866830163373858L
    }
}