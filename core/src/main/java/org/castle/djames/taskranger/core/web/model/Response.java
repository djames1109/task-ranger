package org.castle.djames.taskranger.core.web.model;

import lombok.Data;

import java.util.List;

@Data
public class Response<T> {

    private ResponseStatus status;
    private String code;
    private String description;
    private List<ErrorDetail> errorDetails;
    private T body;

    public Response<T> add(String code, String message) {
        return this.add(new ErrorDetail(code, message));
    }

    public Response<T> add(String code, String message, String detail) {
        return this.add(code, message, detail);
    }

    public Response<T> add(ErrorDetail errorDetail) {
        this.getErrorDetails().add(errorDetail);
        return this;
    }

}
