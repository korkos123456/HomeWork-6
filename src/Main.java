public class Main {
    public static int[] generateRendomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }
    //task1
    public static void task1() {
        var salaries = generateRendomArray();
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];

        }
        System.out.printf("Сумма трат за месяц составила %s рублей", sum);

    }
    //task2
    public static void main(String[] args) {
        var salaries = generateRendomArray();
        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (max < salaries[i]) {
                max = salaries[i];


            }
            if (min > salaries[i]) {
                min = salaries[i];
            }

        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);

    }
    //task3
    public static void task3()  {

        var salaries = generateRendomArray();
        int sum = 0;
        for (var salary : salaries ) {
            sum = salary;
        }
        var result = (double) sum / salaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", result );


        }

    public static void task4()  {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fulName = new char[reverseFullName.length];
        for (int reverseIndex = reverseFullName.length - 1, index = 0; reverseIndex >= 0; reverseIndex--, index ++) {
            System.out.print(reverseFullName[reverseIndex]);
        }
            System.out.printf("Итоговая строка %ы", String.valueOf(fulName));


    }


}
