package runApp.service;

import runApp.model.Message;
import org.springframework.stereotype.Service;

@Service
public interface ModelService {

    Message display();
}
