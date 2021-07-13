
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int i,count;
		double Max=0;
		double avg = 0;
		try {
			 count=Integer.parseInt(bf.readLine());
			 double[] score=new double[count];
			 StringTokenizer st= new StringTokenizer(bf.readLine());
			 for(i=0;i<count;i++) {
				 score[i]=Double.valueOf(st.nextToken());
				 
				 if(score[i]>Max) {
					 Max=score[i];
				 }
			 }
			for(i=0;i<count;i++) {
				avg +=(Math.round(score[i]/Max*100*100)/100.0)/count;
			}
			sb.append(avg);
			System.out.println(sb);
      bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
