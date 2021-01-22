package com.brhouselab.brc.entity.department.contract

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_WORKS_TYPE")
@javax.persistence.Entity(name = "brc_WorksType")
open class WorksType : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = -4801687407191031319L
    }
}