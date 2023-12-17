package org.example;


import java.util.*;


public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        chapter1();
        chapter2();
        chapter3();
        chapter4();
    }
        public static void chapter1() {
            for (int num : nums) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        }
    public static void chapter2(){
        Collections.sort(nums);
        int minNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != minNum) {
                System.out.println(num);
                minNum = num;
            }
        }
    }
    public static void chapter3(){
        Set<String> uniString = new HashSet<>(strings);
        System.out.println(uniString);
    }
    public static void chapter4() {
        Set<String> uniString = new HashSet<>(strings);
        System.out.println(strings.size() - uniString.size());
    }


}