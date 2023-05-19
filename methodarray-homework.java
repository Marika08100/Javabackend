import java.util.Arrays;
import java.util.Random;

public class Tomb_visszateresi_ertek {
    /*
     * Itt, a main() metódusban tudod letesztelni a megírt metódusaid!
     * (Itt már csinálhatsz kiíratást!)
     */
    public static void main(String[] args) {
        // Tömbök kiíratásánál használd az Arrays.toString()-et!
//        System.out.println(Arrays.toString(getBasicArray()));
//        System.out.println(Arrays.toString(getBasicArray_ShorterSolution()));
//        System.out.println(Arrays.toString(getBasicArray_ShortestSolution()));
//
//        System.out.println(Arrays.toString(returnTheSameArray(new int[]{8, 5, 2})));
//        System.out.println(Arrays.toString(getArray()));
//        System.out.println(Arrays.toString(array()));
//    System.out.println(Arrays.toString(arrayfifthy()));
//        System.out.println(Arrays.toString(arrayi()));
//        System.out.println(Arrays.toString(getArrayint(3)));
//        System.out.println(Arrays.toString(arrayGeneratorr(6)));
//        System.out.println(Arrays.toString(feltoltott(3, 5)));
//        System.out.println(Arrays.toString(getSequentialArray(1, 6)));
//        System.out.println(Arrays.toString(getEvenNumbers(6)));
//        System.out.println(Arrays.toString(getEvenNumbersArray(6, 7)));
//        System.out.println(Arrays.toString(returnTheSameArray(new int[]{1, 2, 3, 4, 56})));
//        System.out.println(Arrays.toString(makeArrayFromFour(6, 8, 9, 10)));
//        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3, 4, 8, 9, 10})));
//        System.out.println(Arrays.toString(arrayRandom(9,1,8)));
    }

     /*
    Ide kerülnek majd az általad írt metódusok!
    Ebben a feladatban csak valamilyen tömb visszatérési értékű metódusokat kell írnod!
    A METÓDUSAID NE ÍRJANAK KI A KÉPERNYŐRE SEMMIT, CSAK ADJÁK VISSZA A KÉRT ÉRTÉKEKET!
     */

    // TODO Írj egy metódust, ami visszaad egy int tömböt, aminek első eleme 1, a második 8!
    // Alább találsz több példát ugyanennek a megvalósítására!
    public static int[] getBasicArray() {
        int[] visszaadandoTomb = new int[2];
        visszaadandoTomb[0] = 1;
        visszaadandoTomb[1] = 8;
        return visszaadandoTomb;
    }

    public static int[] getBasicArray_ShorterSolution() {
        int[] tomb = {1, 8};
        return tomb;
    }

    public static int[] getBasicArray_ShortestSolution() {
        return new int[]{1, 8};
    }

    // TODO Írj egy metódust, ami visszaad egy int tömböt, aminek az első eleme 8, a második 10, a harmadik 12!
    // Szorgalmi: csináld meg for ciklussal!

    public static int[] getArray() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = 8 + i * 2;

        }
        return array;
    }

    // TODO Írj egy metódust, ami visszaad egy 100 hosszúságú int tömböt, aminek az értékei 1, 2, 3, ... és 100!
    public static int[] array() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        return array;
    }

    // TODO Írj egy metódust, ami visszaad egy 50 hosszúságú int tömböt aminek az értékei 200, 199, 198, ... és 151!
    public static int[] arrayfifthy() {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = 200 - i;

        }
        return array;
    }

    // TODO Írj egy metódust, ami visszaad egy 20 hosszúságú üres (alapértelmezett értékeket tartalmazó) int tömböt!
    public static int[] arrayi() {
        int[] array = new int[20];
        return array;
    }

    // TODO Írj egy metódust, ami visszaad egy adott hosszúságú üres (alapértelmezett értékeket tartalmazó) int tömböt!
    // Az adott hosszúság azt jelenti, hogy paraméterként kapod!
    public static int[] getArrayint(int lenght) {
        int[] array = new int[lenght];
        return array;
    }

    // TODO Írj egy metódust, ami visszaad egy adott hosszúságú csupa 9-esekkel feltöltött tömböt!
    public class arrayGenerator {
        public static int[] generateArrayWithNines(int length) {
            int[] array = new int[length];

            for (int i = 0; i < length; i++) {
                array[i] = 9;
            }

            return array;
        }
    }

    // TODO Írj egy metódust, ami visszaad egy adott hosszúságú int tömböt, aminek az értékei: 0, 1, 2, ... hossz-1!
    public static int[] arrayGeneratorr(int arrayLenght) {
        int[] array = new int[arrayLenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        return array;
    }


    // TODO Írj egy metódust, ami visszaad egy adott hosszúságú int tömböt, aminek az értékei: hossz-1, hossz-2, ..., 0!
    public static int[] reversedArray(int number) {
        int[] array = new int[number];
        int value = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value--;
        }
        return array;
    }

    // TODO Írj egy metódust, ami visszaad egy adott hosszúságú int tömböt és feltölti egy adott számmal minden indexét!
    // Tehát paraméterként kapod azt, is hogy mekkora tömböt kell létrehozni és azt is, hogy milyen számmal kell
    // feltölteni minden egyes elemét (minden elem u.az lesz)
    public static int[] arrayGenerator(int lenght, int number) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = number;


        }
        return array;

    }

    // TODO Írj egy metódust, ami kap paraméterként két számot és visszaad egy attól-addig "tartó" tömböt!
    // Példa: getSequentialArray(4, 9) adja vissza ezt a tömböt: {4, 5, 6, 7, 8, 9}
    // Mekkora lesz a tömböd? Hogyan számolod ki?
    public static int[] getSequentialArray(int start, int end) {
        if (end < start) {
            return new int[]{-1};
        }
        int lenght = end - start;
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = start + i;

        }
        return array;
    }

    // TODO Írj egy metódust, ami kap paraméterként egy darabszámot és visszaad egy tömböt az első annyi darab páros
    // számmal 0-tól kezdve! (A nulla is párosnak minősül.)
    public static int[] getEvenNumbers(int count) {
        int[] array = new int[count];
        int number = 0;
        int index = 0;

        while (index < count) {
            if (number % 2 == 0) {
                array[index] = number;
                index++;
            }
            number++;
        }

        return array;
    }


// TODO Írj egy metódust, ami kap paraméterként egy darabszámot és egy kezdőértéket ls visszaad egy tömböt az első
//  annyi darab páros számmal az adott számtól kezdve!
// FONTOS: Ügyelj rá, hogy akkor is jól működjön a metódusod, ha páratlan számot kapsz kezdőszámként!

    public static int[] getEvenNumbersArray(int count, int Startnumber) {
        int[] array = new int[count];
        int number = Startnumber;
        int index = 0;
        while (index < count) {
            if (number % 2 == 0) {
                array[index] = number;
                index++;
            }
            number++;
        }

        return array;

    }

    // TODO Írj egy metódust, ami kap paraméterként egy int tömböt és visszaadja ugyanazt a tömböt!
// (Ennek nem sok haszna van, csak egy példa)
    public static int[] returnTheSameArray(int[] array) {
        return array;
    }

    // TODO Írj egy metódust, ami kap paraméterként 3 db számot és ezeket a számokat "összefűzi" egy tömbbe és ezzel tér vissza!
    public static int[] makeArrayFrom(int first, int second, int third) {
        return new int[]{first, second, third};
    }

    public static int[] makeArrayFrom_LongerSolution(int first, int second, int third) {
        int[] result = new int[3];
        result[0] = first;
        result[1] = second;
        result[2] = third;
        return result;
    }

    // TODO Írj egy metódust, ami kap paraméterként 4 db számot és ezeket a számokat "összefűzi" egy tömbbe és ezzel tér vissza!
    // SZORGALMI: Úgy is oldd meg a feladatot, hogy egy már megírt metódusodat használja (hívja meg)!
    public static int[] makeArrayFromFour(int first, int second, int third, int fourth) {
        return new int[]{first, second, third, fourth};

    }

    public static int[] makeArrayFrom_LongerSolutionOfFour(int first, int second, int third, int fourth) {
        int[] array1 = {first, second};
        int[] array2 = {third, fourth};
        return concatenateArrays(array1, array2);
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        int[] result = new int[length1 + length2];

        return result;
    }

    // TODO Írj egy metódust, ami kap paraméterként egy int tömböt és visszaad egy új tömböt, ami az eredeti fordítottja!
    // Tehát az első elem lesz az utolsó. Pl. {-3, 7, 0, 1}-re: {1, 0, 7, -3}
    public static int[] reversedArray(int[] array) {
        int lenght = array.length;
        int[] reversed = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            reversed[i] = array[lenght - 1 - i];


        }
        return reversed;
    }

    // TODO Írj egy metódust, ami paraméterként kap egy méretet, egy alsó- és egy felsőlimitet és visszaadja a kért
    // hosszúságú tömböt random számokkal feltöltve a limiteken belül (a határokat is beleértve)!
    public static int[] arrayRandom(int size, int limitDown, int limitUp) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] = random.nextInt(limitDown,limitUp+1);

        }
        return array;
    }

}
