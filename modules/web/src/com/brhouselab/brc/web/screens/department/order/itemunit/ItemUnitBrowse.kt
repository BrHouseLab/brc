package com.brhouselab.brc.web.screens.department.order.itemunit

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.ItemUnit

@UiController("brc_ItemUnit.browse")
@UiDescriptor("item-unit-browse.xml")
@LookupComponent("itemUnitsTable")
@LoadDataBeforeShow
class ItemUnitBrowse : StandardLookup<ItemUnit>()