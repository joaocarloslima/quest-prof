package br.com.fiap.frontendservice.player;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlayerController {

    @GetMapping("/")
    public String createQuest(Model model) {
        model.addAttribute("user", "joao@fiep.com");
        return "index";
    }

    @PostMapping("/player")
    public String create(PlayerForm playerForm) {
        System.out.println(playerForm);
        return "index";
    }
}
