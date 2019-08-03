package quizTestDP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LoadQuestionData {
	private static LoadQuestionData questionData;
	private Scanner scanner;
	
	//To prevent outward instantiating 
	private LoadQuestionData() {
		setupScanner(); 
		
	}
	//Synchronised not used as it unneeded and would require a lock object 
	public static LoadQuestionData getQuestionData() {
		if(questionData == null) {
			questionData = new LoadQuestionData();
		}
		return questionData;
	}
	
	
	//should not be able to support clones so method needed to stop Object superclass clone call
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	
	//To setup scanner (uses asset)
	private void setupScanner() {
		try {
		this.scanner = new Scanner(new File("questions.txt"));
		}
		catch(FileNotFoundException e){
			System.err.println("File not found");
		}
	}
	

}
