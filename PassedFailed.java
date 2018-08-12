public class PassedFailed{
	public static void main(String[] args){
		byte grade=Byte.parseByte(args[0]);
		if (grade < 75) {
			System.out.println("Failed");
			
		}else {
			System.out.println("Passed");
		}
	}
}