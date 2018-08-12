public class GradeDescription{
	public static void main(String[] args){
		byte grade=Byte.parseByte(args[0]);
		if (grade <75) {
			System.out.println("Failed");
			
		}else if (grade<80) {
			System.out.println(grade + "Removal");
			
		}else if (grade<100) {
			
			System.out.println(" Passed");
		}else if (grade==100) {
			
			System.out.println(" Passed,Perfect!");
		}
	}
}