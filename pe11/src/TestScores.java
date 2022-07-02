public class TestScores {

    private final Integer[] tab;

    public TestScores(Integer[] array) throws IllegalArgumentException{
        this.tab = new Integer[array.length];
        System.arraycopy(array, 0, tab, 0, array.length);
    }

    public void printTab(){
        System.out.print("Values : ");
        for (Integer integer : tab) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public int average() throws IllegalArgumentException {
        int average = 0;

        for (Integer integer : tab) {
            if ((integer < 0) || (integer > 100))
                throw new IllegalArgumentException("Error. A number of the array is not between 0 and 100");
            {
                average += integer;
            }
        }

        average /= tab.length;
        return average;
    }

}

