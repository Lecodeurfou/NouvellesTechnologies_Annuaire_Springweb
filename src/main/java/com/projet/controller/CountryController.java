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

import com.projet.model.Country;
import com.projet.service.ICountryService;

@Controller
public class CountryController {
	
    private ICountryService countryService;
	
    public ICountryService getCountryService() {
		return countryService;
	}
    
    @Autowired(required=true)
    @Qualifier(value="countryService")
	public void setCountryService(ICountryService countryService) {
		this.countryService = countryService;
	}

    @RequestMapping(value="/pagePays", method = RequestMethod.GET)
    public String recupererListePays(ModelMap map) {
    	List<Country> listePays = countryService.recupererListePays();
        map.addAttribute("listCountry", listePays);
        return "pagePays";
    }
    
    @RequestMapping(value="/autocomplete/country", method= RequestMethod.POST)
    public void recupererAutoCompleteList(ModelMap map, @RequestParam("term") String searchWorld) {
    	List<Country> listePays = countryService.recupererListePays();
    	List<String> listePaysFiltered = new ArrayList();
    	
    	for(int i=0;i<listePays.size();i++) {
    		if(listePays.get(i).getCodeIso().contains(searchWorld)){
    			listePaysFiltered.add(
					String.valueOf(listePays.get(i).getIdCountry()) 
					+ "-" + listePays.get(i).getCodeIso()
    			);
    		}
    	}
        map.addAttribute("results", listePaysFiltered);
    }
    
    @RequestMapping(value="/autocomplete/countrySingle", method = RequestMethod.POST)
    public void recupererSingle(ModelMap map, @RequestParam("id") String searchId) {
    	List<Country> listePays = countryService.recupererListePays();
    	List<String> country = new ArrayList();
    	
    	for(int i=0;i<listePays.size();i++) {
    		if(String.valueOf(listePays.get(i).getIdCountry()).contentEquals(searchId)){
    			country.add(String.valueOf(listePays.get(i).getIdCountry()));
    			country.add(listePays.get(i).getCodeIso());
    		}
    	}
        map.addAttribute("results", country);    	
    }
 
    
}



