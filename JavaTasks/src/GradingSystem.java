import java.util.Scanner;

public class GradingSystem {

    static double getExamScore() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your exam score: ");
            double examScore = scanner.nextInt();

            if (examScore >= 0 && examScore <= 70) {
                return examScore;
            } else {
                System.out.println("Invalid number! The exam score has to be between 0 and 70.");
            }
        }
    }

    static double getTestScore() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your test score: ");
            double testScore = scanner.nextInt();

            if (testScore >= 0 && testScore <= 30) {
                return testScore;
            } else {
                System.out.println("Invalid number! The exam score has to be between 0 and 70.");
            }
        }
    }

    static void evaluateResults(double examScore, double testScore, boolean hasPaid, boolean isEligible) {
        System.out.println("\n===== Results =====");
        double totalScore = examScore + testScore;

        if ( (examScore >= 25 || testScore >= 15) && totalScore >= 40) {
            System.out.println("Great work!");
            if (hasPaid) {
                isEligible = true;
            } else {
                isEligible = false;
                System.out.println("Sorry, your results make you eligible for your certificate but you have not yet paid yor fees.");
            }

        } else if (examScore + testScore == 39) {
            if ( (examScore == 24 && testScore == 15) || (examScore == 25 && testScore == 14) ) {
                isEligible = true;
                System.out.println("Your results is condoned.");
            } else {
                isEligible = false;
                System.out.println("Sorry, your result is not condoned.");
            }

        } else if (examScore + testScore < 39) {
            isEligible = false;
            System.out.println("Your result is not condoned");
        }

        if (isEligible) {
            System.out.println("Congratulations! You are eligible for your certificate.");
            issueCertificate(totalScore);
        } else {
            System.out.println("Sorry! Unfortunately, you are not eligible for certification.");
        }
    }

    static Object getClass(double score) {
        double gpa;
        char grade;
        String Class;

        if (score >= 70) {
            gpa = 4.0; grade = 'A';
            Class = "First Class";
        } else if (score >= 60) {
            gpa = 3.5; grade = 'B';
            Class = "Second Class Upper";
        } else if (score >= 50) {
            gpa = 2.5; grade = 'C';
            Class = "Second Class Lower";
        } else if (score >= 40) {
            gpa = 2.0; Class = "Third Class / Pass";
        } else {
            Class = "Fail";
        }

        return Class;
    }

    static void issueCertificate(double score) {
        System.out.println("\nEnter the name that should appear on your certificate: ");
        String course = "Computer Science";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Your certificate is ready!");
        System.out.println("\n|==== CERTIFICATE OF GRADUATION ====|");
        System.out.println("This certificate is offered to:");
        System.out.println("|--------- "+ name +" ------------|");
        System.out.println("This is to certify that this professional has satisfied all the requirement and successfully completed \nhis/her bachelors degree in "+ course +" with a CWA of "+ score);
    }

    public static <object> void main(String[] args) {
        double examScore = getExamScore();
        double testScore = getTestScore();
        double totalScore = examScore + testScore;
        boolean hasPaid = true;
        boolean isEligible = false;
        Object Class = getClass(totalScore);

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Exam score:  "+ examScore);
        System.out.println("Test score:  "+ testScore);
        System.out.println("Total Score: "+ totalScore);
        System.out.println("Class: "+ Class);
        evaluateResults(examScore, testScore, hasPaid, isEligible);
    }
}
