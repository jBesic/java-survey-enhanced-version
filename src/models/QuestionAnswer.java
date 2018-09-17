package models;

public class QuestionAnswer {
	private String answer;
	private int status;
	private Question question;
	
	public QuestionAnswer(String answer, Question question) {
		this.setAnswer(answer);
		this.setQuestion(question);
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
}
