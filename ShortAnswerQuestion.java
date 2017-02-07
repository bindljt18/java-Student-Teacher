package test.imp;

import test.api.IShortAnswerQuestion;

public class ShortAnswerQuestion implements IShortAnswerQuestion{
	
	String question;
	String[] keywords;
	int answer;
	
	public ShortAnswerQuestion(String question, String[] keywords, int answer){
		this.question = question;
		this.keywords = keywords;
		this.answer = answer;
	}
	
	@Override
	public String getQuestion() {
		return question;
	}

	@Override
	public boolean checkAnswer(String a) {
		String[] answerWords;
		int count = 0;
		
		answerWords = a.split("[\\W]");
		
		for(int i = 0; i < keywords.length; i++){
			for(int j = 0; j < answerWords.length; j++){
				if(keywords[i] == answerWords[j])
					count = count + 1;
				else
					count = count;
			}
		}
		
		if(count >= answer){
			return true;
		}
		else
			return false;
	}
	
}
