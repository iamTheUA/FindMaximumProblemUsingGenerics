package Day13;

public class FindMaximumProblemUsingGenerics {

	public static void main(String[] args) {
		Float num1=100.5f;
		Float num2=12.6f;
		Float num3=34.5f;
		String s1 = "Apple";
		String s2 = "Banana";
		String s3 = "Peach";
		
		if(num1.compareTo(num2)==1 && num1.compareTo(num3)==1) {
			System.out.println(num1+" is Greatest");
			//System.out.println(re.length());
		}
		else if(num2.compareTo(num1)==1 && num2.compareTo(num3)==1) {
			System.out.println(num2+" is Greatest");
		}
		else {
			System.out.println(num3+" is Greatest");
		}
		
		if(s1.length()>=s2.length() && s1.length()>=s3.length() ) {
			System.out.println(s1+" is Greatest");
		}
		else if(s2.length()>=s1.length() && s2.length()>=s3.length() ) {
			System.out.println(s2+" is Greatest");
		}
		else {
			System.out.println(s3+" is Greatest");

		}
	}

}
