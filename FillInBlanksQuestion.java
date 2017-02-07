package test.imp;

import test.api.IFillInBlanksQuestion;

public class FillInBlanksQuestion implements IFillInBlanksQuestion{
	
	int blanks;
	String question;
	String[] answers = new String[blanks];
	
	public FillInBlanksQuestion(int blanks, String question, String[] answers){
		this.blanks = blanks;
		this.question = question;
		this.answers = answers;
	}
	
	@Override
	public String getQuestion() {
		
		return question;
	}

	@Override
	public boolean checkAnswer(String[] keywords) {
		int count = 0;
		
		for(int i = 0; i < keywords.length; i++){
			if(keywords[i] != answers[i])
				count = count + 1;
		}
		
		if(count == 0)
			return true;
		else
			return false;
	}

}
