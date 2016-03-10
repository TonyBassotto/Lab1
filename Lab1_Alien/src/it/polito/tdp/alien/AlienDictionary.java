package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	List<Word> paroleDictionary=new LinkedList<Word>();
	boolean tr;
	public void addWord(String alienWord, String translation){
		boolean trovato=false;
		for(Word w:paroleDictionary){
			if(w!=null && w.getAlienWord().toLowerCase().contains(alienWord.toLowerCase())){
				trovato=true;
				tr=trovato;
				w.setTranslation(translation);
				break;
			}
		}
		if(trovato){
		}else{
			Word ww=new Word(alienWord,translation);
			paroleDictionary.add(ww);
		}
	}
	public String translateWord(String alienWord){
		String trad="";
		for(Word w:paroleDictionary){
			if(w!=null && w.getAlienWord().toLowerCase().contains(alienWord.toLowerCase())){
				trad=w.getTranslation();
			}
		}
			if(trad!=null){
		return trad;}
			else return null;
	}
	public String chechD(String alienWord){
		String word="";
		for(Word w:paroleDictionary){
			if(w!=null && w.getAlienWord().toLowerCase().contains(alienWord.toLowerCase())){
				word=w.getAlienWord();
				break;
		}
			
	}
		return word;
	}
	public void clearList(){
		paroleDictionary.clear();
	}
	public List<Word> elenco(){
		return paroleDictionary;
	}
		

}
