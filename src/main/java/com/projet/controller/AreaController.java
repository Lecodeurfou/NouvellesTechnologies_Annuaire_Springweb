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
}
