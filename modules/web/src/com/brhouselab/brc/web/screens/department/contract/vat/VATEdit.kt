package com.brhouselab.brc.web.screens.department.contract.vat

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.contract.VAT

@UiController("brc_VAT.edit")
@UiDescriptor("vat-edit.xml")
@EditedEntityContainer("vATDc")
@LoadDataBeforeShow
class VATEdit : StandardEditor<VAT>()