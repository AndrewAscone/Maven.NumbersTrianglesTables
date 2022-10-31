package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String cell = "";
        String table = "";
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                cell = String.format("%3d |", i*j);
                table += cell;
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String cell = "";
        String table = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                cell = String.format("%3d |", i*j);
                table += cell;
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String cell = "";
        String table = "";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                cell = String.format("%3d |", i*j);
                table += cell;
            }
            table += "\n";
        }
        return table;
    }
}
