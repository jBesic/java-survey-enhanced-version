package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	private Category category;
	
	@Before
	public void setUp() {
		String category_title = "Category title";
		String category_description = "Category description";
		User category_owner = new User("Jasmin Besic", "jasmin.besa@gmail.com", 'm', "09/11/1991");

		this.category = new Category(category_title, category_description, category_owner);
	}

	@Test
	public void testConstructor() {
		String category_title = "Category title";
		String category_description = "Category description";

		assertEquals("Category title", category_title, this.category.getTitle());
		assertEquals("Category description", category_description, this.category.getDescription());
		assertEquals("Category owner", "jasmin.besa@gmail.com", this.category.getOwner());
	}
	
	@Test
	public void testSettersAndGetters() {
		String category_title = "Category title - 2";
		String category_description = "Category description - 2";
		int category_status = Status.INACTIVE;

		this.category.setTitle(category_title);
		this.category.setDescription(category_description);
		this.category.setStatus(category_status);
		
		assertEquals("Category title is correct.", category_title, this.category.getTitle());
		assertEquals("Category description is correct.", category_description, this.category.getDescription());
		assertEquals("Category status is correct.", category_status, this.category.getStatus());
	}

}
