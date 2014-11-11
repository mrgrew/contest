
package com.drf.contest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.drf.contest.Application;

/**
 * Integration tests for {@link ContestRepository}.
 *
 * @author Greg Wiley
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ActiveProfiles("test")
public class ContestRepositoryIntegrationTests {

	@Autowired
	private ContestRepository contestRepository;

	@Test
	public void executesQueryMethodsCorrectly() {
//		City city = this.cityRepository
//				.findAll(new PageRequest(0, 1, Direction.ASC, "name")).getContent()
//				.get(0);
//		assertThat(city.getName(), is("Atlanta"));
//
//		Page<HotelSummary> hotels = this.repository.findByCity(city, new PageRequest(0,
//				10, Direction.ASC, "name"));
//		Hotel hotel = this.repository.findByCityAndName(city, hotels.getContent().get(0)
//				.getName());
//		assertThat(hotel.getName(), is("Doubletree"));
//
//		List<RatingCount> counts = this.repository.findRatingCounts(hotel);
//		assertThat(counts, hasSize(1));
//		assertThat(counts.get(0).getRating(), is(Rating.AVERAGE));
//		assertThat(counts.get(0).getCount(), is(greaterThan(1L)));
	}
}
