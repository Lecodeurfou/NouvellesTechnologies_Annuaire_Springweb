package com.projet.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.Languages;
import com.projet.service.ILanguageService;

@Controller
public class LanguageController {

	private ILanguageService languageService;
	
	public ILanguageService getLanguageService() {
		return languageService;
	}
	
@Autowired(required=true)
@Qualifier(value="languageService")
public void setLanguageService(ILanguageService languageService) {
	this.languageService=languageService;
}
@RequestMapping(value="/pageLangues",method=RequestMethod.GET)
public String recupererListeLangue(ModelMap map) {
	List<Languages> listeLangue = languageService.recupererListeLangue();
	map.addAttribute("listLanguage", listeLangue);
	return "pageLangues";
}
}
