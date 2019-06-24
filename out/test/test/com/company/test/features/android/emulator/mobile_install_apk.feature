Feature: Android - EMULATOR-INSTALL APK
   As a user
   I want to


     @working
     Scenario Outline: Android Emulator - <config> - Install And Login to Facebook apk.
       Given <config> appium driver
         | field            | data                                                                           |
         | appPackage       | com.facebook.katana                                                            |
         | appActivity      | com.facebook.katana.LoginActivity                                              |
#        | app              | /JAVA_TAS/java_repo_small/lfs/AndroidApp/facebook.apk                          |
         | app              | /Users/gmarkulin/JAVA_TAS/java_repo_small/lfs/AndroidApp/facebook.apk          |

       When I enter email "diego.diazz.2200@gmail.com" by using mobile android
       And I enter password "test123456!" by using mobile android
       And I click the login button by using mobile android
       Then Alert appears by using mobile android

     Examples:
       | config                                      |
       | android_nexus6_android7.1.1_default_config  |