interface Exam {
    void startExam();
    void submitAnswer(String answer);
    int getScore();
}

class MathExam implements Exam {
    private int score = 0;

    @Override
    public void startExam() {
        System.out.println("Math exam started.");
    }

    @Override
    public void submitAnswer(String answer) {
        if (answer.equals("correct")) {
            score++;
        }
    }

    @Override
    public int getScore() {
        return score;
    }
}

class ScienceExam implements Exam {
    private int score = 0;

    @Override
    public void startExam() {
        System.out.println("Science exam started.");
    }

    @Override
    public void submitAnswer(String answer) {
        if (answer.equals("correct")) {
            score++;
        }
    }

    @Override
    public int getScore() {
        return score;
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Exam mathExam = new MathExam();
        mathExam.startExam();
        mathExam.submitAnswer("correct");
        System.out.println("Math exam score: " + mathExam.getScore());

        Exam scienceExam = new ScienceExam();
        scienceExam.startExam();
        scienceExam.submitAnswer("incorrect");
        System.out.println("Science exam score: " + scienceExam.getScore());
    }
}
