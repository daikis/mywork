package Sample;

import java.util.ArrayList;

public class SimpleDotCom {
	
	//îzóÒÇ≈ÇÕÇ»Ç≠ArrayListÇçÏê¨
	//int[] locationCells;
	private ArrayList<String> locationCells;
	int numOfHits = 0;
	
	void setLocationCells(ArrayList<String> locations) {
		this.locationCells = locations;
	}
	
	String checkYourself(String stringGuess) {
		
		//int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		int input = locationCells.indexOf(stringGuess);
		if (input >= 0) {
			locationCells.remove(input);
			result = "hit";
		} 
		if (locationCells.isEmpty()) {
			result = "kill";
		}
		
//		for (int cell : locationCells) {
//			if (cell == guess) {
//				result = "hit";
//				numOfHits++;
//				break;
//			}
//		}
//		if (numOfHits == locationCells.length) {
//			result = "kill";
//		}
//		
		System.out.println(result);
		return result;
	}

}
