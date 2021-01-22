package com.brhouselab.brc.web.screens.department.contract.payattachment

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.PayAttachment

@UiController("brc_PayAttachment.edit")
@UiDescriptor("pay-attachment-edit.xml")
@EditedEntityContainer("payAttachmentDc")
@LoadDataBeforeShow
class PayAttachmentEdit : StandardEditor<PayAttachment>()