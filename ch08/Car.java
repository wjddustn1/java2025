public class Car implements Driveable {
    Wheel frontLeftWheel = new Wheel("Michelin", 18);
    Wheel frontRightWheel = new Wheel("Michelin", 18);
    Wheel backLeftWheel = new Wheel("Goodyear", 17);
    Wheel backRightWheel = new Wheel("Goodyear", 17);

    Engine mainEngine = new Engine("V8", 400);

    Light headlight = new Light("전방");
    Light taillight = new Light("후방");

    private boolean isEngineRunning = false;

    public Car() {
        System.out.println("새로운 차가 준비되었습니다.");
    }

    public void startEngine() {
        if (!isEngineRunning) {
            mainEngine.start();
            isEngineRunning = true;
            System.out.println("차가 주행 준비를 마쳤습니다.");
        } else {
            System.out.println("이미 엔진이 작동 중입니다.");
        }
    }

    public void shutDownEngine() {
        if (isEngineRunning) {
            mainEngine.shutdown();
            isEngineRunning = false;
            System.out.println("차가 정지했습니다.");
        } else {
            System.out.println("엔진이 꺼져 있습니다.");
        }
    }

    @Override
    public void move() {
        if (isEngineRunning) {
            System.out.println("차가 전진합니다.");
            mainEngine.accelerate();
            frontLeftWheel.rotate();
            frontRightWheel.rotate();
            backLeftWheel.rotate();
            backRightWheel.rotate();
        } else {
            System.out.println("엔진이 꺼져있어 움직일 수 없습니다.");
        }
    }

    @Override
    public void stop() {
        System.out.println("차가 브레이크를 밟아 멈춥니다.");
    }

    @Override
    public void steer(String direction) {
        System.out.println(direction + " 방향으로 조향합니다.");
    }

    public void activateLights() {
        headlight.turnOn();
        taillight.turnOn();
    }

    public void deactivateLights() {
        headlight.turnOff();
        taillight.turnOff();
    }

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();
        myCar.activateLights();
        myCar.move();
        myCar.steer("오른쪽");
        myCar.move();
        myCar.stop();
        myCar.deactivateLights();
        myCar.shutDownEngine();
    }
}