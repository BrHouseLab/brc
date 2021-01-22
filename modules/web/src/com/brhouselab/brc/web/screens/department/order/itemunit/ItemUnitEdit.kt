package com.brhouselab.brc.web.screens.department.order.itemunit

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.ItemUnit

@UiController("brc_ItemUnit.edit")
@UiDescriptor("item-unit-edit.xml")
@EditedEntityContainer("itemUnitDc")
@LoadDataBeforeShow
class ItemUnitEdit : StandardEditor<ItemUnit>()