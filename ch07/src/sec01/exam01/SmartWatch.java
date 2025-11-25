package sec01.exam01;

public class SmartWatch {
    // 필드
    String model;
    String color;
    
    // 생성자 (필요시 추가 가능)
    
    // 메서드
    void powerOn() {
        System.out.println("스마트워치 전원을 켭니다.");
    }
    
    void powerOff() {
        System.out.println("스마트워치 전원을 끕니다.");
    }
    
    void notifyMessage(String message) {
        System.out.println("알림: " + message);
    }
    
    void measureHeartRate() {
        System.out.println("심박수를 측정합니다.");
    }
    
    void showTime() {
        System.out.println("현재 시간을 표시합니다.");
    }
}