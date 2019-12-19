package com.projet.controller;

import java.util.List;
import javax.validation.Valid;
import java.util.ArrayList;

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
import com.projet.service.IAreaService;

@Controller
public class AreaController {

 private IAreaService areaService;
 
 public IAreaService getAreaService() {
	 return areaService;
 }
	
 @Autowired(required=true)
 @Qualifier(value="areaService")
 public void setAreaService(IAreaService areaService) {
	 this.areaService=areaService;
 }
 
 @RequestMapping(value="/pageRegion", method = RequestMethod.GET)
 public String recupererListeRegion(ModelMap map) {
	 List<Area> listeRegion = areaService.recupererListeRegion();
	 map.addAttribute("listArea",listeRegion);
	 return "pageRegions";
 }
 @RequestMapping(value="/autocomplete/regions", method = RequestMethod.POST)
 public void recupererAutoCompleteList(ModelMap map, @RequestParam("term") String searchWorld) {
 	List<Area> listeRegions = areaService.recupererListeRegion();
 	List<String> listeRegionsFiltered = new ArrayList();
 	
 	for(int i=0;i<listeRegions.size();i++) {
 		if(listeRegions.get(i).getIdLabel().contains(searchWorld)){
 			listeRegionsFiltered.add(
					String.valueOf(listeRegions.get(i).getIdArea()) 
					+ "-" + listeRegions.get(i).getIdLabel()
 			);
 		}
 	}
     map.addAttribute("results", listeRegionsFiltered);
 }
 
 @RequestMapping(value="/autocomplete/regionsSingle", method = RequestMethod.POST)
 public void recupererSingle(ModelMap map, @RequestParam("id") String searchId) {
 	List<Area> listeRegions = areaService.recupererListeRegion();
 	List<String> region = new ArrayList();
 	
 	for(int i=0;i<listeRegions.size();i++) {
 		if(String.valueOf(listeRegions.get(i).getIdArea()).contentEquals(searchId)){
 			region.add(String.valueOf(listeRegions.get(i).getIdArea()));
 			region.add(listeRegions.get(i).getIdLabel());
 		}
 	}
     map.addAttribute("results", region);    	
 }
}
