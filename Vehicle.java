
public class Vehicle {
    private int numberOfWheels;
    private String color;


    // Constructor Methods // Overloaded Constructor Methods
    public Vehicle(){

    }

    public Vehicle(String color){
        this.color = color;
    }

    public Vehicle(String color, int number){
        this.color = color;
        this.numberOfWheels = number;
        //the above line could also be written as:
        //----- numberOfWheels = number; 
        // this is becasue our member variable name, doesnt match our parameter varaible name. 
    }
    // Overloading a Method is just defining a 'New Method Signature' for the same method name. Now, we can instantiate objects in 3 different ways.
    // new Vehicle();
    // new Vehicle("Red");
    // new Vehicle("Blue", 4);

    // NOTE: Any method can be overloaded, not just constructor methods. 


    // getter method
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    // setter method
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }

    // getter method
    public String getColor() {
        return color;
    }

    // setter method
    public void setColor(String color) {
        this.color = color;
        // 'this' keyword is necessary here to specify that we are talking about the instance variable and not the parameter variable. 
    }


}
