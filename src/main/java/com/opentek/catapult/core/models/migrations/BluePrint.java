package com.opentek.catapult.core.models.migrations;

import java.util.ArrayList;

public class BluePrint {
    private final static String INTEGER = "INT";
    private String tableName;
    private ArrayList<Column> columns;
//    protected ColumnBuilder
    protected BluePrint(String tableName){
        this.tableName = tableName;
        this.columns = new ArrayList<>();
    }

    public ColumnBuilder integer(String columnName){
        return new ColumnBuilder(columnName,INTEGER, columns);
    }
}
