package com.brhouselab.brc.web.screens.department.order.category

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Category

@UiController("brc_Category.edit")
@UiDescriptor("category-edit.xml")
@EditedEntityContainer("categoryDc")
@LoadDataBeforeShow
class CategoryEdit : StandardEditor<Category>()