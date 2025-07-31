package com.hmdm.device_api.response;

public class Response {
    private boolean success;
    private String message;
    private Object data;

    public static Response OK(String message, Object data) {
        return new Response(true, message, data);
    }

    public static Response FAIL(String message) {
        return new Response(false, message, null);
    }

    public static Response DUPLICATE_ENTITY(String message) {
        return new Response(false, message, null);
    }

    private Response(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // Getters and setters
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
}
