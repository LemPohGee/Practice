public class PV{
	public static void main(String[] args){
		short number= Short.parseShort(args[0]);
		int quotient=(int)(number/10);
		if (quotient!=0) {
			quotient=quotient / 10;
		}else{
			System.out.println("Ones");
		}
		if (quotient!=0) {
			quotient=quotient / 10;
		}else{
			System.out.println("Tens");
		}
		if (quotient!=0) {
			quotient=quotient / 10;
		}else{
			System.out.println("Hundreds");
		}
		if (quotient!=0) {
			quotient=quotient / 10;
		}else{
			System.out.println("Thousands");
		}
	}
}