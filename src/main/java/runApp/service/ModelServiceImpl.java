package runApp.service;

import runApp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runApp.repository.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public Message display() {

        return modelRepository.display();
    }
}
