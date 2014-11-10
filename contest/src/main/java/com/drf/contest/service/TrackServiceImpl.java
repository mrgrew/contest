package com.drf.contest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.drf.contest.domain.Track;

@Component("trackService")
@Transactional
class TrackServiceImpl implements TrackService {

	private final TrackRepository trackRepository;

	@Autowired
	public TrackServiceImpl(TrackRepository trackRepository) {
		this.trackRepository = trackRepository;
	}
	
	@Override
	public Track getTrack(String code) {
		Assert.notNull(code, "Code must not be null");
		return this.trackRepository.findByCode(code);
	}

}
