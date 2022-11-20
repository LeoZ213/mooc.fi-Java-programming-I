/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
import java.util.ArrayList;

public class MessagingService {

    private final ArrayList<Message> text;

    public MessagingService() {
        this.text = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() > 280) {

        } else {
            this.text.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return text;
    }
}
