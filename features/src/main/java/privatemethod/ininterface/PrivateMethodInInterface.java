package privatemethod.ininterface;

interface Card{

	  private Long createCardID(){
	    return 100L;
	  }

	  public static void displayCardDetails(){
	    System.out.println("I am a static method");
	  }
	  
      default void logFatal(String message){
          System.out.println("i am a default method." + createCardID()); 
       }

	}

public class PrivateMethodInInterface implements Card{
	
	public static void main(String... strings) {
		PrivateMethodInInterface interface1 = new PrivateMethodInInterface();
		interface1.logFatal("Yes");
		Card.displayCardDetails();
	}
}
