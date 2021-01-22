package com.brhouselab.brc.web.screens.department.order.order

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Order

@UiController("brc_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
class OrderBrowse : StandardLookup<Order>()