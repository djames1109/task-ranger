package org.castle.djames.taskranger.core.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetail {

    private String code;
    private String message;
    private String detail;

    public ErrorDetail(String code, String message) {
        this(code, message, null);
    }

}
