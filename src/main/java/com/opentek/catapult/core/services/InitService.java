package com.opentek.catapult.core.services;

import java.io.*;
import java.nio.file.Files;

public class InitService {
      public static void init() {
            try {
                  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                  System.out.print("Enter the name : ");
                  String name = bufferedReader.readLine();

                  System.out.print("Enter the database host : ");
                  String host = bufferedReader.readLine();

                  System.out.print("Enter the database name : ");
                  String databaseName = bufferedReader.readLine();

                  System.out.print("Enter the database username : ");
                  String username = bufferedReader.readLine();

                  System.out.print("Enter the database password : ");
                  String passowrd = bufferedReader.readLine();

                  File file = new File(".env");

                  String env = "NAME=" + name +
                                "\n" +
                                "\nDB_HOST=" + host +
                                "\nDB_NAME=" + databaseName +
                                "\nDB_USERNAME=" + username +
                                "\nDB_PASSWORD=" + passowrd;

                  new FileOutputStream(file).write(env.getBytes());

                  Files.createDirectory(new File("migrations").toPath());

            } catch (IOException ioe) {
                  ioe.printStackTrace();
            }
      }
}
