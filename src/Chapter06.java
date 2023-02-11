
public class Chapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//プリミティブ型の「long」の変数に値(10000000000)を代入して出力
		//long型は数値の後ろにLをつけてlong型であることを明示すること！
		long num1 = 10000000000L;
		System.out.println(num1);
		
		//プリミティブ型の「double」の変数に値(3.14)を代入して出力
		double num2 = 3.14;
		System.out.println(num2);
		
		//プリミティブ型の「boolean」の変数(true)に値を代入して出力
		boolean boolean1 = true;
		System.out.println(boolean1);
		
		//ラッパークラスの「Integer」の変数に値(100)を代入して出力
		Integer num3 = 100;
		System.out.println(num3);
		
		//ラッパークラスの「Float」の変数に値(1.4142)を代入して出力
		Float num4 = 1.4142F;
		System.out.println(num4);
		
		//ラッパークラスの「Character」の変数に値('う')を代入して出力
		Character moji = 'う';
		System.out.println(moji);
		
		//要素数が5の「int」配列に値({ 0, 10, 20, 30, 40 })を代入して、インデックス番号が3の値を出力
		int[] array1 = new int []{ 0, 10, 20, 30, 40 };
		System.out.println(array1[3]);
	}

}
