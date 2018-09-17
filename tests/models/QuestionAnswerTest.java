package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionAnswerTest {

	@Test
	public void testConstructor() {
		String question_answer_test = "Answer to a question";
		User owner = new User("Jasmin Besic", "jasmin.besa@gmail.com", 'm', "09/11/1991");
		Category category = new Category("Category title", "Category description", owner);
		Survey survey = new Survey("Survey title", "Survey description", owner, category);
		Question question = new Question("Question text", survey);

		QuestionAnswer question_answer = new QuestionAnswer(question_answer_test, question);

		assertEquals("Question answer", question_answer_test, question_answer.getAnswer());
		assertEquals("Question status", Status.ACTIVE, question_answer.getStatus());
	}
	
	@Test
	public void testGettersAndSetters() {
		String question_answer_test = "Answer to a question";
		User owner = new User("Jasmin Besic", "jasmin.besa@gmail.com", 'm', "09/11/1991");
		Category category = new Category("Category title", "Category description", owner);
		Survey survey = new Survey("Survey title", "Survey description", owner, category);
		Question question = new Question("Question text", survey);

		QuestionAnswer question_answer = new QuestionAnswer("", question);
		
		question_answer.setAnswer(question_answer_test);
		question_answer.setStatus(Status.INACTIVE);
		
		assertEquals("Question answer", question_answer_test, question_answer.getAnswer());
		assertEquals("Question status", Status.INACTIVE, question_answer.getStatus());
	}

}
