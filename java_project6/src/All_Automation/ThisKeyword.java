package All_Automation;

public class ThisKeyword {
	
	
	public static void main(String[] args) {
		
		
		String[] array= {"kapil","nani","jilani","nani","jijaji","jijaji"};
		
		System.out.println(array.length);
		
		for(int i=0;i<=array.length-1;i++) {
		
			for(int j=i+1;j<=array.length-1;j++) {
			
				if(array[i]==array[j]) {
				
					System.out.println(array[j]);
				}
			}
		}  
	}
}
