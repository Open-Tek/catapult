package com.opentek.catapult.cliutils;

public class RouteNotFoundException extends Exception{
      public RouteNotFoundException(String routeName){
            super("No such route found : " + routeName);
      }
}
