package atos.training.capestone.demomodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="register")
public class SignUpModel {

	@Id
	@Column(name = "userid")
	private int userid;

	@Column(name = "fullname")
	private String fullname;
	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "confirmpassword")
	private String confirmpassword;
	
	public SignUpModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public SignUpModel(int userid, String fullname, String username, String email, String password,
			String confirmpassword) {
		super();
		this.userid = userid;
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}



	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public int getUserid() {
		return userid;
	}
	

}
