package com.opentek.catapult.core.models.migrations;

import com.opentek.catapult.core.exceptions.InvalidSchemaException;

import java.util.ArrayList;

/**
 * DATATYPE'S Available:
 * Numeric:
 *  tinyint
 *  smallint
 *  mediumint
 *  int
 *  bigint
 *
 *  decimal
 *  float
 *  double
 *  real
 *
 *  bit
 *  boolean
 *  serial
 *
 * Datetime:
 *  date
 *  datetime
 *  timestamp
 *  time
 *  year
 *
 * Unicode String:
 *  nchar
 *  nvarchar
 *  ntext
 *
 * String:
 *  varchar
 *  char
 *
 *  tinytext
 *  text
 *  mediumtext
 *  longtext
 *
 *  binary
 *  varbinary
 *
 *  tinyblob
 *  blob
 *  mediumblob
 *  longblob
 *
 *  enum
 *  set
 *
 * Miscellaneous:
 *  cblob
 *  xml
 *  json
 */
public class BluePrint {
    private final static String TINYINT = "TINYINT";
    private final static String SMALLINT = "SMALLINT";
    private final static String MEDIUMINT = "MEDIUMINT";
    private final static String INTEGER = "INT";
    private final static String BIGINT = "BIGINT";
    private final static String DECIMAL = "DECIMAL";
    private final static String FLOAT = "FLOAT";
    private final static String DOUBLE = "DOUBLE";
    private final static String REAL = "REAL";
    private static final String BIT = "BIT";
    private static final String SERIAL = "SERIAL";
    private static final String DATE = "DATE";
    private static final String DATETIME = "DATETIME";
    private static final String TIMESTAMP = "TIMESTAMP";
    private static final String TIME = "TIME";
    private static final String YEAR = "YEAR";
    private static final String CHAR = "CHAR";
    private static final String VARCHAR = "VARCHAR";
    private static final String TINYTEXT = "TINYTEXT";
    private static final String TEXT = "TEXT";
    private static final String MEDIUMTEXT = "MEDIUMTEXT";
    private static final String LONGTEXT = "LONGTEXT";
    private static final String BINARY = "BINARY";
    private static final String VARBINARY = "VARBINARY";
    private static final String TINYBLOB = "TINYBLOB";
    private static final String BLOB = "BLOB";
    private static final String MEDIUMBLOB = "MEDIUMBLOB";
    private static final String LONGBLOB = "LONGBLOB";
    private static final String ENUM = "ENUM";
    private static final String SET = "SET";


    private String tableName;
    private ArrayList<Column> columns;
//    protected ColumnBuilder
    protected BluePrint(String tableName){
        this.tableName = tableName;
        this.columns = new ArrayList<>();
    }
    public ColumnBuilder tinyint(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,TINYINT, columns);
    }
    public ColumnBuilder smallint(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,SMALLINT, columns);
    }
    public ColumnBuilder mediumint(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,MEDIUMINT, columns);
    }
    public ColumnBuilder integer(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,INTEGER, columns);
    }
    public ColumnBuilder bigint(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,BIGINT, columns);
    }
    public ColumnBuilder decimal(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,DECIMAL, columns);
    }
    public ColumnBuilder floatType(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,FLOAT, columns);
    }
    public ColumnBuilder doubleType(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,DOUBLE, columns);
    }
    public ColumnBuilder real(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,REAL, columns);
    }
    public ColumnBuilder bit(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,BIT, columns);
    }
    public ColumnBuilder serial(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,SERIAL, columns);
    }
    public ColumnBuilder date(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,DATE, columns);
    }
    public ColumnBuilder datetime(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,DATETIME, columns);
    }
    public ColumnBuilder timestamp(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,TIMESTAMP, columns);
    }
    public ColumnBuilder time(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,TIME, columns);
    }
    public ColumnBuilder year(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,YEAR, columns);
    }
    public ColumnBuilder varchar(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,VARCHAR, columns);
    }
    public ColumnBuilder character(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,CHAR, columns);
    }
    public ColumnBuilder tinytext(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,TINYTEXT, columns);
    }
    public ColumnBuilder text(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,TEXT, columns);
    }
    public ColumnBuilder mediumtext(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,MEDIUMTEXT, columns);
    }
    public ColumnBuilder longtext(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,LONGTEXT, columns);
    }
    public ColumnBuilder binary(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,BINARY, columns);
    }
    public ColumnBuilder varbinary(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,VARBINARY, columns);
    }
    public ColumnBuilder tinyblob(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,TINYBLOB, columns);
    }
    public ColumnBuilder blob(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,BLOB, columns);
    }
    public ColumnBuilder mediumblob(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,MEDIUMBLOB, columns);
    }
    public ColumnBuilder longblob(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,LONGBLOB, columns);
    }
    public ColumnBuilder enumuration(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,ENUM, columns);
    }
    public ColumnBuilder set(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,SET, columns);
    }
    
    public String buildQuery(){
        String query = "(";
        for (int i = 0; i<columns.size(); i++) {
            Column col = columns.get(i);
            query += col.getName() + " " + col.getType() + " ";
            if(col.getLength() > 0){
                query += "(" + col.getLength() + ") ";
            }
            if(col.isNotnull())
                query += "NOT NULL ";
            if(col.isPrimary())
                query += "PRIMARY KEY ";
            if(col.isUnique())
                query += "UNIQUE ";
            if(col.getDefaultValue() != null)
                query += "DEFAULT '" + col.getDefaultValue() + "'";
//            if(col.getReference())
            query += i == columns.size() - 1?",": "";

        }
        query += ")";
        return query;
    }
}
