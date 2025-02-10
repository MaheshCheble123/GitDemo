package JavaStream1;

import java.util.ArrayList;
import java.util.Optional;

public class JavaStream1 {
	
	public static void main(String[] args) {
		

		ArrayList<String>names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekha");
		names.add("Adam");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		Long d=names.stream().count();
		Optional<String> d1=names.stream().findFirst();
		System.out.println(c);
		System.out.println(d1);
		//there is no life for intermediate operation if there is no terminal operation.
		//Terminal operation will execute only if intermediate operation(filter) returns true
		//Print all the names using stream.
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//stream() is used to optimized code.filter is used to filter data.limit method is used to limit data by 1.
		
	}

}
