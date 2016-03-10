package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	private AlienDictionary ad=new AlienDictionary();
	private WordEnhanced we=new WordEnhanced();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    	String ricezione=txtWord.getText();
    	    	String[] parma=ricezione.split(" ");
    	    	String parma1=parma[0];
    	    	String parma2=parma[1];
    	    	ad.addWord(parma1,parma2);
    	    	String ss="";
    	    	Collections.sort(ad.elenco());
    	    	for(Word w:ad.elenco()){
    	    		if(w!=null)
    	    			ss+=w.getAlienWord()+" "+w.getTranslation()+"\n";   	    
    	    	}
    	    	txtResult.setText(ss);
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	ad.clearList();
    	txtResult.setText("");
    }
    
}
