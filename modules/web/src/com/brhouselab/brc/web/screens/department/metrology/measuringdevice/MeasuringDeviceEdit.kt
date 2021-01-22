package com.brhouselab.brc.web.screens.department.metrology.measuringdevice

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.MeasuringDevice
import com.brhouselab.brc.entity.department.metrology.Status
import com.brhouselab.brc.entity.department.metrology.StatusItem
import com.haulmont.cuba.core.global.Metadata
import com.haulmont.cuba.core.global.MetadataTools
import com.haulmont.cuba.security.global.UserSession
import javax.inject.Inject

@UiController("brc_MeasuringDevice.edit")
@UiDescriptor("measuring-device-edit.xml")
@EditedEntityContainer("measuringDeviceDc")
@LoadDataBeforeShow
class MeasuringDeviceEdit : StandardEditor<MeasuringDevice>() {
    @Inject
    private lateinit var metadata: Metadata

    @Inject
    private lateinit var metadataTools: MetadataTools

    @Inject
    private lateinit var userSession: UserSession

    @Subscribe
    private fun onInitEntity(event: InitEntityEvent<MeasuringDevice>) {
        val status = metadata.create(StatusItem::class.java)
        status.apply {
            setStatus(Status.NEW)
            user = userSession.currentOrSubstitutedUser
        }
        event.entity.statuses?.add(status)
    }
}