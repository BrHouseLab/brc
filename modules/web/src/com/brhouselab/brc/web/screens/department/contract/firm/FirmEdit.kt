package com.brhouselab.brc.web.screens.department.contract.firm

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.Firm

@UiController("brc_Firm.edit")
@UiDescriptor("firm-edit.xml")
@EditedEntityContainer("firmDc")
@LoadDataBeforeShow
class FirmEdit : StandardEditor<Firm>()