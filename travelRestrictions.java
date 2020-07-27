import java.io.*; 
import java.util.*; 

public class travelRestrictions {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tR1.out")));
		int T = input.nextInt();
		for(int t = 0; t < T; t++) {
			System.out.println("Case #" + (t + 1) + ":");
			out.println("Case #" + (t + 1) + ":");
			int N = input.nextInt();
			String I = input.next();
			String O = input.next();
			boolean[][] a = new boolean[N][N];
			for(int i = 0; i < N; i++) {
				a[i][i] = true;
				for(int j = i + 1; j < N; j++) {
					if(I.charAt(j) == 'Y' && O.charAt(j - 1) == 'Y') a[i][j] = true;
					else break;
				}
				for(int j = i - 1; j >= 0; j--) {
					if(I.charAt(j) == 'Y' && O.charAt(j + 1) == 'Y') a[i][j] = true;
					else break;
				}
				String ans = "";
				for(int j = 0; j < N; j++) {
					if(a[i][j]) ans += 'Y';
					else ans += 'N';
				}
				System.out.println(ans);
				out.println(ans);
			}
		}
		out.flush();
		out.close();
	}
}

