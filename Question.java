package test.imp;

import java.io.Serializable;

import test.api.IQuestion;

public abstract class Question implements IQuestion, Serializable{
	
	String question;
	
	public Question(String question){
		this.question = question;
	}
	
	@Override
	public String getQuestion() {
		return question;
	}
	
}
