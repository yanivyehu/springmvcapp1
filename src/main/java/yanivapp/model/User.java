package yanivapp.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private int id;
	private String name;
	private String password;

//	@JsonCreator
//	public User(
//		@JsonProperty("id") int id,
//		@JsonProperty("name") String name,
//		@JsonProperty("password") String password) {
//		this.id = id;
//		this.name=name;
//		this.password=password;
//	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "\n[id:" + this.id + ",name:" + this. name + ",password:" + this.password +"]\n";
	}
}
