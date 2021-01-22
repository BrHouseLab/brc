package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import javax.persistence.*

@NamePattern("%s|shortName")
@Table(name = "BRC_POSITION")
@javax.persistence.Entity(name = "brc_Position")
open class Position : StandardEntity() {
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "POSITION_NODE_ID")
    var positionNode: Position? = null

    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "SHORT_NAME", nullable = false)
    var shortName: String? = null

    @Column(name = "DESCRIPTION")
    var description: String? = null

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open"])
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTACHMENT_ID")
    var attachment: Attachment? = null

    companion object {
        private const val serialVersionUID = 5110768816573404884L
    }
}