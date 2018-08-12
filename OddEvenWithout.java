public class OddEvenWithout{
	public static void main(String [] args){
		short number= Short.parseShort(args[0]);
		short quotient=(short)(number/2);


		if (quotient*2==number) {
			System.out.println("The input " + number + " is even number");

		}else{
			System.out.println("The input " + number + " is odd number");


		}


	}
}