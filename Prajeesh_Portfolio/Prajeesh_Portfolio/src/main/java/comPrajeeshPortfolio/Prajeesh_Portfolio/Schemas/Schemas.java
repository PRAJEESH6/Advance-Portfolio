package comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Document(collation = "Prajeesh")
public class Schemas {

	@Id
	private String id;
	private String name;
	private String username;
	private String email;
	//private String password;
	private String country;
	private String mobileNo;
	private String position;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date createdDate;
	
	@LastModifiedDate
	private LocalDateTime lastModifiedDate;
	
	
	//Constructor to set the values in particular names..
	public Schemas(String id, String name, String username, String email, String country, String mobileNo,
			String position) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		//this.password = p
		this.country = country;
		this.mobileNo = mobileNo;
		this.position = position;
	}
	
	//Plain Method
	public Schemas()
	{
		
	}

	
	//Getter and Setters..
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	//ToString method..
	@Override
	public String toString() {
		return "Schemas [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", country="
				+ country + ", mobileNo=" + mobileNo + ", position=" + position + "]";
	}
	
	
	
	
}
