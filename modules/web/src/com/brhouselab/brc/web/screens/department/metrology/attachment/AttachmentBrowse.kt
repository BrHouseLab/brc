package com.brhouselab.brc.web.screens.department.metrology.attachment

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Attachment

@UiController("brc_Attachment.browse")
@UiDescriptor("attachment-browse.xml")
@LookupComponent("attachmentsTable")
@LoadDataBeforeShow
class AttachmentBrowse : StandardLookup<Attachment>()