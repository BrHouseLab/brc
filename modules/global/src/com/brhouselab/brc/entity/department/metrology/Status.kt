package com.brhouselab.brc.entity.department.metrology

import com.haulmont.chile.core.datatypes.impl.EnumClass

enum class Status(private val id: String) : EnumClass<String> {

    NEW("new"),
    WORK("work"),
    FIX("fix"),
    NEED_FIX("need_fix"),
    TRANSIT("transit"),
    CALI_UP("cali-up"),
    STORAGE("storage")
    ;

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: String): Status? = Status.values().find { it.id == id }
    }
}