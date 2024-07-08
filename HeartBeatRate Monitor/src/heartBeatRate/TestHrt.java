package heartBeatRate;
import java.util.Scanner;
public class TestHrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input  = new  Scanner(System.in);
    HrtBR hrtBR = new HrtBR(null, null);

    System.out.println("Hello user:\n");
    hrtBR.getfirstName();
    System.out.println("enter your firstname");
    String aname= input.nextLine();
    hrtBR.setFirstname(aname);
    System.out.println("enter your lastname");
    String bname= input.nextLine();
    hrtBR.setFirstname(bname);
    System.out.println("enter your age");
    int cname= input.nextInt() ;
    hrtBR.setAge(cname);
    int bpm =220, m ;
    double tg;
	m = bpm - cname;
	System.out.println("Your maximum heart beat rate per second is:"+m);
	
	tg= Math.max(0.5*m , Math.min(0.85*m, m));
	System.out.println("Your heart beat is ok at:i" + tg );
	
    
    
    
    
	}

}
