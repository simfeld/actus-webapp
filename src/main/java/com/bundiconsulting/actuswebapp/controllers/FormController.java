package com.bundiconsulting.actuswebapp.controllers;

import com.bundiconsulting.actuswebapp.models.Form;
import com.bundiconsulting.actuswebapp.models.Contract;
import com.bundiconsulting.actuswebapp.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.*;
import java.util.Optional;

@RestController
public class FormController {

    @Autowired
    FormRepository formRepository;

    @RequestMapping(method=RequestMethod.GET, value="/forms")
    @CrossOrigin(origins = "*")
    public Iterable<Form> forms() {
        return formRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.GET, value="/forms/{contractType}")
    @CrossOrigin(origins = "*")
    public List<Form> form(@PathVariable String contractType) {
   
        List<Form> meta = formRepository.findByContractType(contractType);

        return meta;
    }

}
