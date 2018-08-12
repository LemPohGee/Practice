public class PV{
	public static void main(String[] args){
		short number= Short.parseShort(args[0]);
		int quotient=(int)(number/10);


		if (quotient==0) {
			System.out.println("Ones");
		}else{
			quotient=quotient / 10;
			if (quotient==0) {
				System.out.println("Tens");
			}else{
				quotient=quotient / 10;
				if (quotient==0) {
					System.out.println("Hundreds");
				}else{
					quotient=quotient / 10;

					if (quotient==0) {
						System.out.println("Thousands");
					}else{
						quotient=quotient / 10;
					}
				}
			}
		}
	}
}