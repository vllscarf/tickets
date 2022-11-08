package com.vlscarf.tickets.controllers;

import com.vlscarf.tickets.models.Cities;
import com.vlscarf.tickets.models.Event;
import com.vlscarf.tickets.repo.CityRepository;
import com.vlscarf.tickets.repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventsController {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private CityRepository cityRepository;
    @GetMapping("/")
    public String eventsList(Model model){
        Iterable<Event> events = eventRepository.findAll();
        Iterable<Cities> cities = cityRepository.findAll();
        model.addAttribute("events", events);
        model.addAttribute("cities", cities);
        return "/concerts/events";
    }

}
