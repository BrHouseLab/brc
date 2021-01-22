package com.brhouselab.brc.web.screens.department.order.request.type

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.order.RequestType

@UiController("brc_RequestType.edit")
@UiDescriptor("request-type-edit.xml")
@EditedEntityContainer("requestTypeDc")
@LoadDataBeforeShow
class RequestTypeEdit : StandardEditor<RequestType>()