public class OddEven{
	public static void main(String[] args){
		short number=Short.parseShort(args[0]);
		
		if (number % 2 != 0) {
			System.out.println("The input " + number + " is odd number");
			
		}else {
			System.out.println("The input " + number + " is even number");
		}
	}
}