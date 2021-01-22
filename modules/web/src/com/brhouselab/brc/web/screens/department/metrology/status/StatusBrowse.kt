package com.brhouselab.brc.web.screens.department.metrology.status

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.StatusItem

@UiController("brc_Status.browse")
@UiDescriptor("status-browse.xml")
@LookupComponent("statusesTable")
@LoadDataBeforeShow
class StatusBrowse : StandardLookup<StatusItem>()