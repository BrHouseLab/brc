package com.brhouselab.brc.web.screens.department.metrology.measuredevicename

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.MeasureDeviceName

@UiController("brc_MeasureDeviceName.browse")
@UiDescriptor("measure-device-name-browse.xml")
@LookupComponent("measureDeviceNamesTable")
@LoadDataBeforeShow
class MeasureDeviceNameBrowse : StandardLookup<MeasureDeviceName>()