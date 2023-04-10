package com.nd705;
import java.util.Arrays;
import java.util.List;

import static com.nd705.Port.*;


public class App {
    public static void main(String[] args) {
        String[] indexes = {"1,3-5", "2", "3-4"};
        List<Integer> sequences = generateSequence(indexes);
        System.out.println("1. Метод, преобразовывающий массив строк indexes в массив последовательностей чисел:");
        System.out.println(sequences);
        List<List<Integer>> combinations = generateCombinations(getSequences(indexes));
        System.out.println("2. Метод, возвращающий всевозможные уникальные упорядоченные группы элементов полученных массивов чисел:");
        System.out.println(combinations);
    }
}
