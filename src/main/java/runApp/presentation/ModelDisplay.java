package runApp.presentation;


import runApp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import runApp.service.ModelService;

@RestController
public class ModelDisplay {

    @Autowired
    private ModelService modelService;

    @RequestMapping(value = {"/message/find"},
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Message display() {

        return modelService.display();
    }

}
