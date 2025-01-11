package kr.hhplus.be.server.api.service.concert.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConcertScheduleRepository extends JpaRepository<ConcertSchedule, Long> {

	List<ConcertSchedule> findAvailableSchedulesByConcertIdAndIsOpenTrue(Long concertId);
}
