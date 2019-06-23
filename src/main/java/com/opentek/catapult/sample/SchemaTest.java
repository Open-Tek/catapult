package com.opentek.catapult.sample;

import com.opentek.catapult.core.exceptions.InvalidSchemaException;
import com.opentek.catapult.core.models.migrations.Schema;

public class SchemaTest {
    public static void main(String[] args) throws InvalidSchemaException {
        Schema.create("Student",(bluePrint)->{
            try {
                bluePrint.integer("id").primaryKey().unique().length(11).notnull().build();
                bluePrint.varchar("student_name").length(255).notnull().build();
            } catch (InvalidSchemaException e) {
                e.printStackTrace();
            }
        });
    }
}
