import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class OnlineExam {
    private static final int EXAM_DURATION_MINUTES = 30;
    private static final Scanner scanner = new Scanner(System.in);
    private static int score = 0;

    public static void main(String[] args) {
        startExamTimer();

        System.out.println("Welcome to the Online Exam!");
        System.out.println("Answer the following questions:");

        askQuestion("What is the capital of France?", "Paris");
        askQuestion("Which programming language is this exam written in?", "Java");

  	displayFinalScore();
    }

    private static void startExamTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            int minutes = EXAM_DURATION_MINUTES;

            public void run() {
                if (minutes > 0) {
                    System.out.println("\nTime remaining: " + minutes + " minute(s)");
                    minutes--;
                } else {
                    System.out.println("\nTime's up! Exam is over.");
                    displayFinalScore();
                    System.exit(0);
                }
            }
        }, 0, 60 * 1000); 
    }

    private static void askQuestion(String question, String correctAnswer) {
        System.out.println("\n" + question);
        String userAnswer = scanner.nextLine().trim();

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
        }
    }

    private static void displayFinalScore() {
        System.out.println("\nExam over. Your final score: " + score);
    }
}