package com.tcs.training.model.reservation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation  {

	private UUID reservationId;

	@Valid
	@NotNull
	private String userId;
	private ReservationStatus reservationStatus;
}
