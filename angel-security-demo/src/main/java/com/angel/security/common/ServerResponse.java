package com.angel.security.common;

/**
 * @author JingXiang Bi
 * @date 2019/5/6
 */
public class ServerResponse<T> {
    private int code;
    private String message;
    private T data;

    public ServerResponse() {
    }

    public ServerResponse(int code) {
        this.code = code;
    }

    public ServerResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ServerResponse(int code, String message, T data) {

        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ServerResponse(int code, T data) {

        this.code = code;
        this.data = data;
    }

    public boolean isSuccess(){
        return  this.code==ResponseCode.SUCCESS.getCode();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccessMessage(String message){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),message);
    }

    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ServerResponse<T> createBySuccess(String message,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),message,data);
    }

    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }

    public static <T> ServerResponse<T> createByErrorMessage(String message){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),message);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode,String message){
        return new ServerResponse<T>(errorCode,message);
    }
}
