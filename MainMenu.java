import java.util.Scanner;

public class MainMenu {

    public static Scanner scan = new Scanner(System.in);
    public static int array[];

    public static void main(String[] args) {
        mainMenu();
        choosingOptionFromMainMenu();
    }

    public static void choosingOptionFromMainMenu() {
        System.out.print("\nIzberete opciq ot Glavnoto menuto: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                arrayInput();
                System.out.print("\nIzberete opciq ot Podmenuto: ");
                int choice2 = scan.nextInt();
                switch (choice2) {
                    case 1:
                        primeNumbers(array);
                        break;
                    case 2:
                        mostFrequentElement(array);
                        break;
                    case 3:
                        longestIncreasingSubArray(array);
                        break;
                    case 4:
                        longestDecreasingSubArray(array);
                        break;
                }
        }
    }

    public static void mainMenu() {
        System.out.println("Glavno menu: ");
        String one = "Rabota s chisla";
        String two = "Rabota s dumi";
        String three = "Izhod ot programata";

        System.out.println(one + "\n" + two + "\n" + three);
    }

    public static void arrayInput() {
        System.out.println("Vyvedete kolko na broi chisla shte vyvejdate:");
        int arraySize = scan.nextInt();

        array = new int[arraySize];

        System.out.println("Vyvedete chislata na masiva: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
            while (i < 0 && i > 10000) {
                System.out.println("Vyvedete otnovo: ");
                array[i] = scan.nextInt();
            }
        }
    }

    public static void primeNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print("Prostite chisla sa: " + array[i]);
            }
        }
    }

    public static void mostFrequentElement(int[] array) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int tempElement = array[i];
            int tempCount = 0;
            for (int j = 0; j < array.length; j++)
                if (array[j] == tempElement)
                    tempCount++;
            if (tempCount > count++) {
                element = tempElement;
            }
        }
        System.out.println("Nai-chesto sreshtaniq element e: " + element);
    }

    public static void longestIncreasingSubArray(int[] array) {
        int max = 1, len = 1, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                len++;
            else {
                if (max < len) {
                    max = len;
                    maxIndex = i - max;
                }
                len = 1;
            }
        }
        if (max < len) {
            max = len;
            maxIndex = array.length - max;
        }
        for (int i = maxIndex; i < max + maxIndex; i++)
            System.out.print(array[i] + " ");
    }

    public static void longestDecreasingSubArray(int[] array) {

    }
}

