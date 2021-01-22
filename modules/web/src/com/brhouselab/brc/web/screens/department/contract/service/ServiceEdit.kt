package com.brhouselab.brc.web.screens.department.contract.service

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.Service

@UiController("brc_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
class ServiceEdit : StandardEditor<Service>()