package com.brhouselab.brc.web.screens.department.metrology.accounting

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Accounting

@UiController("brc_Accounting.edit")
@UiDescriptor("accounting-edit.xml")
@EditedEntityContainer("accountingDc")
@LoadDataBeforeShow
class AccountingEdit : StandardEditor<Accounting>()