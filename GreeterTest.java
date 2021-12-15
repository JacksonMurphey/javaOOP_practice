public class GreeterTest {
    
    public static void main(String[] args) {
        Greeter.testGreeting("Sam"); // Note: this is a static method and we are able to 

        Greeter greeter = new Greeter();
        String greeting = greeter.greet();
        String greetingWithName = greeter.greet("Jackson");
        System.out.println(greetingWithName);

        String greetingWithFullName = greeter.greet("Jackson", "Murphey");
        System.out.println(greetingWithFullName);



        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Jackson")) { //the || is a logical OR operator and operates on boolean operands. If both operands are false, then the condition becomes false, otherwise it is true. 
            System.out.println("Test Successful");
        } else {
            System.out.println("Test Fail");
        }
        
    }
}
