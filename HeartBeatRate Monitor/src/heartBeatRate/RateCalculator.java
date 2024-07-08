package heartBeatRate;
import java.util.Scanner;
public class RateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your firstname");
		String Nam1= input.nextLine();
		HBR maHBR1= new HBR();
		maHBR.setfisname(Nam1);
		System.out.println("Enter your lastname");
		String Nam2= input.nextLine();
		HBR maHBR2= new HBR();
		maHBR2.setfisname(Nam2);
		System.out.printf("Enter your date of birth:%s mm/dd/yy");
		String Nam3= input.nextLine();
		HBR maHBR3= new HBR();
		maHBR3.setfisname(Nam3);
		
		
		
	}

}
