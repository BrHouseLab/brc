package com.brhouselab.brc.entity.department.order

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Table

@NamePattern("%s|name")
@Table(name = "BRC_CATEGORY")
@javax.persistence.Entity(name = "brc_Category")
open class Category : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "ARTICLE")
    var article: String? = null

    companion object {
        private const val serialVersionUID = -4735027091830436760L
    }
}