package test.imp;

import test.api.IMultipleChoiceQuestion;

public class MultipleChoiceQuestion implements IMultipleChoiceQuestion{

	String question;
	String[] choices = new String[4];
	int answer;
	
	public MultipleChoiceQuestion(String question, String[] choices, int answer){
		this.question = question;
		this.choices = choices;
		this.answer = answer;
	}
	

	@Override
	public boolean checkAnswer(int index) {
		if(index == answer)
			return true;
		else
			return false;
	}

	@Override
	public String getQuestion() {
		String q;
		
		q = question + "\n 1) \t" + choices[0] + "\n 2) \t" + choices[1] + "\n 3) \t" + choices[2]
				+"\n 4) \t" + choices[3];
		
		return q;
	}
	
}
