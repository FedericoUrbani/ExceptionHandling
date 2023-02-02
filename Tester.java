public class Tester {

    public String checkScore (double score){
        String output="";
            if (0 < score && score <= 50.00) {
                output=score+" is an Average score";
            }
            else if (50.00<score && score <=100) {
                output=(score+" is an Very good score");
            }
            else {
                System.out.println("ERROR: "+score+" is out of scale.");
                throw new ArithmeticException();
            }
        return output;
    }
    public static void main(String[] args) {

        Tester tester= new Tester();
        double n1=2.15;
        double n2=50;
        double n3=95.02;
        double n4=100.01;
        System.out.println(tester.checkScore(n1));
        System.out.println(tester.checkScore(n2));
        System.out.println(tester.checkScore(n3));
        System.out.println(tester.checkScore(n4));

    }

}
