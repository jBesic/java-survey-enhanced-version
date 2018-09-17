package models;

public class Survey {
	private String title;
	private String description;
	private int status;
	private User owner;
	private Category category;
	
	public Survey(String title, String description, User owner, Category category) {
		this.setTitle(title);
		this.setDescription(description);
		this.setOwner(owner);
		this.setCategory(category);
		this.setStatus(Status.ACTIVE);
	}
	
	@Override
	public String toString() {
		return this.getTitle() + "[" + this.getDescription() + "]";
	}

	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public User getOwner() {
		return this.owner;
	}
	
	private void setOwner(User owner) {
		this.owner = owner;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	private void setCategory(Category category) {
		this.category = category;
	}
}
