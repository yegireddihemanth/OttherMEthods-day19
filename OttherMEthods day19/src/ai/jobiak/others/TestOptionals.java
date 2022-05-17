package ai.jobiak.others;

import java.util.Optional;

public class TestOptionals {

	static void method(String input) {
		if(input !=null) {
			System.out.println(input.length());
		}
	}
	public static void main(String[] args) {
		String str = null;
		String str2=new String("hello");
		//Optional option1 = Optional.of(str);
		//method(str);
		//Optional option1 = Optional.of(str);
		
		Optional option1 = Optional.ofNullable(str);//we will not get null pointer exception
		//Optional option2 = Optional.of(str2);
		System.out.println(option1.get());//instead we will get NOSuchElementException

//		Optional option1 = Optional.ofNullable(str);
//		if(option1.isPresent()) {
//			System.out.println(option1.get());//it will not throw NoSuchElementException
//			
		
		
		//}
	
//		Optional option1 = Optional.ofNullable(str);
//		System.out.println(option1.orElse("alternate string"));// if null value present it will give alternate string
//		Optional option2 = Optional.ofNullable(str2);
//		System.out.println(option2.orElse("alternate string"));
	
	
	}

}
