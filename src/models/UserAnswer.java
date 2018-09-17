package models;

public class UserAnswer {
	private String answer;
	private int status;
	private Question question;
	private User owner;
	
	public UserAnswer(String answer, Question question, User owner) {
		this.setAnswer(answer);
		this.setQuestion(question);
		this.setOwner(owner);
		this.setStatus(Status.ACTIVE);
	}

	@Override
	public String toString() {
		return this.getAnswer();
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Question getQuestion() {
		return this.question;
	}
	
	private void setQuestion(Question question) {
		this.question = question;
	}
	
	public User getOwner() {
		return this.owner;
	}
	
	private void setOwner(User owner) {
		this.owner = owner;
	}
}
