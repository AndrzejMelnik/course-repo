public class AlgorithmBubble {
	public static void main(String[] args) {
		int[] tab = {5, 4, 3, 2, 1};
		int n = tab.length;
		int temp;
		int count;	
		do {
			count = 0;
			for(int i = 0; i < tab.length - 1; i++) {
				count++;
				if((tab[i] > tab[i + 1])) {	
					temp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = temp;	
				}
			}	    
		  n--;
		} while (n > 1);	
		System.out.println("Liczba powtorzen: " + count);
		System.out.println("Posortowana tablica: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}
}

		
	

	
	


	


