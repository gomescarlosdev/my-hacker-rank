package br.com.gomescarlosdev.hacker_rank.solved;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result_1 {

    public static void miniMaxSum(List<Integer> arr) {
        Integer max = arr.stream().max(Integer::compareTo).orElseThrow();
        Integer min = arr.stream().min(Integer::compareTo).orElseThrow();
        long totalSum = arr.stream().mapToLong(Integer::longValue).sum();

        System.out.printf("%d %d\n",totalSum - max, totalSum - min);
    }

}

public class MaxMinSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(
                        bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "").split(" ")
                )
                .map(Integer::parseInt)
                .toList();

        Result_1.miniMaxSum(arr);

        bufferedReader.close();
    }
}