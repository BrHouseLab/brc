package com.brhouselab.brc.web.screens.department.order.request

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.Request

@UiController("brc_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("requestsTable")
@LoadDataBeforeShow
class RequestBrowse : StandardLookup<Request>()