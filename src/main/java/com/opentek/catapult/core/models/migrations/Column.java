package com.opentek.catapult.core.models.migrations;

import java.util.Objects;

public class Column {
      private String type, name, defaultValue, reference;
      private boolean unique, primary;

      public Column(String type, String name, String defaultValue, String reference, boolean unique, boolean primary) {
            this.type = type;
            this.name = name;
            this.defaultValue = defaultValue;
            this.reference = reference;
            this.unique = unique;
            this.primary = primary;
      }

      public Column(String columnName) {
            this.name = columnName;
      }

      public String getType() {
            return type;
      }

      public void setType(String type) {
            this.type = type;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getDefaultValue() {
            return defaultValue;
      }

      public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
      }

      public String getReference() {
            return reference;
      }

      public void setReference(String reference) {
            this.reference = reference;
      }

      public boolean isUnique() {
            return unique;
      }

      public void setUnique(boolean unique) {
            this.unique = unique;
      }

      public boolean isPrimary() {
            return primary;
      }

      public void setPrimary(boolean primary) {
            this.primary = primary;
      }

      @Override
      public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            Column column = (Column) o;
            return unique == column.unique &&
                    primary == column.primary &&
                    Objects.equals(type, column.type) &&
                    Objects.equals(name, column.name) &&
                    Objects.equals(defaultValue, column.defaultValue) &&
                    Objects.equals(reference, column.reference);
      }

      @Override
      public int hashCode() {
            return Objects.hash(type, name, defaultValue, reference, unique, primary);
      }

      @Override
      public String toString() {
            return "Column{" +
                    "type='" + type + '\'' +
                    ", name='" + name + '\'' +
                    ", defaultValue='" + defaultValue + '\'' +
                    ", reference='" + reference + '\'' +
                    ", unique=" + unique +
                    ", primary=" + primary +
                    '}';
      }
}
