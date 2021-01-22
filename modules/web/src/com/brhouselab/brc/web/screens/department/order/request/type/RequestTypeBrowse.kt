package com.brhouselab.brc.web.screens.department.order.request.type

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.RequestType

@UiController("brc_RequestType.browse")
@UiDescriptor("request-type-browse.xml")
@LookupComponent("requestTypesTable")
@LoadDataBeforeShow
class RequestTypeBrowse : StandardLookup<RequestType>()