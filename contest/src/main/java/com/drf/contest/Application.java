package com.drf.contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import com.drf.contest.domain.Track;
import com.drf.contest.service.TrackService;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	@Autowired
	private TrackService trackService;

	@Bean
	public Converter<String, Track> trackConverter() {
		return new Converter<String, Track>() {
			@Override
			public Track convert(String id) {
				return trackService.findTrackById(Long.valueOf(id));
			}
		};
	}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
