package com.drf.contest.service;

import com.drf.contest.domain.Track;

public interface TrackService {
	
	Track findTrack(Long id);

	Track findTrackByCode(String code);

}
