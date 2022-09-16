import java.util.*;

public class EvenOdd {
	
	public static int[] evenOdd(int[] arr) {
		if (arr== null || arr.length == 0) return null;
		
		int[] result = new int[arr.length];
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		int esize = 0, osize = 0;
		for (int i: arr) {
			if (i%2 == 0) {
				evens.add(i);
				esize++;
			}
			else {
				odds.add(i);
				osize++;
			}
		}
		for (int i = 0; i < esize; i++) {
			result[i] = evens.get(i);
		}
		for (int i = esize; i < esize + osize; i++) {
			result[i] = odds.get(i-esize);
		}
		return result;
	}
	
}