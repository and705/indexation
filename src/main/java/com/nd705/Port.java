package com.nd705;

import java.util.ArrayList;
import java.util.List;

public class Port {

    public static List<Integer> generateSequence (String[] indexes) {
        List<Integer> sequence = new ArrayList<>();
        for (String index : indexes) {

            String[] parts = index.split(",");
            for (String part : parts) {
                if (part.contains("-")) {
                    String[] range = part.split("-");
                    int start = Integer.parseInt(range[0]);
                    int end = Integer.parseInt(range[1]);
                    for (int i = start; i <= end; i++) {
                        sequence.add(i);
                    }
                } else {
                    sequence.add(Integer.parseInt(part));
                }
            }

        }
        return sequence;
    }

    public static List<List<Integer>> getSequences(String[] indexes) {
        List<List<Integer>> sequences = new ArrayList<>();
        for (String index : indexes) {
            List<Integer> sequence = new ArrayList<>();
            String[] parts = index.split(",");
            for (String part : parts) {
                if (part.contains("-")) {
                    String[] range = part.split("-");
                    int start = Integer.parseInt(range[0]);
                    int end = Integer.parseInt(range[1]);
                    for (int i = start; i <= end; i++) {
                        sequence.add(i);
                    }
                } else {
                    sequence.add(Integer.parseInt(part));
                }
            }
            sequences.add(sequence);
        }
        return sequences;
    }

    public static List<List<Integer>> generateCombinations(List<List<Integer>> sequences) {
        List<List<Integer>> combinations = new ArrayList<>();
        if (sequences.size() == 0) {
            combinations.add(new ArrayList<>());
        } else {
            List<Integer> firstSequence = sequences.get(0);
            List<List<Integer>> remainingSequences = sequences.subList(1, sequences.size());
            List<List<Integer>> remainingCombinations = generateCombinations(remainingSequences);
            for (Integer value : firstSequence) {
                for (List<Integer> combination : remainingCombinations) {
                    List<Integer> newCombination = new ArrayList<>();
                    newCombination.add(value);
                    newCombination.addAll(combination);
                    combinations.add(newCombination);
                }
            }
        }
        return combinations;
    }

}
