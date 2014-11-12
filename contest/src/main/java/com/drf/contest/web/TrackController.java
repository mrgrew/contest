/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drf.contest.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.drf.contest.domain.Track;
import com.drf.contest.service.TrackRepository;

@Controller
@RequestMapping("/track")
public class TrackController {

	@Autowired
	private TrackRepository trackRepository;

	@RequestMapping
	public ModelAndView list() {
		Iterable<Track> tracks = trackRepository.findAll();
		return new ModelAndView("track/list", "tracks", tracks);
	}

	@RequestMapping("{id}")
	public ModelAndView view(@PathVariable("id") Track track) {
		return new ModelAndView("track/view", "track", track);
	}

	@RequestMapping(params = "form", method = RequestMethod.GET)
	public String createForm(@ModelAttribute Track track) {
		return "track/form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView create(@Valid Track track, BindingResult result,
			RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return new ModelAndView("track/form", "formErrors", result.getAllErrors());
		}
		track = trackRepository.save(track);
		redirect.addFlashAttribute("globalTrack", "Successfully created a new track");
		return new ModelAndView("redirect:/{track.id}", "track.id", track.getId());
	}

	@RequestMapping("foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}
	
}
