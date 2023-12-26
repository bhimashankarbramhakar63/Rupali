package Get_Windohandle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problum {

	public static void main1(String[] args) {
		
		int input[] = { 5, 3, 1, 9, 7 };
		List<Integer> output = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			output.add(input[i]);
		}

		Collections.sort(output);
		for (int i = 0; i < input.length; i++) {
			System.out.print(output.get(i));
		}

		System.out.println();
		
		Collections.reverse(output);
		for (int i = 0; i < input.length; i++) {
			System.out.print(output.get(i));
		}
	}
	

	public static void main(String[] args) {
		
		int input[] = { 5, 3, 1, 9, 7 };
		List<Integer> output = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			
			
		}

}
}
