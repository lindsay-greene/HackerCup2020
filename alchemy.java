import java.io.*; 
import java.util.*; 

public class alchemy {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("alch1.out")));
		int T = input.nextInt();
		for(int t = 0; t < T; t++) {
			int N = input.nextInt();
			String C = input.next();
			int a = 0;
			int b = 0;
			String ans = "";
			for(int i = 0; i < N; i++) {
				if(C.charAt(i) == 'A') a += 1;
				else b += 1;
			}
			if(Math.abs(a - b) > 1) ans = "N";
			else ans = "Y";
			System.out.println("Case #" + (t + 1) + ": " + ans);
			out.println("Case #" + (t + 1) + ": " + ans);
		}
		out.flush();
		out.close();
	}
}
