import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bs = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String Min = bf.readLine();	
			StringTokenizer st = new StringTokenizer(Min, " ");
			int  A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bs.write(String.valueOf(A+B)+"\n");
			bs.write(String.valueOf(A-B)+"\n");
			bs.write(String.valueOf(A*B)+"\n");
			bs.write(String.valueOf(A/B)+"\n");
			bs.write(String.valueOf(A%B)+"\n");
			bs.close();
			bf.close();
		}
		catch(IOException e) {
			System.out.println("Waring");
		}
	}
}
