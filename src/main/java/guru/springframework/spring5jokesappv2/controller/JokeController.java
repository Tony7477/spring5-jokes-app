package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.services.JokeService;
import guru.springframework.spring5jokesappv2.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeServiceImpl jokeServiceimpl;

    public JokeController(JokeServiceImpl jokeServiceimpl) {
        this.jokeServiceimpl = jokeServiceimpl;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeServiceimpl.getJoke());
      return "index";
    }
}
