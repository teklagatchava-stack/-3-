package org.example;
// დავალება 4

public class URLValidator {

    public static void main(String[] args) {

        URLValidator validator = new URLValidator();

        System.out.println(validator.isValid("https://google.com"));
        System.out.println(validator.isValid("http://facebook.com"));
        System.out.println(validator.isValid("www.google.com"));
        System.out.println(validator.isValid("https://"));
        System.out.println(validator.isValid(".comhttps://"));
    }

    public boolean isValid(String url) {


        int protocolIndex = url.indexOf("http://");
        int httpsIndex = url.indexOf("https://");

        int dotIndex = url.indexOf(".");


        if (protocolIndex == -1 && httpsIndex == -1) {
            return false;
        }
        if (dotIndex == -1) {
            return false;
        }


        int protocolEnd;
        if (httpsIndex != -1) {
            protocolEnd = httpsIndex + "https://".length();
        } else {
            protocolEnd = protocolIndex + "http://".length();
        }

        return dotIndex > protocolEnd;
    }

}