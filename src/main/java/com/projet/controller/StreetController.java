package com.projet.controller;

import java.util.List;
import java.util.ArrayList;

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

import com.projet.model.Street;
import com.projet.service.IStreetService;

@Controller
public class StreetController {

	private IStreetService streetService;
	public IStreetService getStreetService() {
		return streetService;
	}
	
	@Autowired(required=true)
	@Qualifier(value="streetService")
	public void setStreetService(IStreetService streetService) {
		this.streetService = streetService;
	}
	
	@RequestMapping(value="/pageRues", method=RequestMethod.GET)
	public String recupererListeRue(ModelMap map) {
		List<Street>listeRue= streetService.recupererListeRue();
		map.addAttribute("listStreet", listeRue);
		return "pageRues";
	}
	
	@RequestMapping(value="/autocomplete/street", method = RequestMethod.POST)
    public void recupererAutoCompleteList(ModelMap map, @RequestParam("term") String searchWorld) {
    	List<Street> listeRue = streetService.recupererListeRue();
    	List<String> listeRueFiltered = new ArrayList();
    	
    	for(int i=0;i<listeRue.size();i++) {
    		if(listeRue.get(i).getIdStreetNameLabel().contains(searchWorld)){
    			listeRueFiltered.add(
					String.valueOf(listeRue.get(i).getIdStreetName()) 
					+ "-" + listeRue.get(i).getIdStreetNameLabel()
    			);
    		}
    	}
        map.addAttribute("results", listeRueFiltered);
    }
    
    @RequestMapping(value="/autocomplete/rueSingle", method = RequestMethod.POST)
    public void recupererSingle(ModelMap map, @RequestParam("id") String searchId) {
    	List<Street> Street = streetService.recupererListeRue();
    	List<String> street = new ArrayList();
    	
    	for(int i=0;i<Street.size();i++) {
    		if(String.valueOf(Street.get(i).getIdStreetName()).contentEquals(searchId)){
    			street.add(String.valueOf(Street.get(i).getIdStreetName()));
    			street.add(Street.get(i).getIdStreetNameLabel());
    		}
    	}
        map.addAttribute("results", street);    	
    }
}
