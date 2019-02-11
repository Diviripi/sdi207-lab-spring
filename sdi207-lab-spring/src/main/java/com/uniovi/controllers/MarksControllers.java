package com.uniovi.controllers;

import org.springframework.web.bind.annotation.*;

import com.uniovi.entities.Mark;

@RestController
public class MarksControllers {
	@RequestMapping("/mark/list")
	public String getList() {
		return "Getting List";
	}

	@RequestMapping(value = "/mark/add", method = RequestMethod.POST)
	public String setMark(@ModelAttribute Mark mark) {
		return "added: " + mark.getDescription() + " with score : "
	+ mark.getScore() + " id: " + mark.getId();
	}

	@RequestMapping(value = "/mark/details/{id}", method = RequestMethod.POST)
	public String getDetail(@PathVariable Long id) {
		return "Getting Details: " + id;
	}

}
