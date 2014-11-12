package com.drf.contest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.drf.contest.domain.Track;

public interface TrackService {
	
	Track findTrackById(Long id);

	Track findTrackByCode(String code);

	Page<Track> findAll(Pageable pageable);

	TrackRepository getRepository();
}
