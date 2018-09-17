package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTest {

	@Test
	public void testConstructor() {
		String question_test_1 = "Question text 1";
		User owner = new User("Jasmin Besic", "jasmin.besa@gmail.com", 'm', "09/11/1991");
		Category category = new Category("Category title", "Category description", owner);
		Survey survey = new Survey("Survey title", "Survey description", owner, category);
		Question question_1 = new Question(question_test_1, survey);
		assertEquals("Question with one param", question_test_1, question_1.getQuestion());
		assertEquals("Question with one param", TypeOfQuestion.TEXT, question_1.getTypeOfQuestion());
		assertEquals("Question with one param", Status.ACTIVE, question_1.getStatus());
		
		String question_test_2 = "Quetion text 2";
		Question question_2 = new Question(question_test_2, TypeOfQuestion.SELECT_LIST, survey);
		assertEquals("Question with two params", question_test_2, question_2.getQuestion());
		assertEquals("Question with two params", TypeOfQuestion.SELECT_LIST, question_2.getTypeOfQuestion());
		assertEquals("Question with two params", Status.ACTIVE, question_2.getStatus());
	}
	
	@Test
	public void testGettersAndSetters() {
		String question_test = "Question text";
		int type_of_question_test = TypeOfQuestion.RADIO;
		int question_status_test = Status.INACTIVE;
		User owner = new User("Jasmin Besic", "jasmin.besa@gmail.com", 'm', "09/11/1991");
		Category category = new Category("Category title", "Category description", owner);
		Survey survey = new Survey("Survey title", "Survey description", owner, category);
		Question question = new Question("", survey);
		
		question.setQuestion(question_test);
		question.setTypeOfQuestion(type_of_question_test);
		question.setStatus(question_status_test);
		
		assertEquals("Question", question_test, question.getQuestion());
		assertEquals("Type of Question", type_of_question_test, question.getTypeOfQuestion());
		assertEquals("Question status", question_status_test, question.getStatus());
	}

}
