package Sample;

import java.util.ArrayList;

public class SimpleDotComGame {
	public static void main(String[] args) {
		//newする
		SimpleDotCom dot = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		
		//変数を指定
		int numOfGuess = 0;
		ArrayList<String> locations = new ArrayList<String>();
		String StringNumOfGuess = null;
		boolean isAlive = true;
		
		//乱数を取得し、配列に代入
		int position =(int) (Math.random() * 5) + 1;
		for (int i = 0; i <= 2; i++) {
			String positionIn = Integer.toString(position + i);
			//System.out.println(positionIn);
			locations.add(positionIn);
		}
		
		//取得した乱数をセットする
		dot.setLocationCells(locations);
		
		while (isAlive == true) {
				StringNumOfGuess = helper.getUserInput("enter a number");
			if (dot.checkYourself(StringNumOfGuess).equals("kill")) {
				isAlive = false;
			}
			
			numOfGuess++;
		}
		
		System.out.println("you took " + numOfGuess + " guess");
	}
}
