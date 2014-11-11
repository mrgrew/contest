package com.drf.contest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.drf.contest.domain.Track;

interface TrackRepository extends Repository<Track, Long> {

	Track find(Long id);

	Track findByCode(String code);

	Page<Track> findAll(Pageable pageable);

}
