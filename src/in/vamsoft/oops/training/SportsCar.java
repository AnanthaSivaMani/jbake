package in.vamsoft.oops.training;

public class SportsCar extends Car {

  public SportsCar() {
	System.out.println("SportsCar.SportsCar()");
  }

  public SportsCar(String model) {
	System.out.println("SportsCar.SportsCar()");
	System.out.println(model);
  }

  @Override
  public void start() {
	System.out.println("Sports Car Starting....");

  }

  @Override
  public void stop() {
	System.out.println("Sports Car Stopped....");

  }

  @Override
  public void brake() {
	System.out.println("SportsCar.brake()");

  }

}
