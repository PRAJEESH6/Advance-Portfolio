package comPrajeeshPortfolio.Prajeesh_Portfolio.DTO;

public class UpdateDTO {


		private String id;
		private String name;
		private String username;
		private String email;
		private String country;
		private String mobileNo;
		private String position;
		
		
		public UpdateDTO(String id, String name, String username, String email, String country, String mobileNo,
				String position) {
			super();
			this.id = id;
			this.name = name;
			this.username = username;
			this.email = email;
			this.country = country;
			this.mobileNo = mobileNo;
			this.position = position;
		}


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


		@Override
		public String toString() {
			return "GetDTO [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", country="
					+ country + ", mobileNo=" + mobileNo + ", position=" + position + "]";
		}
		
		
		
		
	

}
