package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String translation;
	private AlienDictionary ad;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	

	public void setTranslation(String translation) {
		this.translation = translation;
	}


	public String getAlienWord() {
		return alienWord;
	}


	public String getTranslation() {
		return translation;
	}


	public String compare(String alienWord){
		return ad.chechD(alienWord);
	}

}
