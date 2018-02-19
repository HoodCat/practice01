package practice01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Prob02 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 1 ; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				bw.write(String.format("%d ", i+j));
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
