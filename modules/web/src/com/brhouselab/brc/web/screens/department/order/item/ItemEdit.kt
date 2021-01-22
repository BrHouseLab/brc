package com.brhouselab.brc.web.screens.department.order.item

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Item

@UiController("brc_Item.edit")
@UiDescriptor("item-edit.xml")
@EditedEntityContainer("itemDc")
@LoadDataBeforeShow
class ItemEdit : StandardEditor<Item>()