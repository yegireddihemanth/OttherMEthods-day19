package ai.jobiak.others;

class Utility {

	public Utility() {
		
		System.out.println("default constructor utility method");
	}
	
	public void utility1() {
		System.out.println("we are in instance utility method");
	}
	public static void utility2() {
		
	}
	
	interface TestRef{
		public void method();
	}

}

	public class MethodReference{
		
	
	public static void main(String[] args) {
		
		Utility util = new Utility();
		TestRef ref = util::utility1;
		ref.method(); 
	}
	

	}


