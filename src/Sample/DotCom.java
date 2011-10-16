package Sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	
	void fileInput() {
		 try {
	            FileInputStream is = new FileInputStream("file.txt");
	            InputStreamReader in = new InputStreamReader(is, "SJIS");
	            BufferedReader br = new BufferedReader(in);
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            br.close();
	            in.close();
	        } catch (IOException e) {
	            System.out.println(e);
	        }
	}
}
