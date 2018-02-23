package service;

import model.Message;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService{

    @Override
    public Message display() {
        Message message = new Message();
        message.setName("model1");
        message.setBody("body1");
        return message;
    }
}
