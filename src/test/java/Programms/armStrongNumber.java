package Programms;

public class armStrongNumber {
	
	public static void main(String[] args) {
		
		//armstrong number is the number that equals to cube of its digits
		
		int num=153;
		int s1=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem= i%10;
			s1 = s1 +(rem*rem*rem);
	    }
		
		if(num==s1)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not armstrong number");
		}
	 
	}

}
