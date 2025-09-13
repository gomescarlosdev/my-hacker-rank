package br.com.gomescarlosdev.hacker_rank.solved;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    public static void plusMinus(List<Integer> arr) {
        double pos = (double) arr.stream().filter(p -> p > 0).count();
        double neg = (double) arr.stream().filter(p -> p < 0).count();
        double zero = (double) arr.stream().filter(p -> p == 0).count();
        System.out.printf("%.6f\n",pos/arr.size());
        System.out.printf("%.6f\n",neg/arr.size());
        System.out.printf("%.6f\n",zero/arr.size());
    }

}

public class PlusMinus {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(
                        bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "").split(" ")
                )
                .map(Integer::parseInt)
                .toList();

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}