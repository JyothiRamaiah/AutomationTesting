package Jyothi;

class Login_Details {
	private String email_id = "Jyothiram16@gmail.com"; // Restricting Access
	private String Password = "jyothi@123";
	private long DOB = 551995;

	public void set_email_id(String email_id) // Setter method always should be public
	{
		this.email_id = email_id; // Assigning global variable to local variable
		System.out.println("New mail id  " + email_id);
	}
	public String get_email_id() { // Getter method always should be public,have return keyword
		return email_id;
	}
	public void set_Password(String Password) {
		this.Password = Password;
		System.out.println("New Password " + Password);
	}
	public String get_Password() {
		return Password;

	}
	public long getDOB() {
		return DOB;
	}
	public void setDOB(long DOB) {
		this.DOB = DOB;
		System.out.println("New Dob is " + DOB);
	}
}
public class Assignment61 {

	public static void main(String[] args) {
		Login_Details l1 = new Login_Details();
		l1.set_email_id("jyothiram@gmail.com");
		l1.set_Password("jyothi098");
		l1.setDOB(2721995);

	}

}
