package me.falarmit.testpackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller")
public class Test {

    @RequestMapping(value="/{text}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String text, ModelMap model) {

        model.addAttribute("text", text);
        return "test";

    }
}