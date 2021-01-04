package FinalQuestions.question17;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class App {
        public static void main(String[] args) {

            BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

            Model model = new Model();
            FinalReview.View view = new View(queue);
            FinalReview.Controller controller = new Controller(queue, model, view);
            controller.mainLoop();
        }
}

