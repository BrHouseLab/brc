package com.brhouselab.brc.web.screens.department.metrology.attachment

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Attachment

@UiController("brc_Attachment.edit")
@UiDescriptor("attachment-edit.xml")
@EditedEntityContainer("attachmentDc")
@LoadDataBeforeShow
class AttachmentEdit : StandardEditor<Attachment>()