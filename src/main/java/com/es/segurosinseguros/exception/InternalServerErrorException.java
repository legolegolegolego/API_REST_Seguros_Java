package com.es.segurosinseguros.exception;

public class InternalServerError extends RuntimeException {
    private static final String DESCRIPCION = "Not Found (404)";

    public InternalServerError(String mensaje) {
        super(DESCRIPCION + ". " + mensaje);
    }
}
