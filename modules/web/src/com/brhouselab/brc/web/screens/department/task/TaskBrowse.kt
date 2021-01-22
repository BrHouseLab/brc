package com.brhouselab.brc.web.screens.department.task

import com.haulmont.cuba.gui.screen.*
import com.brhouselab.brc.entity.department.task.Task

@UiController("brc_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
@LoadDataBeforeShow
class TaskBrowse : StandardLookup<Task>()