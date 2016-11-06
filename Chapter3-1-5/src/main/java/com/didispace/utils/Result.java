package com.didispace.utils;

public enum Result {
    SUCCESS(0, "SUCCESS"),
    FAIL(1, "FAIL");

    private final int code;
    private final String message;

    Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static Result valueOf(int code) {
        for (Result r : values()) {
            if (r.code == code) {
                return r;
            }
        }
        throw new RuntimeException("Undefined Result " + code);
    }
}
