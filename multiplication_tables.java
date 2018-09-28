
public class multiplication_tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		// 输出完成的表
		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------");

		for (i = 1; i < 10; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------");

		for (int k = 9; k > 0; k--) {
			for (int m = 1; m <= k; m++) {
				System.out.print(k + "*" + m + "=" + k * m + "\t");
			}
			System.out.println();
		}
	}
}
