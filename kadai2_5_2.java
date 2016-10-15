import java.util.Scanner;

public class kadai2_5_2 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		Integer num=0;

		// 入力の繰り返し
		while (true) {
			System.out.println("1~100の数値を入力してください。");
			strin = scan.next();
			// 数値チェック
			if (chknum(strin) == true){
				num = Integer.parseInt(strin);
				scan.close();
				break;
			}
			else{
				System.err.println("不正な数値です。もう一度入力してください。");
			}
		}
		for (int i = 1; i <= num; i++){
			//文字列変換
			String chkstr=Integer.toString(i);
			String chkstr1="";
			String chkstr10="";

			if (chkstr.length() == 2){
				chkstr10 = chkstr.substring(0, 1);
				chkstr1 = chkstr.substring(1, 2);
			}
			else{
				chkstr1 = chkstr.substring(0, 1);
			}
					
			//3と5の倍数
			if(i%15 == 0){
				System.out.println("アホっぽい犬になりました");
			}
			//3の倍数、3がつく
			else if(i%3 == 0 || chkstr10.equals("3") || chkstr1.equals("3")){
				System.out.println("アホになりました");
			}
			//5の倍数
			else if(i%5==0){
				System.out.println("犬になりました");
			}
			else{
			//数字
				System.out.println(i);
		}
	}
}
	// 数値チェック
	static boolean chknum(String numchk) {
		try {
			Integer.parseInt(numchk);
			if (Integer.parseInt(numchk) < 0){
				return false;
			}
			else if (Integer.parseInt(numchk) > 100){
				return false;
			}
			else{
				return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
