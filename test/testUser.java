import static org.junit.Assert.*;

import org.junit.Test;


public class testUser {

	String name = "John Smith";
	String email = "john.smith@testemail.com";
	
	@Test
	public void testGetName() {
		User testUser = new User(name, email);
		assertEquals("testUser.getName() must return name", testUser.getName(), name);
	}
	
	@Test
	public void testGetEmail() {
		User testUser = new User(name, email);
		assertEquals("testUser.getEmail() must return email", testUser.getEmail(), email);		
	}
	
	@Test
	public void testSetName() {
		User testUser = new User();
		testUser.setName(name);
		assertEquals("testUser.getName() must return name", testUser.getName(), name);
	}
	
	@Test
	public void testSetEmail() {
		User testUser = new User();
		testUser.setEmail(email);
		assertEquals("testUser.getEmail() must return email", testUser.getEmail(), email);		
	}
	
	@Test
	public void testGetChild() {
		User child = new User();
		User parent = new User(name, email, child);
		
		assertEquals("parent.getChild() must equal child", parent.getChild(), child);
	}
	
	@Test
	public void testSetChild() {
		User parent = new User();
		User child = new User();
		
		parent.setChild(child);
		assertEquals("parent.getChild() must equal child", parent.getChild(), child);
	}

}
