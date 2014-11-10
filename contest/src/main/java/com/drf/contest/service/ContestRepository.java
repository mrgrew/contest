package com.drf.contest.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.drf.contest.domain.Contest;
import com.drf.contest.domain.Track;

interface ContestRepository extends Repository<Contest, Long> {

	Contest findByTrackAndDate(Track track, Date date);

	Page<Contest> findByTrack(Track track, Pageable pageable);

}
