public class Main {
    public static void main(String[] args) {
        backward("gravity");
        System.out.println("\nNumber of words is : "
                + wordCounter("Pump, Bump, and Dump Trump")
        );
    }

    public static void backward(String aString){
        for(int i=aString.length()-1 ; i>=0 ; i--){
            System.out.print(aString.charAt(i));
        }
    }

    public static int wordCounter(String aString){
        String[] arrOfString = aString.split(" ");
        return arrOfString.length;
    }
}
