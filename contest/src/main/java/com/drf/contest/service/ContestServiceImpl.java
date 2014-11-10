package com.drf.contest.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.drf.contest.domain.Contest;
import com.drf.contest.domain.Track;

@Component("contestService")
@Transactional
class ContestServiceImpl implements ContestService {

	private final ContestRepository contestRepository;

	@Autowired
	public ContestServiceImpl(ContestRepository contestRepository) {
		this.contestRepository = contestRepository;
	}

	
	@Override
	public Contest getContest(Track track, Date date) {
		Assert.notNull(track, "Track must not be null");
		Assert.notNull(date, "Date must not be null");
		return this.contestRepository.findByTrackAndDate(track, date);
	}

}
