package com.opentek.catapult.core.models.migrations;

public interface Migratable {
      public void up(BluePrint bluePrint);

      public void down(BluePrint bluePrint);
}
