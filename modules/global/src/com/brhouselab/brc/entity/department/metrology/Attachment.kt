package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import javax.persistence.*

@NamePattern("%s|name")
@Table(name = "BRC_ATTACHMENT")
@javax.persistence.Entity(name = "brc_Attachment")
open class Attachment : StandardEntity() {
    @Lookup(type = LookupType.DROPDOWN, actions = ["open"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTACHMENT_NODE_ID")
    var attachmentNode: Attachment? = null

    @Column(name = "NAME", nullable = false)
    var name: String? = null

    companion object {
        private const val serialVersionUID = 795473869767870350L
    }
}