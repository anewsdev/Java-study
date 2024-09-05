package week03.parameter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        char type = 'D';
        car.brakePedal(type);

        System.out.println("type = " + type);
        System.out.println("gear = " + car.gear);

        System.out.println();

        Tire tire = new Tire();
        tire.company = "금호";

        Tire carInstanceTire = car.setTire(tire);

        System.out.println("tire.company = " + tire.company);

        System.out.println("carInstanceTire.company = " + carInstanceTire.company);

        //기본형 변수는
        //type = D
        //gear = P
        //이렇게 값이 변하지 않지만
        //참조형 변수는
        //tire.company = KIA
        //carInstanceTire.company = KIA
        //선언한 값 자체가 변한다.
    }
}
