public class RecursiveStringMethod {
/*
    3.      Logic to reverse a string - using the recursive method
    IF THE input is “Good” , output should be “dooG”
    IF THE input is “G” , output should be “G”
    Write unit tests for the same
*/
    public String reverseString(String str) {
        if (str.isEmpty()) {
            System.out.println("String is Empty");
            return str;
        }
        else {
            return reverseString(str.substring(1)+str.charAt(0));
        }
    }

    public static void main(String[] args) {

            RecursiveStringMethod rs = new RecursiveStringMethod();
            String result= rs.reverseString("Good");
        System.out.println(result);

    }
}