package ex01;

public class CellPhone {
    public String model;
    public String color;
    public String carrier;

    public CellPhone(String model, String color, String carrier) {
        this.model = model;
        this.color = color;
        this.carrier = carrier;
        System.out.println(model + " " + color + " CellPhone이 개통되었습니다. 통신사: " + carrier);
    }

    public void powerOn() {
        System.out.println("전원을 웁니다.");
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    public void call(String number) {
        System.out.println(number + "로 전화를 겁니다.");
    }

    public void receiveCall(String number) {
        System.out.println(number + "로부터 전화가 왔습니다.");
    }

    public void sendMessage(String message, String recipient) {
        System.out.println(recipient + "에게 메시지 전송: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

    public void adjustVolume(int level) {
        System.out.println("볼륨을 " + level + "로 조절합니다.");
    }

    public void vibrate() {
        System.out.println("진동합니다.");
    }
}