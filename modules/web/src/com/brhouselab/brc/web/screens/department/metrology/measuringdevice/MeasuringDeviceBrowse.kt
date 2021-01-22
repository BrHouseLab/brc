package com.brhouselab.brc.web.screens.department.metrology.measuringdevice

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.MeasuringDevice

@UiController("brc_MeasuringDevice.browse")
@UiDescriptor("measuring-device-browse.xml")
@LookupComponent("measuringDevicesTable")
@LoadDataBeforeShow
class MeasuringDeviceBrowse : StandardLookup<MeasuringDevice>()