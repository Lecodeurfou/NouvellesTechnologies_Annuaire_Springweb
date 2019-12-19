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

import com.projet.model.Area;
import com.projet.model.City;
import com.projet.service.ICityService;

@Controller
public class CityController {
	
    private ICityService cityService;
	
    public ICityService getCityService() {
		return cityService;
	}
    
    @Autowired(required=true)
    @Qualifier(value="cityService")
	public void setCityService(ICityService cityService) {
		this.cityService = cityService;
	}

    @RequestMapping(value="/pageVilles", method = RequestMethod.GET)
    public String recupererListeVilles(ModelMap map) {
    	List<City> listeVilles = cityService.recupererListeVilles();
        map.addAttribute("listCity", listeVilles);
        return "pageVilles";
    }
    
    @RequestMapping(value="/autocomplete/city", method = RequestMethod.POST)
    public void recupererAutoCompleteList(ModelMap map, @RequestParam("term") String searchWorld) {
    	List<City> listeVilles = cityService.recupererListeVilles();
    	List<String> listeVillesFiltered = new ArrayList();
    	
    	for(int i=0;i<listeVilles.size();i++) {
    		if(listeVilles.get(i).getIdCityName().contains(searchWorld)){
    			listeVillesFiltered.add(
   					String.valueOf(listeVilles.get(i).getIdCity()) 
   					+ "-" + listeVilles.get(i).getIdCityName()
    			);
    		}
    	}
        map.addAttribute("results", listeVillesFiltered);
    }
    
    @RequestMapping(value="/autocomplete/citySingle", method = RequestMethod.POST)
    public void recupererSingle(ModelMap map, @RequestParam("id") String searchId) {
    	List<City> listeVilles = cityService.recupererListeVilles();
    	List<String> ville = new ArrayList();
    	
    	for(int i=0;i<listeVilles.size();i++) {
    		if(String.valueOf(listeVilles.get(i).getIdCity()).contentEquals(searchId)){
    			ville.add(String.valueOf(listeVilles.get(i).getIdCity()));
    			ville.add(listeVilles.get(i).getIdCityName());
    		}
    	}
        map.addAttribute("results", ville);    	
    }
}



