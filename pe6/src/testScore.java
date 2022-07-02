public class testScore {

    private double[] score = new double[3];

    public testScore(double grade1, double grade2, double grade3){
        this.score[0] = grade1;
        this.score[1] = grade2;
        this.score[2] = grade3;
    }

    public testScore(){
        this.score[0] = 0.0;
        this.score[1] = 0.0;
        this.score[2] = 0.0;
    }

    public double average(){
        return ( (this.score[0] + this.score[1] + this.score[2]) / 3.0 );
    }
}
