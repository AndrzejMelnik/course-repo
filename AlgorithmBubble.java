public class AlgorithmBubble {

  public static void main(String[] args) {
    int[] inputArray1 = {1, 2, 3, 4};
    int[] correctResult1 = {1, 2, 3, 4};
    int[] sortedArr1 = AlgorithmBubble.sortArray(inputArray1);
    AlgorithmBubble.checkIfResultIsCorrect(sortedArr1, correctResult1);

    int[] inputArray2 = {3, 4, 2, 1};
    int[] correctResult2 = {1, 2, 3, 4};
    int[] sortedArr2 = AlgorithmBubble.sortArray(inputArray2);
    AlgorithmBubble.checkIfResultIsCorrect(sortedArr2, correctResult2);
  }

  private static int[] sortArray(int[] inputArray) {
    int n = inputArray.length;
    int temp;
    int count = 0;
    int flag;
    do {
      flag = 0;
      for (int i = 0; i < inputArray.length - 1; i++) {
        //flag = 0;
        count++;
        if ((inputArray[i] > inputArray[i + 1])) {
          temp = inputArray[i];
          inputArray[i] = inputArray[i + 1];
          inputArray[i + 1] = temp;
          flag = 1;
        }
      }
      if (flag == 0) {
        break;
      }
      n--;
    } while (n > 1);
    return inputArray;
//    Nie wiem czy ten print jest potrzebny, jak potrzebujesz to odkomentuj
//    System.out.println("Liczba porownan: " + count);
//    W tym podejsciu ten print nie bedzie potrzebny
//    System.out.println("Posortowana tablica: ");
//    for (int i = 0; i < inputArray.length; i++) {
//      System.out.print(inputArray[i] + " ");
//    }
  }

  private static void checkIfResultIsCorrect(int[] sortedArr, int[] correctResult) {
    boolean isCorrect = true;
    if (sortedArr.length != correctResult.length) {
      System.out.println("Różne długości tablic. Wynik nie ma prawa być poprawny");
      return;
    }
    for (int i = 0; i < correctResult.length; i++) {
      if (sortedArr[i] != correctResult[i]) {
        isCorrect = false;
        break;
      }
    }
    if (isCorrect) {
      System.out.println("Obliczenia poprawne.");
    }
    if (!isCorrect) {
      System.out.println("Obliczenia błędne.");
    }
  }
}











