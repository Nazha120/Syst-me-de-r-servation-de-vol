package org.sid.vol.controllers;

import java.util.List;
import org.sid.vol.entities.Reservation;
import org.sid.vol.metier.IReservationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired
	private IReservationMetier reservationMetier;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String reservations(Model model) {
		List<Reservation> reservations = reservationMetier.selectAll();
		model.addAttribute("reservations",reservations);
		return "reservations";
		
	}
}
