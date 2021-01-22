package com.brhouselab.brc.web.screens.department.metrology.passport

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Passport

@UiController("brc_Passport.edit")
@UiDescriptor("passport-edit.xml")
@EditedEntityContainer("passportDc")
@LoadDataBeforeShow
class PassportEdit : StandardEditor<Passport>()