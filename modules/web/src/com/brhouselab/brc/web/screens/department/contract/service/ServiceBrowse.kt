package com.brhouselab.brc.web.screens.department.contract.service

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.Service

@UiController("brc_Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
@LoadDataBeforeShow
class ServiceBrowse : StandardLookup<Service>()