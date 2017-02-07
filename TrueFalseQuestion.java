package test.imp;

import test.api.ITrueFalseQuestion;

public class TrueFalseQuestion implements ITrueFalseQuestion{
	
	String question;
	boolean answer;
	
	public TrueFalseQuestion(String question, boolean answer){
		this.question = question;
		this.answer = answer;
	}
	
	@Override
	public String getQuestion() {
		
		return question + "\t True/False?";
	}

	@Override
	public boolean checkAnswer(boolean answer) {
		if(this.answer == answer)
			return true;
		else
			return false;
	}

}
