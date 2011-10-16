package Sample;

import java.util.ArrayList;

public class DotComBust {
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	int numOfGuess = 0;
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGames();
		game.startPlaying();
	}
	
	void setUpGames() {
		DotCom com = new DotCom();
		DotCom com1 = new DotCom();
		DotCom com2 = new DotCom();
		DotCom com3 = new DotCom();
		
		com1.setName("yukino");
		com2.setName("daiki");
		com3.setName("yosiyasu");
		
		dotComList.add(com1);
		dotComList.add(com2);
		dotComList.add(com3);
		
		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> placeList = helper.placeDotCom(3);
			dotComToSet.setLocationCells(placeList);
		}
		
		com.fileInput();
		
	}
	
	void startPlaying() {
		while (!dotComList.isEmpty()) {
			String lookOn = helper.getUserInput("lock on!");
			checkUserGuess(lookOn);
		}
		finishGame();
	}
	
	void checkUserGuess(String userGuess) {
		numOfGuess++;
		String result = "miss";
		for (DotCom dotComTest : dotComList) {
			result = dotComTest.Check(userGuess);
			if (result.equals("hit")) {
				System.out.println();
				System.out.println(dotComTest.getName() + " " + "に当たった！");
				System.out.println(dotComTest.getName() + " " + "「痛い！」");
				System.out.println();
				break;
			}
			if (result.equals("kill")) {
				System.out.println();
				dotComList.remove(dotComTest);
				System.out.println(dotComTest.getName() + "を倒した！");
				System.out.println(dotComTest.getName() + "「やられたー！」");
				System.out.println();
				break;
			} 
		}
		System.out.println(result);
	}
	
	void finishGame() {
		if (numOfGuess == 9) {
			System.out.println("input" + " " + numOfGuess + "you are perfect !");
		} else if (numOfGuess <= 12) {
			System.out.println("you are strong");
		} else if (numOfGuess <= 18) {
			System.out.println("input" + " " + numOfGuess +"普通");
		} else {
			System.out.println("input" + " " + numOfGuess + "出なおしてこいや！");
		}
 	}
}
