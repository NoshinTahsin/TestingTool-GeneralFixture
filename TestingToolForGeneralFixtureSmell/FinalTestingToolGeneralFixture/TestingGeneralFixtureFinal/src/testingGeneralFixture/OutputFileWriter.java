package testingGeneralFixture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriter {

	public void OutputFileWriter() {
		
		
	}
	
	public void write(String str){
	
		try { 
	
		  
        // Open given file in append mode. 
        BufferedWriter out = new BufferedWriter( 
               new FileWriter("Output.txt", true)); 
        out.write(str); 
        out.close(); 
    } 
    catch (IOException e) { 
        System.out.println("exception occoured" + e); 
    } 
	}
	
}
