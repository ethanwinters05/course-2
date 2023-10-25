package com.jap;

public class MaxAge {
    public int getMaxAge(int[] ages) {
        int maxAge = ages[0]; 

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
            }
        }

        return maxAge;
    }

    public static void main(String[] args) {
        int[] ages = {23, 34, 43, 56, 67, 78, 43, 35};

        MaxAge maxAge = new MaxAge();
        int max = maxAge.getMaxAge(ages);

        System.out.println("Maximum age: " + max);
    }
}
