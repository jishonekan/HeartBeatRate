package heartBeatRate;

public class HrtBR {
	private String firstname, lastname;
	int age;
	public HrtBR(String fname, String  lname) {
		firstname =fname;
		lastname =lname;
		}
	
	public HrtBR(int urage) {
		age =urage;
		}
		public void setFirstname(String fname) {
			firstname =fname;
		}
		public void setLastname(String lname) {
			lastname =lname;
		}
		public void setAge(int urage) {
			age =urage ;
		}
		public String getfirstName() {
		 return  firstname;
		}
		public String getlastName() {
			 return  lastname;
			}
		public int getage() {
			 return   age;
			}
		
			
		}
	
  

