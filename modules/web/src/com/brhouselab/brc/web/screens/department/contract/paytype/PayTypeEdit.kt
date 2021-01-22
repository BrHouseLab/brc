package com.brhouselab.brc.web.screens.department.contract.paytype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.PayType

@UiController("brc_PayType.edit")
@UiDescriptor("pay-type-edit.xml")
@EditedEntityContainer("payTypeDc")
@LoadDataBeforeShow
class PayTypeEdit : StandardEditor<PayType>()