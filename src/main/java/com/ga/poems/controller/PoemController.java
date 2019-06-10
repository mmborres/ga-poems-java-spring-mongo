package com.ga.poems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ga.poems.domain.Poems;
import com.ga.poems.repository.PoemRepository;

@Controller
public class PoemController {
	
    @Autowired
    PoemRepository poemrepository;

    @GetMapping("/poem/random")
    @ResponseBody
    public Poems random() {
    	List<Poems> p = poemrepository.findAll();
    	int index = (int)( Math.random() * p.size() );
    	return p.get( index );
    }
}
