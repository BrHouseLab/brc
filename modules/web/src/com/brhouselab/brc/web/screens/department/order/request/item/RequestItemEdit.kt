package com.brhouselab.brc.web.screens.department.order.request.item

import com.brhouselab.brc.entity.department.order.Category
import com.brhouselab.brc.entity.department.order.Item
import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.RequestItem
import com.haulmont.cuba.gui.components.HasValue
import com.haulmont.cuba.gui.components.LookupPickerField
import javax.inject.Inject

@UiController("brc_RequestItem.edit")
@UiDescriptor("request-item-edit.xml")
@EditedEntityContainer("requestItemDc")
@LoadDataBeforeShow
class RequestItemEdit : StandardEditor<RequestItem>() {
    @Inject
    private lateinit var categoryField: LookupPickerField<Category>

    @Subscribe("itemField")
    private fun onItemFieldValueChange(event: HasValue.ValueChangeEvent<Item>) {
        categoryField.value = event.value?.category
    }
}