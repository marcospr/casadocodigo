package br.com.casadocodigo.loja.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na home da CDC");
		return "home";
	}
	
//	@RequestMapping("/")
//    public void index(){
//        System.out.println("Entrando na home da CDC");
//    }

}
