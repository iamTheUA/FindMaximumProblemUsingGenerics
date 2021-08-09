package Day13;

public class FindMaximumProblemUsingGenerics {

	public static void main(String[] args) {
		Integer num1=10;
		Integer num2=6;
		Integer num3=5;
		
		if(num1.compareTo(num2)==1 && num1.compareTo(num3)==1) {
			System.out.println(num1+"is Greatest");
		}
		else if(num2.compareTo(num1)==1 && num2.compareTo(num3)==1) {
			System.out.println(num2+"is Greatest");
		}
		else {
			System.out.println(num3+"is Greatest");
		}
	}

}
