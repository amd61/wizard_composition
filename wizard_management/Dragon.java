package wizard_management;
import behaviours.Flyable;
import behaviours.Protector;

// above is a route
public class Dragon extends MythicalBeast implements Flyable, Protector {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  public String protect(){
    return "Dragon to the rescue!";
  }


}