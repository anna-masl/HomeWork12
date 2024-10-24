package app;

public class Car {

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

     private void startElectricity(){
         System.out.println("Call the method startElectricity");
    }
     private void startCommand(){
         System.out.println("Call the method startCommand");
    }
     private void startFuelSystem(){
         System.out.println("Call the method startFuelSystem");
    }

}
