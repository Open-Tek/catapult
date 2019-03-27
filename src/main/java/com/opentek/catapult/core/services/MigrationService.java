package com.opentek.catapult.core.services;

import com.opentek.catapult.core.exceptions.InvalidModelException;
import com.opentek.catapult.core.models.migrations.Column;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class MigrationService {
      public static boolean createMigration(String[] args) throws InvalidModelException {
            String table_name = args[0];
            table_name = StringUtils.capitalize(table_name.replaceAll("_", " ")).replaceAll(" ", "");
            String[] subArr = new String[args.length - 1];
            System.arraycopy(args, 1, subArr, 0, args.length - 1);
            List<Column> columns = ModelService.extractColumns(subArr);

            String migrationCode = "" +
                    "import com.opentek.catapult.core.models.migrations.BluePrint;\n" +
                    "import com.opentek.catapult.core.models.migrations.Migratable;\n" +
                    "\n" +
                    "public class " + table_name + "Migration implements Migratable {\n" +
                    "      @Override\n" +
                    "      public void up(final BluePrint bluePrint) {\n" +
                    "            \n" +
                    "      }\n" +
                    "\n" +
                    "      @Override\n" +
                    "      public void down(final BluePrint bluePrint) {\n" +
                    "\n" +
                    "      }\n" +
                    "}";
            File file = new File("migrations/" + table_name + ".java");
            try {
                  new FileOutputStream(file).write(migrationCode.getBytes());
            } catch (IOException ioe) {
                  ioe.printStackTrace();
            }

            return true;
      }

}
