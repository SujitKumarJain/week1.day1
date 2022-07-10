package week1day1;

public class FibinocciSeries {

	public static void main(String[] args) {
		int firstnum =0;
		int secnum = 1;
		int sum = 0;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 0; i < 9; i++) {
			sum = firstnum+secnum;
			System.out.println(sum);
			firstnum = secnum;
			secnum = sum;
			
			
			
		}
	}
}
