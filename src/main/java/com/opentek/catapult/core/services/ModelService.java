package com.opentek.catapult.core.services;

import com.opentek.catapult.core.exceptions.InvalidModelException;
import com.opentek.catapult.core.models.migrations.Column;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * id:integer:default=1:ref=something:unique:primary
 */

public class ModelService {
      private static final String DEFAULT_OPTION = "default";
      private static final String REFERENCE_OPTION = "ref";
      private static final String UNIQUE_OPTION = "unique";
      private static final String PRIMARY_OPTION = "primary";
      private static final char OPTION_SEPERATOR = ':';
      private static final char VALUE_SEPERATOR = '=';

      public static List<Column> extractColumns(String[] args) throws InvalidModelException {
            List<Column> columns = new ArrayList<>();
            System.out.println("columns = " + Arrays.toString(args));
            for(String argument : args) {
                  String[] options = argument.split(OPTION_SEPERATOR + "");
                  if(options.length < 2) {
                        throw new InvalidModelException("Invalid model given");
                  }
                  String columnName = options[0];
                  String type = options[1];
                  String ref = "";
                  String defaultValue = "null";
                  boolean primary = false;
                  boolean unique = false;

                  System.out.println("options = " + options.length);
                  for(int i=2;i<options.length;i++) {
                        String[] optionValues = options[i].split(VALUE_SEPERATOR + "");
                        String option = optionValues[0];
                        System.out.println("option = " + option);
                        switch(option) {
                              case PRIMARY_OPTION :
                                    primary = true;
                                    break;

                              case UNIQUE_OPTION :
                                    unique = true;
                                    break;

                              case DEFAULT_OPTION :
                                    if(optionValues.length != 2) {
                                          throw new InvalidModelException("Invalid model given");
                                    }
                                    defaultValue = optionValues[1];
                                    break;

                              case REFERENCE_OPTION :
                                    if(optionValues.length != 2) {
                                          throw new InvalidModelException("Invalid model given");
                                    }
                                    ref = optionValues[1];
                                    break;

                              default:
                                    throw new InvalidModelException("Invalid model given");
                        }
                  }
                  Column column = new Column(type, columnName, defaultValue, ref, unique, primary, false);
                  columns.add(column);
            }
            return columns;
      }
}
