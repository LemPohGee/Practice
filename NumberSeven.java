public class NumberSeven{
	public static void main(String[] args){
		short number= Short.parseShort(args[0]);
		
		if (number % 10 == 7) {
			System.out.println( number + " ends with 7");

		}else{
			System.out.println( number + " does not ends with 7");

		}
	}
}