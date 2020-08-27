package sample;

public class JSample5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int kekka;

kekka = bai(9);
System.out.println(kekka);
kekka = bai(10);
System.out.println(kekka);


	}
	//戻り値のあるメソッド
	private static int bai(int n) {
		return n* 2;
	}
//bai(int n)のメソッドを呼び出しているのは
	//mainメソッドのため、sysoutの（kekka）に
	//呼び出し元に帰っている。
}
