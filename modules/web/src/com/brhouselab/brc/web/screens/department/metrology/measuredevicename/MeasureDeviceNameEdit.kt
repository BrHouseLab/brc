package com.brhouselab.brc.web.screens.department.metrology.measuredevicename

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.MeasureDeviceName

@UiController("brc_MeasureDeviceName.edit")
@UiDescriptor("measure-device-name-edit.xml")
@EditedEntityContainer("measureDeviceNameDc")
@LoadDataBeforeShow
class MeasureDeviceNameEdit : StandardEditor<MeasureDeviceName>()