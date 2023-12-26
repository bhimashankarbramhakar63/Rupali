package javashree;

import java.util.Scanner;

public class dpack {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
System.out.println("Enter any number");

int num = scanner .nextInt();

scanner.close();

//multiplacation of the  given inpuit number 

for(int i=1;i<=10;i++) {
		
	System.out.println(num+"x"+i+"="+(i*num));
	
	}
	}
}
