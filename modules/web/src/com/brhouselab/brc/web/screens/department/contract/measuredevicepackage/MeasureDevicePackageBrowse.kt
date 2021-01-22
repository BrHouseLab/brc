package com.brhouselab.brc.web.screens.department.contract.measuredevicepackage

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.MeasureDevicePackage

@UiController("brc_MeasureDevicePackage.browse")
@UiDescriptor("measure-device-package-browse.xml")
@LookupComponent("measureDevicePackagesTable")
@LoadDataBeforeShow
class MeasureDevicePackageBrowse : StandardLookup<MeasureDevicePackage>()