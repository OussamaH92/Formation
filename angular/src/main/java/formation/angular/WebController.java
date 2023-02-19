package formation.angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {


    @GetMapping("/")
    public ModelAndView entry(){

        return new ModelAndView("index");

    }
}
