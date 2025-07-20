package leetcode_questions;
import java.lang.invoke.StringConcatException;
import java.util.*;
class fractionalknapsap{
    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        System.out.println(fractionalKnapsack(wt, val, W));
    }

    public static double fractionalKnapsack(int[] wt, int[] val, int W) {
        double[][] ratio = new double[wt.length][2];
        for (int i = 0; i < wt.length; i++) {
            ratio[i][0] = (double) val[i] / wt[i]; // value/weight ratio
            ratio[i][1] = i; // index of the item
        }
        
        Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0])); // sort by value/weight ratio in descending order
        
        double totalValue = 0.0;
        for (int i = 0; i < wt.length; i++) {
            if (W == 0) break; // if knapsack is full
            
            int index = (int) ratio[i][1];
            if (wt[index] <= W) {
                totalValue += val[index];
                W -= wt[index];
            } else {
                totalValue += ratio[i][0] * W; // take the fraction of the item
                W = 0; // knapsack is now full
            }
        }
        
        return totalValue;
    }
}