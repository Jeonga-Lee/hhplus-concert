package kr.hhplus.be.server.api.service.user.presentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import kr.hhplus.be.server.api.service.user.application.dto.BalanceHistoryDto;

public record BalanceHistoryRequest(
	@Schema(description = "사용자의 고유 ID", example = "1")
	@NotNull
	long userId,

	@Schema(description = "타입", example = "charge")
	String type,

	@Schema(description = "금액", example = "50000")
	@NotNull
	BigDecimal amount
) {

	public BalanceHistoryDto toDto() {
		return new BalanceHistoryDto(
			userId,
			type,
			amount
		);
	}
}