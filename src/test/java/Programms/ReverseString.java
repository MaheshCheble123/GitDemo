package Programms;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="Manthan Mahesh Cheble";
		String revName="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			revName = revName+name.charAt(i);
		}
		
		System.out.println(revName);
		
		
		
		
	}

}
