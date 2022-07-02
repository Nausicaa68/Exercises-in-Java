public class Main {
    public static void main(String[] args) {

        Integer[] anArray = {1, 2, 3, 4, 5, 6, 78, 9, 10};
        TestScores testScores = new TestScores(anArray);
        testScores.printTab();
        System.out.println("Average is : " + testScores.average());

        Integer[] anArray2 = {1, 2, 3, 150};
        TestScores testScores2 = new TestScores(anArray2);
        testScores2.printTab();
        System.out.println("Average is : " + testScores2.average());
    }
}
