package com.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.Entites.Person;
import com.Services.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService service;
	
	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("PersonList",service.getAll());
		System.out.println("Spring MVC");
		return "index";
	}
	
	@RequestMapping(value="/save")
	public String save() {
		return "save";
	}
	
	@RequestMapping(value="/update")
	public String update(Model model,@RequestParam(value="id")int id) {
		Person person = service.getById(id);
		model.addAttribute("firstname", person.getFirstName());
		model.addAttribute("lastname", person.getLastName());
		model.addAttribute("age", person.getAge());
		model.addAttribute("city", person.getCity());
		model.addAttribute("id", person.getId());
		System.out.println(id);
	    return "update";
	}
	
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam(value="id")int id) {
		service.deleteById(id);
		System.out.println(id);
		System.out.println("Spring MVC - Delete");
	    return "redirect:index.htm";
    }
	
	@RequestMapping(value="/insert")
	public String insert(Model model,
			@RequestParam(value="firstName")String firstName,
			@RequestParam(value="lastName")String lastName,
			@RequestParam(value="age")int age,
			@RequestParam(value="city")String city) {
		Person p = new Person();
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		p.setCity(city);
		service.insert(p);
		System.out.println("Spring MVC - Inserted");
		return "redirect:index.htm";
	}
	
	@RequestMapping(value="/updateP")
	public String updateP(Model model,
			@RequestParam(value="id")int id,
			@RequestParam(value="firstName")String firstName,
			@RequestParam(value="lastName")String lastName,
			@RequestParam(value="age")int age,
			@RequestParam(value="city")String city) {
		Person p = service.getById(id);
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		p.setCity(city);
		service.update(p);
		System.out.println("Spring MVC - Updated");
		return "redirect:index.htm";
	}
	
}
