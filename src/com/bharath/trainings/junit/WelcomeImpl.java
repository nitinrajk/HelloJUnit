package com.bharath.trainings.junit;

public class WelcomeImpl implements Welcome {

	@Override
	public String welcome(String name) {
		if(name==null||name.length()==0){
			throw new IllegalArgumentException();
		}
		return "Welcome "+name;
	}

}
