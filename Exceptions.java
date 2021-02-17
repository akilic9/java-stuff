package oop3c;

public class Exceptions {

	public static void main(String[] args) {
		try {
			someMethod();
		}
		catch (Exception excep){
			System.err.printf("%s%n%n", excep.getMessage());
			excep.printStackTrace();
			
			StackTraceElement [] traceElement = excep.getStackTrace();
			
			System.out.printf("%nStack trace:%n");
			System.out.println("Class\t\t\tFile\t\t\tLine\tMethod");
			
			for(StackTraceElement element : traceElement) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}

	}
	
	public static void someMethod() throws Exception{
		try {
			someMethod2();
		}
		
		catch(Exception excep){
			throw excep;
		}
	}
	
	public static void someMethod2() throws Exception{
		throw new Exception("An exception in someMethod2.");
	}

}
