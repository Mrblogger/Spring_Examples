/**
 * 
 */
package com.arjunt.common.dependencyInjection;

/**
 * @author arjun
 *
 */
public class OutputHelper {
	
	IOutputGenerator outputGenerator;
	
	/*
	 *  Constructor Injection Implementation
	 *  Commented the constructor (We can inject an object either of the way)
	 */
	
	// OutputHelper(IOutputGenerator outputGenerator){
	//	this.outputGenerator = outputGenerator;
	//}
	
	
	/*
	 *  End of Constructor Injection Implementation
	 */
	
	
	/*
	 * Setter Injection implementation
	 */
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		
		this.outputGenerator = outputGenerator;
	}
	
	/*
	 * end of Setter Injection implementation
	 */
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
	

}
