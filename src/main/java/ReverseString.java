public class ReverseString {
/*
2.      Logic to reverse a string
    If the input is “Test” output should be “tseT”
    Write unit tests for this program
*/



   /*public static void main(String[] args) {


    }
*/
    public void ReverseString(String Test) {

        String string = "Test";
        String revstring="";

        for (int i = string.length()-1; i >= 0; i--)
        {
            revstring=revstring+string.charAt(i);
            System.out.println(revstring);
        }
    }
}
