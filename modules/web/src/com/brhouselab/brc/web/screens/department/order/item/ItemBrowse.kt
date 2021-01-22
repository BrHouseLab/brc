package com.brhouselab.brc.web.screens.department.order.item

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Item

@UiController("brc_Item.browse")
@UiDescriptor("item-browse.xml")
@LookupComponent("itemsTable")
@LoadDataBeforeShow
class ItemBrowse : StandardLookup<Item>()