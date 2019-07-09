import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println();

        int aliz = 18;
        age(aliz);

        System.out.println();
        int alma = 30;
        shoppingList(alma);

        System.out.println();
        int celsius = 5;
        temperature(celsius);

        System.out.println();
        higherThan(getRandomInteger(10, 1), getRandomInteger(10, 1));

        System.out.println();
        divide(getRandomInteger(100, 1), getRandomInteger(100, 1));

        System.out.println();
        odd(getRandomInteger(100, -100));

        System.out.println();
        sort(getRandomInteger(50, -50), getRandomInteger(50, -50), getRandomInteger(50, -50));

        System.out.println();
        min(getRandomInteger(320, -110),getRandomInteger(320, -110),getRandomInteger(320, -110),getRandomInteger(320, -110),getRandomInteger(320, -110));

        System.out.println();
        num(getRandomInteger(200,0));

        System.out.println();
        numbersTo100();

        System.out.println();
        evenNumbersTo100();

        System.out.println();
        oddNumbersTo100();

        System.out.println();
        threeNumbersTo100();

        System.out.println();
        numbersFrom100();

        System.out.println();
        numbersAddFive(getRandomInteger(10,1));

        System.out.println();
        numbersXtoYInclude(getRandomInteger(3, 1), getRandomInteger(10,5));

        System.out.println();
        numbersXtoYExclude(getRandomInteger(3, 1), getRandomInteger(10,5));

        System.out.println();
        randomNumbersFromX(getRandomInteger(10,5), getRandomInteger(4,1), getRandomInteger(13,10));

        System.out.println();
        tickets(getRandomInteger(20,10));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void age(int a) {
        int b = a + 2;
        int cs = a - 5;
        System.out.println("Alíz életkora: " + a);
        System.out.println("Boborján életkora: " + b);
        System.out.println("Csilla életkora: " + cs);
        System.out.println("Koraik összege: " + (a + b + cs));
    }

    public static void shoppingList(double alma) {
        double banan = alma * 2;
        double citrom = alma * 3;
        double sumFruits = (alma + banan + citrom) / 100;
        System.out.println("Alma: " + alma + " dkg.");
        System.out.println("Banán: " + banan + " dkg.");
        System.out.println("Citrom: " + citrom + " dkg.");
        System.out.println("Összesen: " + sumFruits + " kg.");
    }

    public static void temperature(double celsius) {
        double kelvin = celsius + 273;
        double fahrenheit = celsius * 18 / 10 + 32;
        System.out.println("Ma " + celsius + " fokot mértünk Celsiusban.");
        System.out.println("Fahreinheitben: " + fahrenheit);
        System.out.println("Kelvinben: " + kelvin);
    }

    public static int getRandomInteger(int max, int min) {
        return ((int) (Math.random() * (max - min))) + min;
    }

    public static void higherThan(int x, int y) {
        System.out.println("Az x értéke: " + x);
        System.out.println("Az y értéke: " + y);
        if (x > y) {
            System.out.println("Az x nagyobb.");
        } else {
            System.out.println("Az y nagyobb vagy egyenlő.");
        }
    }

    public static void divide(int x, int y) {
        System.out.println("Az x értéke: " + x);
        System.out.println("Az y értéke: " + y);
        if ((x / y) >= 1) {
            System.out.println("Az x osztható y-al.");
        } else {
            System.out.println("Az x nem osztható y-al.");
        }
    }

    public static void odd(int x) {
        System.out.println("Az x értéke: " + x);
        if (x % 2 == 0) {
            System.out.println("A szám páros.");
        } else {
            System.out.println("A szám páratlan.");
        }
    }

    public static void sort(int x, int y, int z) {
        System.out.println("Az x értéke: " + x);
        System.out.println("Az y értéke: " + y);
        System.out.println("Az z értéke: " + z);
        int[] array = {x, y, z};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public static void min(double k, double l, double x, double y, double z) {
        System.out.println("Az k értéke: " + k);
        System.out.println("Az l értéke: " + l);
        System.out.println("Az x értéke: " + x);
        System.out.println("Az y értéke: " + y);
        System.out.println("Az z értéke: " + z);
        double[] array = {k, l, x, y, z};
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void num(int x) {
        System.out.println("Az x értéke: " + x);
        if(x > 9 && x < 100){
            int sum = 0;
            int even = 0;
            while (x > 0) {
                sum = sum + x % 10;
                x = x / 10;
                if( sum / 2 == 0){
                    even++;
                }
            }
            System.out.println("Páros számjegyek száma: " +even);
            System.out.println("Számjegyek összege: " + sum);
        } else {
            System.out.println("A szám nem kétszámjegyű.");
        }
    }

    public static void numbersTo100() {
        for(int i = 0; i < 101; i++){
            System.out.print(i + ",");
        }
    }

    public static void evenNumbersTo100() {
        for(int i = 0; i < 101; i++){
            if(i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
    }

    public static void oddNumbersTo100() {
        for(int i = 0; i < 101; i++){
            if(i % 2 == 0) {
            } else {
                System.out.print(i + ",");
            }
        }
    }

    public static void threeNumbersTo100() {
        for(int i = 0; i < 101; i++){
            if(i % 3 == 0 && i != 0) {
                System.out.print(i + ",");
            }
        }
    }

    public static void numbersFrom100() {
        for(int i = 100; i >= 0; i--){
            System.out.print(i + ",");
        }
    }

    public static void numbersAddFive(int x){
        System.out.println();
        int num = 5;
        System.out.println("A generált random szám: " +x);
        for(int i = 0; i < x; i++){

            System.out.print(num + ",");
            num += 5;
        }
    }

    public static void numbersXtoYInclude(int x, int y) {
        System.out.println();
        System.out.println("Az x értéke: " +x);
        System.out.println("Az y értéke: " +y);
        for(int i = x; i <= y; i++){
            System.out.print(i + ",");
        }
    }

    public static void numbersXtoYExclude(int x, int y) {
        System.out.println();
        System.out.println("Az x értéke: " +x);
        System.out.println("Az y értéke: " +y);
        for(int i = x+1; i < y; i++){
            System.out.print(i + ",");
        }
    }

    public static void randomNumbersFromX(int x, int y, int z){
        int num;
        System.out.println();
        System.out.println("Az x értéke: " +x);
        System.out.println("Az y értéke: " +y);
        System.out.println("A z értéke: " +  z);
        for(int i = 0; i < x; i++){
            if(y > z) {
                num = getRandomInteger(y, z);
                System.out.print(num + ",");
            } else {
                num = getRandomInteger(z, y);
                System.out.print(num + ",");
            }

            }

    }


    public static void tickets(int x) {
        int viewers = getRandomInteger(7,1);
        int age;
        System.out.println();
        x *= 100;
        System.out.println("Alap Mozijegy ára: " + x);
        System.out.println("Nézők száma: " + viewers);
        for(int i = 0; i < viewers; i++){
            age = getRandomInteger(99,1);
            if(age <= 5){
                System.out.println("Életkor: " + age + " Ingyenes mozijegy.");
            } else if ((age > 5 && age < 18) || age > 65) {
                x = x / 2;
                System.out.println("Életkor: " + age + " Mozijegy ára: " + x);
                x = x * 2;
            } else {
            System.out.println("Életkor: " + age + " Mozijegy ára: "+ x);
            }
            }
        }




}

