import java.util.Scanner;

/**
 * Klas realizirasht opciite ot menu
 *
 *
 * @author Iskren Kostov
 */
public class HomeWork6 {

    public static Scanner scan = new Scanner(System.in);
    public static int array[];
    public static String arr[];

    public static void main(String[] args) {
        mainMenu();
        choosingOptionFromMainMenu();
    }

    /**
     * Metod koito dava dostyp za izbor ot menuto i
     * realizira izbora
     */
    public static void choosingOptionFromMainMenu() {
        System.out.print("\nIzberete opciq ot Glavnoto menuto: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                arrayOfNumbersInput();
                submenuforOptionOne();
                System.out.print("\nIzberete opciq ot Podmenuto: ");
                int choice2 = scan.nextInt();
                if (choice2==1) {
                    primeNumbers(array);
                    submenuforOptionOne();
                    System.out.print("\nIzberete opciq ot Podmenuto: ");
                    choice2 = scan.nextInt();
                }
                         if(choice2==2) {
                             mostFrequentElement(array);
                             submenuforOptionOne();
                             System.out.print("\nIzberete opciq ot Podmenuto: ");
                             choice2 = scan.nextInt();
                         }
                    if(choice2==3) {
                        longestIncreasingSubArray(array);
                        submenuforOptionOne();
                        System.out.print("\nIzberete opciq ot Podmenuto: ");
                        choice2 = scan.nextInt();
                    }
                    if(choice2==4) {
                        longestDecreasingSubArray(array);
                        submenuforOptionOne();
                    }
                    if(choice2==5) {
                        longestEqualSubArray(array);
                        submenuforOptionOne();
                        System.out.print("\nIzberete opciq ot Podmenuto: ");
                        choice2 = scan.nextInt();
                    }
                    if(choice2==7){
                        mainMenu();
                        choosingOptionFromMainMenu();
                }

            case 2:
                arrayOfStringsInput();
                subMenuForOptionTwo();
                System.out.print("\nIzberete opciq ot Podmenuto: ");
                 choice2 = scan.nextInt();
                 if (choice2==1) {
                         reverseWords(arr);
                         subMenuForOptionTwo();
                         System.out.print("\nIzberete opciq ot Podmenuto: ");
                         choice2 = scan.nextInt();
                 }
                     if(choice2==2) {
                         repeatedSymbolsInWords(arr);
                         submenuforOptionOne();
                         System.out.print("\nIzberete opciq ot Podmenuto: ");
                         choice2 = scan.nextInt();
                     }
                     if(choice2==3) {
                         countSymbolsInWord(arr);
                         subMenuForOptionTwo();
                         System.out.print("\nIzberete opciq ot Podmenuto: ");
                         choice2 = scan.nextInt();
                     }
                     if(choice2==4) {
                         repeatingWords(arr);
                         subMenuForOptionTwo();
                         System.out.print("\nIzberete opciq ot Podmenuto: ");
                         choice2 = scan.nextInt();
                     }
                     if(choice2==5){
                         mainMenu();
                         choosingOptionFromMainMenu();
                 }
                     case 3:
                          programExit();
        }
    }

    /**
     * Metod, koito printira Glavnoto Menu
     */
    public static void mainMenu() {
        System.out.println("Glavno menu: ");
        String one = "1. Rabota s chisla";
        String two = "2. Rabota s dumi";
        String three = "3. Izhod ot programata";

        System.out.println(one + "\n" + two + "\n" + three);
    }

    /**
     * Metod, koito printira podmenuto za rabota s chisla
     */
    public static void submenuforOptionOne(){
        System.out.print("\nPodmenu\n");
        String one= "1. Izvejdane samo na prostite chisla ot masiva";
        String two="2. Izvejdae na nai-chesto sreshtan element v masiva";
        String three="3. Izvejdae na maximalna redica ot narastvashti elementi v masiva";
        String four="4. Izvejdae na maximalna redica ot namalqvashti elementi v masiva";
        String five="5. Izvejdae na maximalna redica ot ednakvi elementi v masiva";
        String six="6. Izvejdane na posledovatelnost ot chisla ot masiva,koito imat suma ravan na chislo, generirano na sluchaen princip";
        String seven ="7. Vryshtane nazad kym glavnoto menu";

        System.out.print(one + "\n" + two + "\n" + three + "\n" + four +
                "\n" + five + "\n" + six + "\n" + seven);
        }

    /**
     * Metod, koito printira podmenuto za rabota s dumi
     */
    public static void subMenuForOptionTwo(){
        System.out.print("Podmenu\n");
        String one="1. Obyrnete bukvite na dumite ot masiva naobratno i gi vizualiziraite v konzolata";
        String two="2. Izvedete broq na povtarqshtite se simvoli za vsqka edna ot dumite v masiva";
        String three="3. Izvedete broq na simvolite za vsqka edna ot dumite v masiva";
        String four="4. Izvedete broq na povtarqshtite se dumi ot masiva";
        String five="5. Vryshtane nazad kym menuto";

            System.out.print(one + "\n" + two + "\n" + three + "\n" + four +
                    "\n" + five );
        }

    /**
     * Metod, s kotio vyvejdame broq chisla  i samite chisla
     */
    public static void arrayOfNumbersInput() {
        System.out.println("Vyvedete kolko na broi chisla shte vyvejdate:");
        int arraySize = scan.nextInt();

        array = new int[arraySize];

        System.out.println("Vyvedete chislata na masiva: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
            if (array[i] < 0 || array[i] > 10000) {
                System.err.println("Nqkoe chislo ne e v kriteriite. Vyvedete otnovo: ");
                array[i] = scan.nextInt();
            }
        }
    }

    /**
     * Metod , s koito vyvejdame broq dumi i samite dumi
     */
    public static void arrayOfStringsInput(){
        System.out.println("Vyvedete kolko na broi dumi she vyvejdate:");
        int arraySize = scan.nextInt();

        arr= new String[arraySize];

        System.out.println("Vyvedete dumite na masiva: ");
        for(int i=0;i<arraySize;i++){
            arr[i] = scan.next();
            if(arr[i].length() > 20){
                System.err.println("Nqkoq dumata ne e v kriteriq. Vyvedete otnovo: ");
                arr[i]=scan.next();
            }
        }
    }

    /**
     * Metod koito otkriva prostite chisla
     * @param array - masiva s koito rabotim (za chisla)
     */
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

    /**
     * Metod , koito otkriva nai-chesto sreshtanoto chislo
     * @param array
     */
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

    /**
     * Metod, koito otkriva nai-dylgata redica ot narastvashti elementi
     * @param array
     */
    public static void longestIncreasingSubArray(int[] array) {

        int longest = 0;
        int current = 0;
        int indexOfFirstElement = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1] - 1) {

                current++;

                if (current > longest) {
                    longest = current;
                    indexOfFirstElement = i - longest + 1;
                }
            } else {
                current = 0;
            }
        }

        int[] Array = new int[longest + 1];
        for (int i = 0; i < longest + 1; i++) {
            Array[i] = array[indexOfFirstElement];
            indexOfFirstElement++;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    /**
     * Metod koito otkriva nai-dylgata redica ot namalqvashti elementi
     * @param array
     */
    public static void longestDecreasingSubArray(int[] array) {

        int longest = 0;
        int current = 0;
        int indexOfFirstElement = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] + 1) {
                current++;
                if (current > longest) {
                    longest = current;
                    indexOfFirstElement = i - longest + 1;
                }
            } else {
                current = 0;
            }
        }

        int[] Array = new int[longest + 1];
        for (int i = 0; i < longest + 1; i++) {
            Array[i] = array[indexOfFirstElement];
            indexOfFirstElement++;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        /**
         * Metod ,koito namira nai-dylgata redica ot ednakvi elementi
         */
    }
    public static void longestEqualSubArray(int[] array) {

        int longest = 0;
        int current = 0;
        int indexOfFirstElement = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                current++;
                if (current > longest) {
                    longest = current;
                    indexOfFirstElement = i - longest + 1;
                }
            } else {
                current = 0;
            }
        }

        int[] Array = new int[longest + 1];
        for (int i = 0; i < longest + 1; i++) {
            Array[i] = array[indexOfFirstElement];
            indexOfFirstElement++;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    /**
     * Metod ,koito obryshta dumite naobratno
     * @param arr - masiva s koito rabotim (za dumi)
     */
    public static void reverseWords(String[] arr) {
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = new StringBuilder(arr[i]).reverse().toString();
                System.out.println(arr2[i]);
            }
        }

    /**
     * Metod ,koito preobroqva kolko povtarqshti se simvoli ima v nqkolko dumi
     * @param arr
     */
        public static void repeatedSymbolsInWords(String[] arr) {
        int repeatedSymbols =0;
        int symbolsCounter=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                for(int k=j+1;k<arr[i].length();j++){
                    if(arr[i].charAt(j) == arr[i].charAt(k)){
                        symbolsCounter++;
                        repeatedSymbols= arr[i].charAt(j);
                        System.out.println(arr[i] + " - broj povtarqshti se simvoli - " + symbolsCounter + " : " + repeatedSymbols);
                    }
                }
                symbolsCounter = 1;
                }
            }
        }

    /**
     * Metod ,koito prebroqva simvolite v duma
     * @param arr
     */
    public static void countSymbolsInWord(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - брой символи: " + arr[i].length());
        }
    }

    /**
     * Metod ,koito prebroqva kolko povtarqshti se dumi ima
     * @param arr
     */
    public static void repeatingWords(String[] arr) {
        String temp = null;
        int counter = 1;
        int currentCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    counter++;
                    temp = arr[i];
                    currentCounter = counter;
                    System.out.println( temp + " - broi povtoreniq : " + currentCounter );

                }

            }
            counter = 1;
        }
    }

    /**
     * Metod za izhod ot programata
     */
    public static void programExit(){
        System.exit(0);
    }
}


