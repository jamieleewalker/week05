package week05;

import week05.week05.Logger;

public class SpacedLogger implements Logger {

	public void debug(String message) {
		System.out.println("***Error: Hello***");
}

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		
	}
	
	 public static void main(String[] args) {
		    SpacedLogger logger = new SpacedLogger();
		    logger.debug("***Error: Hello***");
}
}