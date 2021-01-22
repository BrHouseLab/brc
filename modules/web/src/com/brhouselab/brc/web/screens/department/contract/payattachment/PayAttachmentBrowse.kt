package com.brhouselab.brc.web.screens.department.contract.payattachment

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.PayAttachment

@UiController("brc_PayAttachment.browse")
@UiDescriptor("pay-attachment-browse.xml")
@LookupComponent("payAttachmentsTable")
@LoadDataBeforeShow
class PayAttachmentBrowse : StandardLookup<PayAttachment>()