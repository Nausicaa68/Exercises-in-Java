public class Main {
    public static void main(String[] args) {
        int x = 7, y = 4;
        Integer[] array = {1,2,3,4,15,6,7,8,9};

        System.out.printf( "Multiplication of %d times %d = %d", x, y, recursiveMultiplication(x,y) );
        System.out.println();
        System.out.printf( "Max element : %d", maxElement(array, (array.length - 1)) );
    }

    private static int maxElement(Integer[] array, int index) {
        if(index>0){
            return Math.max(array[index], maxElement(array, index-1));
        }
        else{
            return array[0];
        }
    }

    public static int recursiveMultiplication(int x, int y){
        if(y == 1){
            return x;
        }
        else{
            return x + recursiveMultiplication(x,y-1);
        }
    }
}
