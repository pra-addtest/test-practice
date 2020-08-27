package sample;

public class JSample5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int num ;
String kekka;

num = 9 ;
//↓kekkaという変数。hantei()のメソッドに
//９の値が入った変数を実引数として渡している。
//その結果得られる値を、kekkaの変数に代入している。
kekka= hantei(num );
System.out.println(num + "は"+kekka);


num = 6;
kekka = hantei(num);
System.out.println(num + "は" + kekka);

}//メインメソッド↑はここまで（呼び出し元）　　
//					↓戻り値の型　　↓仮引数の型
	private static String hantei(int n) {
		if(n % 2 == 0) {
			return "偶数";
		}else {
			return "奇数";

		}
	}
}
