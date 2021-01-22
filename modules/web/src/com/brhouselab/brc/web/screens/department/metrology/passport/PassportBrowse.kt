package com.brhouselab.brc.web.screens.department.metrology.passport

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.metrology.Passport

@UiController("brc_Passport.browse")
@UiDescriptor("passport-browse.xml")
@LookupComponent("passportsTable")
@LoadDataBeforeShow
class PassportBrowse : StandardLookup<Passport>()