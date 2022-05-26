/*5 Explain the logic for identifying that number is prime or not
LOGIC:PRIME:can be divided by it self or ---->ONLY 2 FACTOR-2,3,5,7
       COMPOSITE:can be divided by more then 2 number--->MORE THEN 2 FACTORS-8,12,15,
*/

public class PrimeNumber {

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <num; i++) {
            if (num % i == 0){
                return false;
        }
    }
    return true;
}

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(52));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(1));
        System.out.println(isPrimeNumber(33));
        System.out.println(isPrimeNumber(-3));
    }
}
