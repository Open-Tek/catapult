package com.opentek.catapult.cliutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Core {
      private HashMap<String, Routable> routes;
      private Routable defaultRoute;

      public Core(){
            this.routes = new HashMap<>();
            this.defaultRoute = null;
      }

      public Core(Routable defaultRoute) {
            this.defaultRoute = defaultRoute;
      }

      public void route(String[] args) throws RouteNotFoundException {
            this.route(args, null);
      }


      /**
       * @param args
       * @param options
       * @throws RouteNotFoundException
       */

      public void route(String[] args, List<String> options) throws RouteNotFoundException {
            if(args == null)
                  throw new IllegalArgumentException("Args cannot be empty");

            List<String> updatedOptions = options;

            if(options == null)
                  updatedOptions = this.extractOptions(args);

            if(args.length < 1) {
                  throw new IllegalArgumentException("No arguments passed");
            }
            String route = args[0];

            Routable routable = this.routes.get(route);
            if(routable != null) {
                  String[] filteredArgs = this.filterArgs(args);
                  String[] subArray = new String[filteredArgs.length - 1];
                  System.arraycopy(filteredArgs, 1, subArray, 0, filteredArgs.length-1);
                  routable.called(subArray, updatedOptions);
                  return;
            }
            if(defaultRoute == null) {
                  throw new RouteNotFoundException(args[0]);
            }
            this.defaultRoute.called(args, options);
      }

      private List<String> extractOptions(String[] args) {
            List<String> options = new ArrayList<>();
            for(String argument : args) {
                  String option = this.isOption(argument);
                  if(option == null) {
                        options.add(argument);
                  }
            }
            return options;
      }

      private String[] filterArgs(String[] args) {
            List<String> commands = new ArrayList<>();
            for(String argument : args) {
                  String option = this.isOption(argument);
                  if(option == null) {
                        commands.add(argument);
                  }
            }

            String[] commandArray = new String[commands.size()];
            return commands.toArray(commandArray);
      }

      private String isOption(String argument) {
            if(argument == null) {
                  throw new IllegalArgumentException("argument was null");
            }
            Matcher charMatcher = Pattern.compile("^\\-(\\w)$").matcher(argument);
            Matcher wordMatcher = Pattern.compile("^\\-\\-(\\w+)$").matcher(argument);
            if(charMatcher.find()) {
                  return charMatcher.group(1);
            } else if(wordMatcher.find()) {
                  return wordMatcher.group(1);
            }
            return null;
      }

      public com.opentek.catapult.cliutils.Core addRoute(String routeName, Routable routable){
            if(routeName == null) {
                  throw new IllegalArgumentException("route name was null");
            }
            if(routable == null) {
                  throw new IllegalArgumentException("routable was null");
            }
            this.routes.put(routeName, routable);
            return this;
      }
}
