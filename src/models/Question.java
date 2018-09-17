package models;

public class Question {
	private String question;
	private int type_of_question;
	private int status;
	private Survey survey;
	
	public Question(String question, Survey survey) {
		this.setQuestion(question);
		this.setTypeOfQuestion(TypeOfQuestion.TEXT);
		this.setSurvey(survey);
		this.setStatus(Status.ACTIVE);
	}
	
	public Question(String question, int type_of_question, Survey survey) {
		this.setQuestion(question);
		this.setTypeOfQuestion(type_of_question);
		this.setSurvey(survey);
		this.setStatus(Status.ACTIVE);
	}
	
	@Override
	public String toString() {
		return this.getQuestion();
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public int getTypeOfQuestion() {
		return this.type_of_question;
	}

	public void setTypeOfQuestion(int type_of_question) {
		this.type_of_question = type_of_question;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Survey getSurvey() {
		return this.survey;
	}
	
	private void setSurvey(Survey survey) {
		this.survey = survey;
	}
}
