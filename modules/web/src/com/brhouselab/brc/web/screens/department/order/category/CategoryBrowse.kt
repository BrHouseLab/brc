package com.brhouselab.brc.web.screens.department.order.category

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Category

@UiController("brc_Category.browse")
@UiDescriptor("category-browse.xml")
@LookupComponent("categoriesTable")
@LoadDataBeforeShow
class CategoryBrowse : StandardLookup<Category>()