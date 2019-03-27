package com.opentek.catapult;

import com.opentek.catapult.cliutils.Core;
import com.opentek.catapult.core.services.InitService;
import com.opentek.catapult.routables.GenerateRoutable;

public class Catapult {
      private static final String GENERATE_ROUTE = "generate";
      private static final String NEW_ROUTE = "new";

      private Core core = new Core();
      private void process(String[] args){
            GenerateRoutable generateRoutable = new GenerateRoutable();

            core.addRoute(GENERATE_ROUTE, generateRoutable);
            core.addRoute(NEW_ROUTE, (initArgs, options) -> {
                  InitService.init();
            });
            try{
                  core.route(args);
            }catch(Exception e){
                  e.printStackTrace();
            }
      }

      public static void main(String[] args) {
            Catapult catapult = new Catapult();
            catapult.process(args);
      }
}
