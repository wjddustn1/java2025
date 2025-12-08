package ex01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시 Z", "블랙", "SKT", "안드로이드 15", 256, true);

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
        System.out.println("통신사: " + myPhone.carrier);
        System.out.println("OS: " + myPhone.os);
        System.out.println("저장 공간: " + myPhone.storageGB + "GB");
        System.out.println("5G 지원: " + myPhone.has5G);
        System.out.println("--------------------");

        myPhone.powerOn();
        myPhone.vibrate();
        myPhone.call("010-xxxx-xxxx");
        myPhone.receiveCall("010-oxox-oxox");
        myPhone.hangUp();
        myPhone.sendMessage("오늘 저녁 같이 먹을래?", "김철수");
        myPhone.adjustVolume(5);
        System.out.println("--------------------");

        myPhone.installApp("인스타그램");
        myPhone.runApp("유튜브");
        myPhone.browseWeb("www.google.com");
        myPhone.takePhoto();
        myPhone.recordVideo();
        myPhone.connectWifi("MyHome_5G");
        myPhone.useNFC();
        myPhone.makePayment(15000);
        myPhone.chargeBattery();
        myPhone.disconnectWifi();
        System.out.println("--------------------");

        myPhone.powerOff();
    }
}