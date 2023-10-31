package com.tcs.training.model.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationContext {
    private String	body;
    private Map<String, String> context;
    private Date createdAt;
    private String	severity;
    private String	type;
    private String	user;
    private Boolean	read;
}
