package pl.mattwr89.springbootmap.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mattwr89.springbootmap.model.Poit;


@Controller
public class MapController {

    @GetMapping
    public String getMap(Model model){
       model.addAttribute("mark", new Poit(51.65, 17.80,"Witaj w Ostrowie Wlkp."));
        return "map";
    }
}
