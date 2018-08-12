public class PositiveNegativeZero{
	public static void main(String[] args){
		short number=Short.parseShort(args[0]);
		if (number == 0) {
			System.out.println(number + " is neither positive or negative");
			
		}else if (number <0) {
			System.out.println(number + " is negative");
			
		}else{
			
			System.out.println(number + " is positive");
		}
	}
}