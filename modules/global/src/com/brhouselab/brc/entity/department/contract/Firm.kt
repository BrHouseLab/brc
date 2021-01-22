package com.brhouselab.brc.entity.department.contract

import com.brhouselab.brc.entity.department.metrology.Position
import com.haulmont.chile.core.annotations.Composition
import com.haulmont.cuba.core.entity.StandardEntity
import com.haulmont.cuba.core.entity.annotation.Lookup
import com.haulmont.cuba.core.entity.annotation.LookupType
import com.haulmont.cuba.core.entity.annotation.OnDelete
import com.haulmont.cuba.core.global.DeletePolicy
import javax.persistence.*

@Table(name = "BRC_FIRM")
@javax.persistence.Entity(name = "brc_Firm")
open class Firm : StandardEntity() {
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "SHORT_NAME", nullable = false)
    var shortName: String? = null

    @Lookup(type = LookupType.SCREEN, actions = ["lookup", "open"])
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSITION_ID")
    var position: Position? = null

    @OrderBy("createTs DESC")
    @Composition
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "firm")
    var contracts: MutableList<Contract>? = mutableListOf()

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "firm")
    var services: MutableList<Service>? = mutableListOf()

    companion object {
        private const val serialVersionUID = 7926705076237479960L
    }
}