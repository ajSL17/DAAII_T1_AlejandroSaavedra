package pe.edu.cibertec.DAAII_T1_AlejandroSaavedra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "auth/frmlogin";
    }
    @GetMapping("/login-success")
    public String loginSuccess(){
        return "redirect:/auth/dashboard";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "auth/home";
    }

}
