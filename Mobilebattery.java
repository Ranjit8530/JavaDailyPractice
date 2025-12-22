class Battery{
    void charge(){
        System.out.println("Battery is charging");
    }
}
class Mobile{
    Battery battery = new Battery();
    void switchOn(){
        battery.charge();
        System.out.println("Mobile is ON");
    }
}
public class Mobilebattery {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.switchOn();
    }
}
