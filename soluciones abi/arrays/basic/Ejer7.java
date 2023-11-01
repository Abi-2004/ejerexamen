package basic;

public class Ejer7 {

	public static void main(String[] args) {

		int[] num = new int[10];
		boolean ord = false;


		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 90 + 10);
			System.out.print(num[i] + " ");
		}

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				ord = true;
				
				if (num[j] > num[j + 1]) {

					int swap = num[j];
					num[j] = num[j + 1];
					num[j + 1] = swap;
					ord = false;
				}
			}
			if(ord==true) {
				break;
				
			}
		}



		System.out.println("array ordenado:");

		for (int i = 0; i < num.length; i++) {

			System.out.print("" +num[i] + " ");
		}

	}

}
