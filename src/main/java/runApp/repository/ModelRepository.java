package runApp.repository;

import runApp.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository {

    Message display();
}
