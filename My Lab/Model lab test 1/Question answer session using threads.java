package com.mycompany.lab;

public class SimpleQASession {

    // Array of questions and answers
    private static final String[][] QA_ARRAY = {
        {"What is the capital of France?", "Paris"},
        {"What is 2 + 2?", "4"},
        {"What is the color of the sky?", "Blue"},
        {"Who wrote 'To Kill a Mockingbird'?", "Harper Lee"}
    };

    public static void main(String[] args) {
        // Create threads
        Thread questionThread = new Thread(new QuestionAsker());
        Thread answerThread = new Thread(new AnswerSearcher());

        // Start threads
        questionThread.start();
        answerThread.start();
    }

    // Thread to ask questions
    static class QuestionAsker implements Runnable {
        private int index = 0;

        @Override
        public void run() {
            while (index < QA_ARRAY.length) {
                // Print the question
                System.out.println("Question: " + QA_ARRAY[index][0]);
                
                // Simulate delay in asking questions
                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                index++;
            }
        }
    }

    // Thread to search for answers
    static class AnswerSearcher implements Runnable {
        private int index = 0;

        @Override
        public void run() {
            while (index < QA_ARRAY.length) {
                // Simulate delay in finding answers
                try {
                    Thread.sleep(1000); // 1 second delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Print the answer
                System.out.println("Answer: " + QA_ARRAY[index][1]);

                index++;
            }
        }
    }
}
