package com.codegym.controller;

import com.codegym.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/smartphone")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;
//    @PostMapping
//    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
//        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.CREATED);
//    }
//    @GetMapping
//    public ResponseEntity<Iterable<Smartphone>> allPhones() {
//        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
//    }
    @GetMapping("/list")
    public ModelAndView getAllSmartphonePage() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("smartphones", smartphoneService.findAll());
        return modelAndView;
    }
    //    @GetMapping("/edit")
//    public ModelAndView getEditPage() {
//        ModelAndView modelAndView = new ModelAndView("/phones/edit");
//        modelAndView.addObject("smartphone", smartphoneService.findAll());
//        return modelAndView;
//    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable Long id) {
//        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
//        if (!smartphoneOptional.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        smartphoneService.remove(id);
//        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
//    }
}


