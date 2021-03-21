package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.Offer;
import main.model.OfferDTO;
import main.service.OfferService;

@Controller
public class MainController {

	@Autowired
	private OfferService offerService;
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		List<OfferDTO> offersDTO = offerService.getAllDTO();
		offersDTO.addAll(offerService.getAllFromExternalApplication());
		model.addAttribute("offersDTO", offersDTO);
		return "index";
	}

	@GetMapping("/addOffer")
	public String showForm(Model model) {
		Offer offer = new Offer();
		model.addAttribute("offer",  offer);
		return "offer-form";
	}
	
	@PostMapping("/processForm")
	public String processOffer(@ModelAttribute Offer offer) {
		offerService.saveOrUpdate(offer);
		return "redirect:/";
	}
	
	@GetMapping("/deleteOffer/{id}")
	public String deleteOffer(@PathVariable int id) {
		if (id > 0) {
			Offer offer = offerService.getById(id);
			if(offer != null) {
				offerService.delete(id);
			}
		}
		return "redirect:/";
	}
	
	@GetMapping("/editOffer/{id}")
	public String editOfferString(@PathVariable int id, Model model) {
		if(id > 0) {
			Offer offer = offerService.getById(id);
			if(offer != null) {
				model.addAttribute("offer", offer);
				return "offer-form";
			}
		}
		return "redirect:/";
	}
	
}
