class Engine{
    void start(){
        System.out.println("Engine Started");
    }
}
class Car{
    Engine engine = new Engine();
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}
public class Main{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.drive();
    }
}