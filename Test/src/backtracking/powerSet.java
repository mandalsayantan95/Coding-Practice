package src.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class powerSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        powerSet.solution(arr);

    }
    private static void solution(int[] arr) {
        int[] data = new int[arr.length];
        helper(arr,data,0,0);
    }

    private static void helper(int[] arr,int[] data, int l,int level) {

        if(l == arr.length){
            return;
        }
        else{
        for(int i=l;i<arr.length;i++){
            data[level] = arr[i];
            for(int j=0;j<=level;j++){
                System.out.print(data[j]);
            }
            System.out.println();
            helper(arr,data,i+1,level+1);
        }
        }
    }

}
