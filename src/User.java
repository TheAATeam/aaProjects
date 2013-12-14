
public class User {
	
	String name;
	String email;
	User child;
	
	public User() {
	}
	
	User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public User(String name, String email, User child) {
		this.name = name;
		this.email = email;
		this.child = child;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setName(String name) {
		this.name = name;		
	}

	public void setEmail(String email) {
		this.email = email;		
	}

	public User getChild() {
		return this.child;
	}

	public void setChild(User child) {
		this.child = child;		
	}

}
