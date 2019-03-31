package com.opentek.catapult.core.models.migrations;


import java.util.ArrayList;

public class ColumnBuilder {
    private String columnName;
    private Column column;
    private ArrayList<Column> columns;
    public ColumnBuilder(String columnName, String datatype, ArrayList<Column> columns) {
        this.columns = columns;
        this.columnName = columnName;
        this.column = new Column();
        this.column.setName(columnName);
        this.column.setType(datatype);
    }
    public ColumnBuilder unique(){
        this.column.setUnique(true);
        return this;
    }
    public ColumnBuilder defaultValue(String value){
        this.column.setDefaultValue(value);
        return this;
    }

    public ColumnBuilder primaryKey(){
        this.column.setPrimary(true);
        return this;
    }
    public ColumnBuilder reference(String ref){
        if(ref == null || ref.equals(""))
            throw new IllegalArgumentException("invalid reference");
        this.column.setReference(ref);
        return this;
    }
    public ColumnBuilder notnull(boolean notnull){
        this.column.setNotnull(notnull);
        return this;
    }
    public void build(){
        this.columns.add(this.column);
    }
    public ColumnBuilder length(int length){
        if(length < 0)
            throw new IllegalArgumentException("length cannot be negative");
        return this;
    }
}
