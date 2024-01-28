package comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document (collation = "GetinTouch")
public class TouchSchema {

	@Id
	private String user_id;
	private String user_name;
	private String user_email;
	private String user_message;
	
	
	public TouchSchema(String user_id, String user_name, String user_email, String user_message) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_message = user_message;
	}
	
	public TouchSchema() {
		
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_message() {
		return user_message;
	}

	public void setUser_message(String user_message) {
		this.user_message = user_message;
	}

	@Override
	public String toString() {
		return "TouchSchema [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_message=" + user_message + "]";
	}
	
	
	
	
}
