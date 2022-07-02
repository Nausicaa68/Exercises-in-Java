import javax.swing.JOptionPane;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("PROGRAMMING EXERCISES 5 : Is Prime");

        int aNumber = getNumber();
        boolean result = isPrimeNumber(aNumber);
        JOptionPane.showMessageDialog(null,
                String.format("Is %d a prime number : %b%n", aNumber, result)
        );

        /* to verify our algorithm, we verify for the first 100 numbers */
        for(int i=1 ; i<100 ; i++){
            System.out.printf("%d : %b%n", i, isPrimeNumber(i));
        }

    }

    private static int getNumber(){
        return Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));
    }

    private static boolean isPrimeNumber(int number){
        for(int i=2 ; i<number ; i++){
            if(number % i ==0) {
                return false;
            }
        }
        return true;
    }
}
