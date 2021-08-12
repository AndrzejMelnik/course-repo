public class AlgorithmBubble {
	public static void main(String[] args) {
		int[] tab = {1, 2, 3};
		int n = tab.length;
		int temp;
		int count = 0;	
		int flag;
		do {
			flag = 0;
			for(int i = 0; i < tab.length - 1; i++) {
				//flag = 0;
				count++;
				if((tab[i] > tab[i + 1])) {	
					temp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = temp;	
					flag = 1;
				}	
			}	
			if(flag == 0) break;
		  n--;
		} while (n > 1);	
		System.out.println("Liczba porownan: " + count);
		System.out.println("Posortowana tablica: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}
}

		
	

	
	


	


