package com.example.form;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//@RequestMapping(value= "/form",method = RequestMethod.GET)//
//@RestController
@RequestMapping("/")
public class form {
	
  //@GetMapping(value="/")

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Model modelo) {

	  modelo.addAttribute("persona", new Persona());
	  System.out.print("Aqui va bien");
	  return "index";
  }
 
  @RequestMapping(value = "/recibe", method = RequestMethod.POST)
  public String Recibe(@Validated @ModelAttribute("persona") Persona persona,BindingResult result, ModelMap model) {
	  Dao dao = new Dao();
	  dao.Guardar(persona);
	  return "recibe";
  }
}
