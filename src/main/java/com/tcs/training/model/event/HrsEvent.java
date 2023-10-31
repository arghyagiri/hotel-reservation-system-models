package com.tcs.training.model.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HrsEvent {

    private UUID eventId;

    private Object context;

    private HrsEventStatus status;

}
