package Programms;

public class FindDuplicateCharacter {
	
	public static void main(String[] args) {
		
		String name= "gggghhhdda";
		int count=0;
		for(int i=0;i<=name.length()-1;i++)
		{
			char s1 = name.charAt(i);
			if(s1>1) {
				System.out.println("Given char is duplicate: "+s1);
			}
		}
		
	}

}
