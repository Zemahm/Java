
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Simpleton {
	private static Simpleton simpleton;
	private Scanner scanner;
	
	//To prevent outward instantiating 
	private LoadQuestionData() {
		setupScanner(); 
		
	}
	//Synchronised not used as it unneeded and would require a lock object 
	public static Simpleton getSimpletonData() {
		if(simpleton == null) {
			simpleton = new Simpleton();
		}
		return simpleton;
	}
	
	
	//should not be able to support clones so method needed to stop Object superclass clone call
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	
	//To setup scanner (uses asset)
	private void setupScanner() {
		try {
		this.scanner = new Scanner(new File("yourfilename.txt"));
		}
		catch(FileNotFoundException e){
			System.err.println("File not found");
		}
	}
	

}
