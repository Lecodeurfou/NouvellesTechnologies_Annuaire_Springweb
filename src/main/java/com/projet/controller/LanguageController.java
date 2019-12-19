package com.projet.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.model.Languages;
import com.projet.service.ILanguageService;
import java.util.ArrayList;
import java.util.StringTokenizer;

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

@RequestMapping(value="/autocomplete/language", method = RequestMethod.POST)
public void recupererAutoCompleteList(ModelMap map, @RequestParam("term") String searchWorld) {
	List<Languages> listeLangages = languageService.recupererListeLangue();
	List<String> listeLangageFiltered = new ArrayList();
	
	for(int i=0;i<listeLangages.size();i++) {
		if(listeLangages.get(i).getIdName().contains(searchWorld)){
			listeLangageFiltered.add(
				String.valueOf(listeLangages.get(i).getIdLanguage()) 
				+ "-" + listeLangages.get(i).getIdName()
			);
		}
	}
    map.addAttribute("results", listeLangageFiltered);
}

@RequestMapping(value="/autocomplete/languageSingle", method = RequestMethod.POST)
public void recupererSingle(ModelMap map, @RequestParam("id") String searchId) {
	List<Languages> listeLangage = languageService.recupererListeLangue();
	List<String> language = new ArrayList();
	
	for(int i=0;i<listeLangage.size();i++) {
		if(String.valueOf(listeLangage.get(i).getIdLanguage()).contentEquals(searchId)){
			language.add(String.valueOf(listeLangage.get(i).getIdLanguage()));
			language.add(listeLangage.get(i).getIdName());
		}
	}
    map.addAttribute("results", language);    	
}
}
