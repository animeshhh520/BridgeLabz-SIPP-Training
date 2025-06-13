public class q7 {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int totalSubjects = 3;
        int maxMarksPerSubject = 100;

        double averagePercentage = ((maths + physics + chemistry) / (double)(totalSubjects * maxMarksPerSubject)) * 100;

        System.out.println("Sam’s average mark in PCM is " + averagePercentage + "%");
    }
}
