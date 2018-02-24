package runApp.repository;

import org.springframework.stereotype.Repository;
import runApp.model.Message;

@Repository
public class ModelRepositoryImpl implements ModelRepository {

    @Override
    public Message display() {
        return new Message("model1", "body1");
    }

}
