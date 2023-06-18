package org.castle.djames.taskranger.core.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ResponseStatus {
    SUCCESS("success"),
    ERROR("error"),
    RETRY("retry");

    @Getter
    private final String value;

}
