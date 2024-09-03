package week03;

public class Main {
    public static void main(String[] args) {
        //여기부터 3주차 Car class 활용

//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        System.out.println(car1); //week03.Car@119d7047 (car1의 주소)
//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for(Car car : carArray){
//            System.out.println("car.gear =" + car.gear);

        Car car = new Car();// 객체 생성

        //초기값, 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println();

        System.out.println("car.speed = " + car.speed);
        System.out.println("car.gear = " + car.gear);
        System.out.println("car.lights = " + car.lights);
        System.out.println();

        System.out.println("car.tire = " + car.tire);
        System.out.println("car.door = " + car.door);
        System.out.println();
        
        //필드 사용
        car.color = "bule";//필드 color에 "bule" 데이터를 저장
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color = " + car.color);
        System.out.println("car.speed = " + car.speed);
        System.out.println("car.lights = " + car.lights);

        //메서드 사용

    }
}

