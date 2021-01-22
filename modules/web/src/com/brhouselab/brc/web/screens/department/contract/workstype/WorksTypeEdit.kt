package com.brhouselab.brc.web.screens.department.contract.workstype

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.WorksType

@UiController("brc_WorksType.edit")
@UiDescriptor("works-type-edit.xml")
@EditedEntityContainer("worksTypeDc")
@LoadDataBeforeShow
class WorksTypeEdit : StandardEditor<WorksType>()