package week05;

import week05.week05.Logger;

public class AsteriskLogger implements Logger {

	public void debug(String message) {
		System.out.println("***Hello***");
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
		    AsteriskLogger logger = new AsteriskLogger();
		    logger.debug("***Hello***");
	 }
}
