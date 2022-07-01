package LEET_CODE;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    static int nums[] = {0, 1};

    /**
     * java document
     * 解释这段代码
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[][] nums = new int[5][];
        for(int i = 0; i < nums.length; i++){
            nums[i] = new int[i + 1];
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++)
                System.out.print(nums[i][j]);
            System.out.println();
        }


    }
}
