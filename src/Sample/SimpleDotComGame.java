package Sample;

import java.util.ArrayList;

public class SimpleDotComGame {
	public static void main(String[] args) {
		//new����
		SimpleDotCom dot = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		
		//�ϐ����w��
		int numOfGuess = 0;
		ArrayList<String> locations = new ArrayList<String>();
		String StringNumOfGuess = null;
		boolean isAlive = true;
		
		//�������擾���A�z��ɑ��
		int position =(int) (Math.random() * 5) + 1;
		for (int i = 0; i <= 2; i++) {
			String positionIn = Integer.toString(position + i);
			//System.out.println(positionIn);
			locations.add(positionIn);
		}
		
		//�擾�����������Z�b�g����
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
