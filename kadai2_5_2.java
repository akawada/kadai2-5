import java.util.Scanner;

public class kadai2_5_2 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		Integer num=0;

		// ���͂̌J��Ԃ�
		while (true) {
			System.out.println("1~100�̐��l����͂��Ă��������B");
			strin = scan.next();
			// ���l�`�F�b�N
			if (chknum(strin)){
				num = Integer.parseInt(strin);
				scan.close();
				break;
			}
			else{
				System.err.println("�s���Ȑ��l�ł��B������x���͂��Ă��������B");
			}
		}
		for (int i = 1; i <= num; i++){
			//������ϊ�
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
					
			//3��5�̔{��
			if(i%15 == 0){
				System.out.println("�A�z���ۂ����ɂȂ�܂���");
			}
			//3�̔{���A3����
			else if(i%3 == 0 || chkstr10.equals("3") || chkstr1.equals("3")){
				System.out.println("�A�z�ɂȂ�܂���");
			}
			//5�̔{��
			else if(i%5==0){
				System.out.println("���ɂȂ�܂���");
			}
			else{
			//����
				System.out.println(i);
		}
	}
}
	// ���l�`�F�b�N
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
