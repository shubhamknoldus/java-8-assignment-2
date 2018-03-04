package edu.knoldus.application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> x= Arrays.asList(
                Arrays.asList(1,2,3,4,5,6,7,8,9),
                Arrays.asList(1,2,3,4,5,6,7,8,9),
                Arrays.asList(1,2,3,4,5,6,7,8,9),
                Arrays.asList(1,2,3,4,5,6,7,8,9)
        );
        System.out.println(x.get(0).parallelStream()
        .map(y -> y + 2).reduce(0, (a,b) -> a + b));
        System.out.println(
                x.stream()
                .flatMap(y -> {
                   return y.stream()
                            .map(z -> "hi i am" + z);
                }).collect(Collectors.toList()));
    }
}
