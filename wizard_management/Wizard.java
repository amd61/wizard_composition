package wizard_management;
import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  private Flyable ride;
  private Protector vigilante; 
 

  public Wizard(String name, Flyable ride, Protector vigilante) {
    this.name = name;
    this.ride = ride;
    this.vigilante = vigilante;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
  return this.ride;
  }

  public Protector getVigilante(){
  return this.vigilante;
  }

  public String protect (){
    return this.vigilante.protect();
  }
  
  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public void setVigilante(Protector vigilante){
    this.vigilante = vigilante; 
  }

  
}