package JavaConcepts;

/**
 * @author Sourabh
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//USING CLASS IMPLEMENTATION
//		MyInter objofinterface = new Lambda();
//		objofinterface.sum();
		
		
		//USING ANONYMOUS CLASS 
//		MyInter obj = new MyInter() {
//			
//			@Override
//			public void sum() {
//				// TODO Auto-generated method stub
//				
//				System.out.println("THIS IS FIRST ANONYMOUS CLASS");
//				
//			}
//		};
//		
//		obj.sum();
		
		// USING LAMBDA EXPRESSION
		MyInter i = () -> System.out.println("using lambda to print okay ");

		
		i.sum(); 
		
		SumInter sumInter = ( a, b) ->  a+b;
		
		System.out.println(sumInter.sum(5, 6));
		
		StringLen str = (s) -> s.length();
				
				
		System.out.println(str.length("sourabh"));
		
	}

}
