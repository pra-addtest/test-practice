package sample;

public class Modoriti {
//	int suu ;
//	String moji ;

	String keisan(int i) {
		if(i <= 20 && i%2==0) {
		}else {
			return "それ以外の数字です" ;
		}
		return "20以上で,"
				+ "偶数です。";

	}
//もし、リターン文のメソッドが複数あったとしても、
//	return文は一度リターンされたら、それ以降のリターン文は
	//実行されないので注意。リターン文で判別したいときは
	//elseでそれ以外のコードを描く。
//	int calculate(int n) {
//		int sum = 0 ;
//		for(int i=1 ; i<=25; i++) {
//			sum += i;
//		}
//		return sum;
//
//	}

}
