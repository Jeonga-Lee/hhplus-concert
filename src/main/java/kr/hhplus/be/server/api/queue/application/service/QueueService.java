package kr.hhplus.be.server.api.queue.application.service;

import kr.hhplus.be.server.api.queue.application.dto.TokenStatusResult;
import kr.hhplus.be.server.api.queue.domain.repository.QueueRepository;
import org.springframework.stereotype.Service;

@Service
public class QueueService {

	private final QueueRepository queueRepository;

	public QueueService(QueueRepository queueRedisRepository) {
		this.queueRepository = queueRedisRepository;
	}

	public Long addToWaitQueue(long userId) {
		return queueRepository.addToWaitQueue(String.valueOf(userId));
	}

	public TokenStatusResult checkQueueStatus(String userId) {
		return TokenStatusResult.from(queueRepository.checkQueueStatus(userId));
	}

	public void removeFromRunQueue(long userId) {
		queueRepository.removeFromRunQueue(String.valueOf(userId));
	}
}
