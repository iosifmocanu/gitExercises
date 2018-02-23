package presentation;


import model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ModelService;

@RestController
public class ModelDisplay {

    @Autowired
    private ModelService modelService;

    @RequestMapping(value = {"/message"},
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message display() {

        return modelService.display();
    }

}
