package com.brhouselab.brc.web.screens.department.contract.measuredevicepackage

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.MeasureDevicePackage

@UiController("brc_MeasureDevicePackage.edit")
@UiDescriptor("measure-device-package-edit.xml")
@EditedEntityContainer("measureDevicePackageDc")
@LoadDataBeforeShow
class MeasureDevicePackageEdit : StandardEditor<MeasureDevicePackage>()