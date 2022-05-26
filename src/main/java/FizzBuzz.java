public class FizzBuzz {


    public String fizzBuzz(int n) {
/*  Say Fizz if the number is divisible by 3.
·        Say Buzz if the number is divisible by 5.
·        Say FizzBuzz if the number is divisible by both 3 and 5.
·        Return the number itself if the number is not divisible by 3 and 5.*/

        if (n % 3 == 0 && n%5==0) //(n%15==0)
        {
            return("FIZZ-BUZZ");
        } else if (n % 5 == 0) {
            return("BUZZ");

        } else if (n % 3 == 0) {
            return("FIZZ");
        } else {
            return(Integer.toString(n));
        }

    }

    public  void main(String[] args) {
        fizzBuzz(30);
    }
}