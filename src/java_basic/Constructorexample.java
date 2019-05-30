package java_basic;

public class Constructorexample {
	
	private String exampleVariable;

	  // this is the Default constructor of the class
	  // that has no parameters
	  public Constructorexample(){
	  }

	  // this is the constructor of the class
	  // that takes in one parameter
	  public Constructorexample(String parameterOne) {
	    // this prints exampleVariable
	    System.out.println(parameterOne);
	  }

	  public static void main(String[] args) {
	    // this will be explained in Unit 8
		  Constructorexample constructorexample = new Constructorexample("Hello World!");
	  }
	}


