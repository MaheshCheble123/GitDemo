package Programms;

public class SpacesCount {
	
	public static void main(String[] args) {
		
		String name="Mahes    h";
		int count=0;
		
		for(int i=0; i<=name.length()-1;i++) 
		{
			char s1 = name.charAt(i);
			if(s1==' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
