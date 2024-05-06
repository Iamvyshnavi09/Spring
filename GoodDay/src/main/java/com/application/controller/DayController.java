package com.application.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.modal.Cookies;

@RestController
@RequestMapping("/cookies")
public class DayController {

	Map<String, Cookies> allCookies = new HashMap<>();

	@GetMapping
	public Collection<Cookies> getMethodCall() {
		return allCookies.values();

	}

	@PostMapping
	public String postMethodCall(@RequestBody Cookies allcookies) {
		Cookies addvalue = new Cookies();
		addvalue.setCookieid(allcookies.getCookieid());
		addvalue.setCookiename(allcookies.getCookiename());
		addvalue.setCookieimport(allcookies.getCookieimport());
		addvalue.setCookiecost(allcookies.getCookiecost());
		allCookies.put(allcookies.getCookieid(), addvalue);
		return "added cookies";

	}

	@PutMapping(path = "/{cookieid}")
	public String putMethodCall(@PathVariable String cookieId, @RequestBody Cookies allcookies) {
		if (allCookies.containsKey(cookieId)) {
			Cookies addvalue = new Cookies();
			addvalue.setCookieid(allcookies.getCookieid());
			addvalue.setCookiename(allcookies.getCookiename());
			addvalue.setCookieimport(allcookies.getCookieimport());
			addvalue.setCookiecost(allcookies.getCookiecost());
			allCookies.put(cookieId, addvalue);
			return "Updated successfully";

		} else {
			return "Cookie id is not found";
		}
	}

	@DeleteMapping(path = "/{cookieid}")
	public String deleteMethodCall(@PathVariable String cookieId) {
		if (allCookies.containsKey(cookieId)) {
			allCookies.remove(cookieId);
			return "Cookies is deleted successfully";
		} else {
			return "Cookeid is not found";
		}
	}
}
