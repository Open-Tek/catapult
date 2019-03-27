package com.opentek.catapult.cliutils;

import java.util.List;

/*
  Routable interface will be used to route the cli
 */
public interface Routable {
      public void called(String[] args, List<String> option);
}
