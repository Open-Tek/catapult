package com.opentek.catapult.core.models.migrations;

import com.opentek.catapult.core.exceptions.InvalidSchemaException;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * Schema methods For DDL
 *  create
 *  rename
 *  drop
 *  dropIfExists
 *  alter
 *  hasTable
 *  table - to modify the table schema
 */
public class Schema {
    /**
     * Creates a table if is not exists in the database.
     * @param tableName - name of the table to be created
     * @param consumer - a callback which will give the call to the get method.
     */
    public static void create(String tableName, Consumer<BluePrint> consumer) throws InvalidSchemaException{
        if(tableName == null || tableName.equals("")){
            throw new InvalidSchemaException("Table name not valid");
        }
        BluePrint bluePrint = new BluePrint(tableName);
        consumer.accept(bluePrint);
        String query = "CREATE TABLE IF NOT EXISTS " + tableName;
        query += bluePrint.buildQuery();
        System.out.println(query);
    }
}
