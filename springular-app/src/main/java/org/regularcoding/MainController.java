package org.regularcoding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String printStatus(ModelMap model){
        model.addAttribute("message", "App is operational");
        return "status";
    }
    
    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String homee(ModelMap model) {
    	return "home";
    }
}
