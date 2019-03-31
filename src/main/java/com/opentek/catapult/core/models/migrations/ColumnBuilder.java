package com.opentek.catapult.core.models.migrations;

import java.util.ArrayList;

public class ColumnBuilder {
    private String columnName;
    private Column column;
    private ArrayList<Column> columns;
    public ColumnBuilder(String columnName, String datatype, ArrayList<Column> columns) {
        this.columns = columns;
        this.columnName = columnName;
        this.column = new Column(this.columnName);
    }
    public ColumnBuilder unique(){
        return this;
    }
}
