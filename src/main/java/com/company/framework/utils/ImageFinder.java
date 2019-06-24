package com.company.framework.utils;


public class ImageFinder {
    private final Context context;

    public ImageFinder(Context context){
        this.context = context;
    }


    public static String getImageByDevice(String image, Context context) {
        String userDir = System.getProperty("user.dir");
        String imagePath=null;


        String device = context.getValue("device").toString();
        String OS = context.getValue("platform").toString();
        String browser = context.getValue("browserName").toString();

        if (device.equals("PC")) {
            switch (image) {
                case "logo":
                    imagePath = userDir + "/sikuliX/pc/facebookLogo.png";
                    break;
                case "mail":
                    imagePath = userDir + "/sikuliX/pc/emailField.png";
                    break;
                case "password":
                    imagePath = userDir + "/sikuliX/pc/passwordField.png";
                    break;
                case "button":
                    imagePath = userDir + "/sikuliX/pc/loginButton.png";
                    break;
            }
        } else {
            if(OS.equals("iOS")) {
                switch (image) {
                    case "logo":
                        imagePath = userDir + "/sikuliX/mobile/iOS/facebookLogo.png";
                        break;
                    case "mail":
                        imagePath = userDir + "/sikuliX/mobile/iOS/emailField.png";
                        break;
                    case "password":
                        imagePath = userDir + "/sikuliX/mobile/iOS/passwordField.png";
                        break;
                    case "button":
                        imagePath = userDir + "/sikuliX/mobile/iOS/loginButton.png";
                        break;
                }
            }
            else if(OS.equals("Android")){
                // Native
                if(browser == null) {
                    switch (image) {
                        case "logo":
                            imagePath = userDir + "/sikuliX/mobile/android/native/facebookLogo.png";
                            break;
                        case "mail":
                            imagePath = userDir + "/sikuliX/mobile/android/native/emailField.png";
                            break;
                        case "password":
                            imagePath = userDir + "/sikuliX/mobile/android/native/passwordField.png";
                            break;
                        case "button":
                            imagePath = userDir + "/sikuliX/mobile/android/native/loginButton.png";
                            break;
                    }
                }
                else {
                    //Web
                    switch (image) {
                        case "logo":
                            imagePath = userDir + "/sikuliX/mobile/android/web/facebookLogo.png";
                            break;
                        case "mail":
                            imagePath = userDir + "/sikuliX/mobile/android/web/emailField.png";
                            break;
                        case "password":
                            imagePath = userDir + "/sikuliX/mobile/android/web/passwordField.png";
                            break;
                        case "button":
                            imagePath = userDir + "/sikuliX/mobile/android/web/loginButton.png";
                            break;
                    }
                }
            }
        }
        return imagePath;
    }
}
