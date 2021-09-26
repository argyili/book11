package chapter22;

import java.util.*;
import java.util.stream.*;

public class NearestPair {
    public static void main(String[] args) {
        int NUM = 20, LIMIT = 100;
        int[][] array = new int[NUM][2];
        int length = array.length;

        Random random = new Random();
        for (int i = 0; i < length; i++) {
        array[i][0] = random.nextInt(LIMIT);
        array[i][1] = random.nextInt(LIMIT);
        }
        // Sort according to x order
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare (int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                } else {
                    return a[0] - b[0];
                }
            }
        });

        // d1 is the minimun of left part, and d2 for the right part
        int mid = length / 2;
        int d, d1, d2;
        d = d1 = d2 = Integer.MAX_VALUE;
        for (int i = 0; i < mid; i++) {
            for (int j = i + 1; j < mid; j++) {
                d1 = Math.min(distance(array[i], array[j]), d1);
            }
        }
        for (int i = mid; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                d2 = Math.min(distance(array[i], array[j]), d2);
            }
        }
        d = Math.min(d1, d2);

        // Reboxing from int[] to list
        List<List<Integer>> stripL = new ArrayList<>();
        List<List<Integer>> stripR = new ArrayList<>();
        for (int[] point : array) {
            // Convert types
            if (Math.abs(array[mid][0] - point[0]) < d) {
                if (array[mid][0] - point[0] >= 0) {
                    stripL.add(Arrays.stream(point).boxed().collect(Collectors.toList()));
                } else {
                    stripR.add(Arrays.stream(point).boxed().collect(Collectors.toList()));
                }
            }
        }
        if (stripL.isEmpty() || stripR.isEmpty()) {
            printMin(d);
            return;
        }

        // Resort according to y order
        Comparator<List<Integer>> comparator = new Comparator<>(){
            @Override
            public int compare (List<Integer> a, List<Integer> b) {
                if (a.get(1) == b.get(1)) {
                    return a.get(0) - b.get(0);
                } else {
                    return a.get(1) - b.get(1);
                }
            }
        };
        Collections.sort(stripL, comparator);
        Collections.sort(stripR, comparator);

        // Find minimun distance between left strip and right strip
        int r = 0;
        for (List<Integer> pointL : stripL) {
            while (r < stripR.size() && stripR.get(r).get(1) <= pointL.get(1) - d) {
                r++;
            }
            int r1 = r;
            while (r1 < stripR.size() && Math.abs(stripR.get(r1).get(1) - pointL.get(1)) < d) {
                if (distance(pointL, stripR.get(r1)) < d) {
                    d = distance(pointL, stripR.get(r1));
                }
                r1 += 1;
            }
        }
        printMin(d);
    }

    // Refactor distance function
    public static int distance(int[] a, int[] b) {
        return (int) Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
    
    public static int distance(List<Integer> a, List<Integer> b) {
        return (int) Math.abs(a.get(0) - b.get(0)) + Math.abs(a.get(1) - b.get(1));
    }

    public static void printMin(int d) {
        System.out.println("The minimun distance of nearest pair is " + d);
    }
}
