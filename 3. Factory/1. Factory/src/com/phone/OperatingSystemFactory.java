package com.phone;

public class OperatingSystemFactory {
    public OS getInstance(String os){
        switch (os) {
            case "Android":
                return new Android();
            case "IOS":
                return new IOS();
            case "Windows":
                return new Windows();
            default:
                return null;
        }
    }
}
