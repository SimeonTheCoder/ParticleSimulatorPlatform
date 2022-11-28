package com.sepience.particlesimulationplatform.controllers;

import com.sepience.particlesimulationplatform.entities.Simulation;
import com.sepience.particlesimulationplatform.services.interfaces.SimulationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@Component
public class HomePageController {
    private SimulationService service;

    private List<Simulation> sims;

    public HomePageController(SimulationService service) {
        this.service = service;

        sims = new ArrayList<>();
    }

    @GetMapping("/")
    public ModelAndView homePageDisplay(ModelAndView modelAndView){
        modelAndView.setViewName("index.html");

        return modelAndView;
    }

    @GetMapping("/simulations")
    public ModelAndView simulationsPageDisplay(ModelAndView modelAndView){
        modelAndView.setViewName("simulations.html");

        return modelAndView;
    }

    @GetMapping("/simulations_upload")
    public ModelAndView simulationsUploadPageDisplay(ModelAndView modelAndView){
        modelAndView.setViewName("simulations_upload.html");

        return modelAndView;
    }

    @GetMapping("/simulations_library")
    public ModelAndView simulationsLibraryPageDisplay(ModelAndView modelAndView){
        modelAndView.setViewName("simulations_library.html");

        sims = service.getAll();

        modelAndView.addObject("sims", sims);

        return modelAndView;
    }

    @GetMapping("/about")
    public ModelAndView aboutPageDisplay(ModelAndView modelAndView){
        modelAndView.setViewName("about.html");

        return modelAndView;
    }
}
