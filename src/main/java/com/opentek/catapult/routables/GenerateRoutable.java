package com.opentek.catapult.routables;

import com.opentek.catapult.cliutils.Core;
import com.opentek.catapult.cliutils.Routable;
import com.opentek.catapult.core.services.MigrationService;
import com.opentek.catapult.core.exceptions.ErrorMessages;

import java.util.List;

public class GenerateRoutable implements Routable {
      private static final String GENERATE_MODEL = "model";
      private Core core = new Core();
      public void called(String[] args, List<String> options) {
            try {
            this.core.addRoute(GENERATE_MODEL, (modelArgs, modelOptions)->{
                  if(modelArgs.length < 2){
                        System.out.println(ErrorMessages.INVALID_MODEL);
                  }
                  try {
                        MigrationService.createMigration(modelArgs);
                  } catch (Exception e) {
                        e.printStackTrace();
                  }

            });
                  this.core.route(args, options);
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
}
