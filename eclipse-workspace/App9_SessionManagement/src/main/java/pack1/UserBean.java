package pack1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable
{
      private String Username;
      private String Firstname;
      private String Lastname;
      private  int Age;
      private String Mail_id;
      private String Phone_no;
      private String Password;
      private String Confirm_Password;
      
    public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getMail_id() {
		return Mail_id;
	}
	public void setMail_id(String mail_id) {
		Mail_id = mail_id;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}
	
	public UserBean() {}
	
}
