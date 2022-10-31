package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                result += i;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                result += i;
            }
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int result = 1;
        String stream = "";
        for(int i = start; i < stop; i += step){
            result = i * i;
            stream += result;
        }
        return stream;
    }

    public static String getRange(int stop) {
        String stream = "";
        for (int i = 0; i < stop; i++){
            stream += i;
        }
        return stream;
    }

    public static String getRange(int start, int stop) {
        String stream = "";
        for (int i = start; i < stop; i ++){
            stream += i;
        }
        return stream;
    }


    public static String getRange(int start, int stop, int step) {
        String stream = "";
        for (int i = start; i < stop; i += step){
            stream += i;
        }
        return stream;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String stream = "";
        for (int i = start; i < stop; i += step){
            i = (int)Math.pow(i, exponent);
            stream += i;
        }
        return stream;
    }
}
