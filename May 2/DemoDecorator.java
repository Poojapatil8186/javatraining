interface Car {
public void assemble();
}
class BasicCarimplements Car {
@Override
public void assemble() {
System.out.print("Basic Car.");
}
}
class CarDecoratorimplements Car {
protected Car car;
    public CarDecorator(Car c){
this.car=c;
}
@Override
public void assemble() {
this.car.assemble();
}
}
class SportsCarextends CarDecorator {
public SportsCar(Car c) {
super(c);
}
@Override
public void assemble(){
super.assemble();
System.out.println(" Adding features of Sports Car.");
}
}
class LuxuryCarextends CarDecorator {
public LuxuryCar(Car c) {
super(c);
}
@Override
public void assemble(){
super.assemble();
System.out.println(" Adding features of Luxury Car.");
}
}
public class DemoDecorator {
public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
sportsCar.assemble();
System.out.println("\n*****");
Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
sportsLuxuryCar.assemble();
}
}

