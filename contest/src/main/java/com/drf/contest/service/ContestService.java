package com.drf.contest.service;

import java.util.Date;

import com.drf.contest.domain.Contest;
import com.drf.contest.domain.Track;

public interface ContestService {

	Contest getContest(Track track, Date date);

}
