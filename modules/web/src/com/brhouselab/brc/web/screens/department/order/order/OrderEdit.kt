package com.brhouselab.brc.web.screens.department.order.order

import com.brhouselab.brc.entity.department.order.Category
import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Order
import com.brhouselab.brc.entity.department.order.Request
import com.haulmont.cuba.gui.components.Form
import com.haulmont.cuba.gui.components.HasValue
import com.haulmont.cuba.gui.components.LookupPickerField
import javax.inject.Inject

@UiController("brc_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
class OrderEdit : StandardEditor<Order>() {
    @Inject
    private lateinit var form: Form

    @Inject
    private lateinit var categoryField: LookupPickerField<Category>

    @Subscribe("requestField")
    private fun onRequestFieldValueChange(event: HasValue.ValueChangeEvent<Request>) {
        categoryField.isVisible = event.value != null
    }

    @Subscribe("categoryField")
    private fun onCategoryFieldValueChange(event: HasValue.ValueChangeEvent<Category>) {
        form.isVisible = event.value != null
    }

}