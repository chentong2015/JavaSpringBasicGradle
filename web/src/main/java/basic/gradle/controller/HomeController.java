package basic.gradle.controller;

import basic.gradle.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final IBaseService baseService;

    // 注入core module模块中的Service, 使用Service提供的服务
    @Autowired
    public HomeController(IBaseService baseService) {
        this.baseService = baseService;
    }

    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("message", baseService.getMessage());
        return "home";
    }
}
