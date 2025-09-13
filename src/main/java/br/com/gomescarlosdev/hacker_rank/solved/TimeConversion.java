package br.com.gomescarlosdev.hacker_rank.solved;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class TimeConversionResult {

    public static String timeConversion(String hour) {
        DateTimeFormatter inFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parsedTime = LocalTime.parse(hour, inFormat);
       return parsedTime.format(outFormat);
    }

}

public class TimeConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println( TimeConversionResult.timeConversion(s));
        bufferedReader.close();
    }
}