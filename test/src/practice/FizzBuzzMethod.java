package practice;

public class FizzBuzzMethod 											{
//テストをしたい値を定数として、定める
 private static final String RES_FIZZBUZZ = "FizzBuzz";
 private static final String RES_FIZZ = "Fizz";
 private static final String RES_BUZZ = "Buzz";

public static String replyBasedOn(int i ) {
	// 判断してもらいたいのは値の判別。→仮引数には数字を入れる
	//テストの結果は３ならFizz、５ならBuzzと文字列を表示したい
	//そのため、仮引数はint型、それに応じて帰ってくる文字がString型
	//メソッド内の変数で、フィールド定数を代入している。
	String s;

	if(i %3 == 0 && i % 5 ==0 ) {
		s = RES_FIZZBUZZ ;
	}else if(i%3 == 0 ) {
		s = RES_FIZZ;
	}else if(i %5 ==0) {
		s = RES_BUZZ;
	}else {
		//  Integer.toString(i)でも同じ
		s = String.valueOf(i);
	}
	return s;
}

}
