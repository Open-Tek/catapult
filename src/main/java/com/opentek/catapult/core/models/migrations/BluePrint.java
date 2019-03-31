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
    private final static String LONGINT = "LONGINT";
    private String tableName;
    private ArrayList<Column> columns;
//    protected ColumnBuilder
    protected BluePrint(String tableName){
        this.tableName = tableName;
        this.columns = new ArrayList<>();
    }

    public ColumnBuilder integer(String columnName) throws InvalidSchemaException {
        if(columnName == null || columnName.equals(""))
            throw new InvalidSchemaException("Column Name is invalid");
        return new ColumnBuilder(columnName,INTEGER, columns);
    }


}
