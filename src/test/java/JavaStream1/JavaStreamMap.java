package JavaStream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamMap {
	@Test
	public void streamMap() {
		
		//print the names which have last letter as "a" with uppercase
				Stream.of("Abhijeet","Don","Alekha","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.forEach(s->System.out.println(s));
				System.out.println("--------------------");
				
				//Print all names
				Stream.of("Abhijeet","Don","Alekha","Adam","Rama").map(s->s.toUpperCase())
				.forEach(s->System.out.println(s));
				System.out.println("--------------------");
				
				//Print names which have first letter with uppercase and sorted
			List<String>name=Arrays.asList("Azbhijeet","Don","Alekha","Adam","Rama");//converting all arrays into list.
			name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			System.out.println("--------------------");
			List<String>name1=Arrays.asList("man","Don","women","Adam");
			//Merging two different lists.
			Stream<String>newStream=Stream.concat(name.stream(), name1.stream());
			//newStream.sorted().forEach(s->System.out.println(s)); //When create command cannot update.
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect() 
	{   //Converts into list by using collect and asList methods.
		List<String>s1 = Stream.of("Abhijeet","Don","Alekha","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(s1.get(0));
		
		List<Integer>nums= Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique numbers from this array
		//sort the array
		nums.stream().distinct().forEach(s->System.out.println(s));
		
		nums.stream().distinct().sorted().forEach(s->System.out.println(s));
		
	}

}
