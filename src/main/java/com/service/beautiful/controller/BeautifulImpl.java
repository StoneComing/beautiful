package com.service.beautiful.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-24T08:55:01.716Z")

@RestSchema(schemaId = "beautiful")
@RequestMapping(path = "/beautiful", produces = MediaType.APPLICATION_JSON)
public class BeautifulImpl {

    @Autowired
    private BeautifulDelegate userBeautifulDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userBeautifulDelegate.helloworld(name);
    }

}
