package com.model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UsersTable {
    DefaultTableModel usersTable = new DefaultTableModel(new Object[][] {
            { "some", "text" }, { "any", "text" }, { "even", "more" },
            { "text", "strings" }, { "and", "other" }, { "text", "values" } },
            new Object[] { "Column 1", "Column 2" });
}
