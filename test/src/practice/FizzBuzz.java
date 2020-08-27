package practice;

import java.io.IOException;

public class FizzBuzz {

	public static void main(String[] args) throws IOException {


//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);

//
//		コンソールにキーボードから直接入力をした値を使いたいとき
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		int suu = Integer.parseInt(str);

//		３の倍数のときFiZZを表示、５の倍数のときBuzzを表示、１５の時にFizzBuzzを表示

		for(int i= 1; i<=100; i++) {
			if(i % 3 ==0 && i % 5==0 ) {
				System.out.println("値はFizzBuzzです。");
			}else if(i%3 ==0){
				System.out.println("値はFizzです。");
			}else if(i%5 ==0){
				System.out.println("値はBuzzです。");
			}
}

	}

}
