
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		try {
			int num=Integer.parseInt(bf.readLine());
			for(int i=num; i>0; i--) {
				sb.append(i).append("\n");
			}
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
