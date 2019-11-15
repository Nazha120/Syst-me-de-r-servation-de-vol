package org.sid.vol.controllers;

import java.util.ArrayList;
import java.util.List;
import org.sid.vol.entities.Client;
import org.sid.vol.entities.Reservation;
import org.sid.vol.entities.Vol;
import org.sid.vol.metier.IClientMetier;
import org.sid.vol.metier.IReservationMetier;
import org.sid.vol.metier.IVolMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReservationController {
	
	@Autowired
	private IReservationMetier reservationMetier;
	
	@Autowired
	private IClientMetier clientMetier;
	
	@Autowired
	private IVolMetier volMetier;

	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public String reservations(Model model) {
		List<Reservation> reservations = reservationMetier.selectAll();
		if(reservations == null) {
			reservations = new ArrayList<Reservation>();
		}
		model.addAttribute("reservations",reservations);
		return "reservations";
		
	}
	
	@RequestMapping(value = "/ajouterReservation", method = RequestMethod.GET)
	public String ajouterReservation(Model model) {
		List<Client> clients = clientMetier.selectAll();
		List<Vol> vols = volMetier.selectAll();
		model.addAttribute("reservation", new Reservation());		
		model.addAttribute("clients",clients);
		model.addAttribute("vols",vols);
		return "ajouterReservation";	
	}
	
	@RequestMapping(value = "/saveReservation", method = RequestMethod.POST)
	public String saveReservation(Model model, Reservation reservation) {
		reservationMetier.save(reservation);
			return "redirect:/reservations";
	}	
	
	@RequestMapping(value="/deleteReservation/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable Long id){    
		reservationMetier.remove(id);
		return "redirect:/reservations";
    }   
	
	@RequestMapping(value="/editReservation/{id}",method = RequestMethod.GET)    
    public String editReservation(Model model, @PathVariable Long id){   
		Reservation r = reservationMetier.getById(id);
		List<Client> clients = clientMetier.selectAll();
		List<Vol> vols = volMetier.selectAll();
		model.addAttribute("clients",clients);
		model.addAttribute("vols",vols);
		model.addAttribute("reservation", r);  
		return "modifierReservation";
    }  
	
	@RequestMapping(value = "/updateReservation", method = RequestMethod.POST)
	public String updateReservation(Model model, Reservation reservation) {
		reservationMetier.update(reservation);
			return "redirect:/reservations";
	}	
}
