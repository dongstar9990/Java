package baitap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai9 {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3, 0, -1};
        int sum = 5;
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (int i=0; i< arr.length; i++)
        {
            if(map.get(sum-arr[i]) != null && map.get(sum - arr[i]) >= 1 && map.get(arr[i]) >= 1) {
                System.out.println(arr[i] + " - " + (sum - arr[i]));
                map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
                map.put(arr[i], map.get(arr[i]) - 1);
            }
        }
    }

}
