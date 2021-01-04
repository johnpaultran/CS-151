package FinalQuestions.question17;

import java.util.concurrent.BlockingQueue;

public class Controller {
    BlockingQueue<FinalReview.Message> queue;
    Model Model;
    View view;

    public Controller(BlockingQueue<Message> queue, Model Model, View view) {
        this.queue = queue;
        this.Model = Model;
        this.view = view;
    }

    public void mainLoop() {
        while (view.isDisplayable()) {
            Message message = null;
            try {
                message = queue.take();
            } catch (InterruptedException exception) {
                // do nothing
            }

            if(message.getClass() == SwitchMessage.class) {
                // button updateStudentName was clicked
                SwitchMessage switchMessage = (SwitchMessage) message;
                Model.switchLanguages(SwitchMessage.getLanguage(), SwitchMessage.getLanguage()); // update model
                view.updateLanguagesInView(Model.language); // update view
            }
        }
    }
}

