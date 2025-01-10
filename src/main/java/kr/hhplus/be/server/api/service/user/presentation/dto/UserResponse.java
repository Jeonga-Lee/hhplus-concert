package kr.hhplus.be.server.api.service.user.presentation.dto;

import java.math.BigDecimal;
import kr.hhplus.be.server.api.service.user.application.dto.UserResult;

public record UserResponse(
	long id,
	BigDecimal balance
) {

	public static UserResponse from(UserResult result) {
		return new UserResponse(
			result.id(),
			result.balance()
		);
	}
}
