package assignments.week3.day2;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumbers 
{
	public static void main(String[] args) {
	    int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
	    Arrays.sort(numbers);
	    HashSet<Integer> set = new HashSet<Integer>();

	    for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
	        set.add(i);
	    }

	    for (int i = 0; i < numbers.length; i++) {
	        set.remove(numbers[i]);
	    }

	    for (int x : set) {
	        System.out.print(x + " ");
	    }
	}
}