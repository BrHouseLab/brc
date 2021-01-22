package com.brhouselab.brc.web.screens.department.contract.workstype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.WorksType

@UiController("brc_WorksType.browse")
@UiDescriptor("works-type-browse.xml")
@LookupComponent("worksTypesTable")
@LoadDataBeforeShow
class WorksTypeBrowse : StandardLookup<WorksType>()