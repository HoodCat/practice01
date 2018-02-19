package practice01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Prob05 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = 1;
		while(num < 100) {
			String numStr = String.valueOf(num);
			if(numStr.contains("3") || numStr.contains("6") || numStr.contains("9")) {
				bw.write(String.valueOf(num) + " ");
				for(int i=0 ; i<numStr.length() ; i++) {
					char c = numStr.charAt(i);
					if(c == '3' || c == '6' || c == '9') {
						bw.write("짝");
					}
				}
				bw.write("\n");
			}
			num++;
		}
		
		bw.flush();
	}
}
