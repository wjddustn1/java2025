package sec01.exam01;

public class DigitalCamera {
    // 필드
    String model;
    String color;
    
    // 생성자 (생략 가능)
    
    // 메서드
    void powerOn() {
        System.out.println("카메라 전원을 켭니다.");
    }
    
    void powerOff() {
        System.out.println("카메라 전원을 끕니다.");
    }
    
    void takePicture() {
        System.out.println("찰칵! 사진을 찍었습니다.");
    }
    
    void recordVideo() {
        System.out.println("동영상 녹화를 시작합니다.");
    }
    
    void stopVideo() {
        System.out.println("동영상 녹화를 중지합니다.");
    }
}