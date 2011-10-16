package Sample;

import java.util.ArrayList;

public class DotCom {
	String name;
	ArrayList<String> loc;
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}

	void setLocationCells(ArrayList<String> loc) {
		this.loc = loc;
	}

	String Check(String lookOn) {
		int index = loc.indexOf(lookOn);
		String result = "miss";
		if (index >= 0) {
			loc.remove(index);
			if (loc.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
}
