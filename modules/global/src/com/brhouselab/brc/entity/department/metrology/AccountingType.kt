package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.datatypes.impl.EnumClass

enum class AccountingType(private val id: String) : EnumClass<String> {

    NOMENCLATURE("nomenclature"),
    INVENTORY("inventory");

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: String): AccountingType? = AccountingType.values().find { it.id == id }
    }
}