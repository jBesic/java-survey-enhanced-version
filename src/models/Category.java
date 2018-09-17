package models;

public class Category {
	private String title;
	private String description;
	private int status;
	private User owner;
	
	public Category(String title, String description, User owner) {
		this.setTitle(title);
		this.setDescription(description);
		this.setOwner(owner);
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
}
