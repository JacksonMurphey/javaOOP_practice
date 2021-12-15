
public class Greeter {
    
    //Class Attributes: 
    //Known in java as member variables/fields/instance variables


    // public String greet(String name){
    //     return "Hello " + name;
    // }

    // public String greet() {
    //     return "Hello World";
    // }
    // Both of these methods do the same thing. Except one greets a name we pass to it(variable), the other greets Hello. 
    // This is also an example of method overloading. 


    // Lets refactor the above code, to instead call methods within methods - to make our code cleaner and easier to maintain. 
    // What the below code now allows is the creation for more complex methods, without the need to rewrite or refactor our code at each step.

    public String greet(String name){
        return createGreeting(name);
    }

    public String greet() {
        return createGreeting("World");
    }

    // new method we are adding after the creation of our private method: createGreeting()
    public String greet(String firstName, String lastName){
        return createGreeting(firstName + " " + lastName);
    }

    private String createGreeting(String toBeGreeted) { // NOTE: we have created a PRIVATE method, that returns "Hello" + a String variable that will be defined over in our Test.java File. This allows us to now call this method within our public methods, thus preventing us from having to edit/refactor our code for each new method we create where we would want it to, in this case greet someone/something. 
        return "Greetings " + toBeGreeted + ", welcome to Coding Dojo."; // now we can change how we greet them from "Hello" to "Greeting" and add something to say after we have greeted them.
    }
    // So, each one of our public methods, is now utilizing our private method. Now if we want to change/update all our methods, we need only update the private method createGreeting() and it will apply those changes to our public methods where we have called the createGreating() method. 

    public static void testGreeting(String name){
        System.out.println("This is a test of a static method, " + name );
    } // See below in our breakdown of Methods, for what Static means to understand what we are going to do with this. 
    // Check our GreeterTest.java file to see this in action. 



    //Lets Breakdown the createGreeting() method. 
    /*
    1st     2nd    3rd            4th
    private String createGreeting(String toBeGreeted) {

        5th
        return "Greetings " + toBeGreeted + ", welcome to Coding Dojo.";
    }

    1st
    private: 
    this first word private(or public,protected) is called a MODIFIER
    Specifically this is an ACCESS modifier. private means that the method will only be available for use within is the class it is assigned to. So in this case, it is only available in the Greeter Class. 
    
    So when we go to our GreeterTest Class, we DO NOT have access to this method. If you were to try to use it within another class, you would get the error: createGreeting has private access.

    If we were to change this method to public, then it would work if called withing another class. 

    Public:
    is the default modifier. This means we if we do not specify our method with a modifier, it defaults to public. It allows means that you could write a method and omit the modifier. 
    example: 

    String greet(String firstName, String lastName){
        return createGreeting(firstName + " " + lastName); }
    This would default to a public method, and would still work. 

    Protected:
    This is another type of modifer. Protected methods are only available to sub-classes. So if we were to create a sub-class for our Greeter class, then a protected method could be used within that subclass, but not within another class that is not a sub-class.


    2nd 
    String:
    This 2nd part of our method, is our Return type. This tells us that this method will return a String no matter what. If we were to change this part of the method to "int", then run it, we would get thrown the error: incompatible types.

    This helps prevent us making simple mistakes that could be easily avoid just by having the compiler check for us. 


    3rd
    createGreeting:
    This is the method name. This needs to always be camelCase, if multiple words, and it should be a verb. If we were to be returning a boolean(instead of a string), then we should name it with a state of being verb like: isEmpty, hasContents, etc. Something that lets another programmer know that this method is checking if something is true or false. 

    
    4th
    Parameters: (String firstName, String lastName)
    Similar to our methods, our parameters have a data/object type associated with them. In this case, String firstName. What this means, if we were to pass an argument to this method that was not a string, it would not compile, thus you would get an error. 
    
    So, defining the data/object type that this method will accept and work with is needed in order to prevent someone passing say an int to our method and causing it to break. in this case, the error would say: int cannot be converted into a string.


    5th
    Method Body: {return createGreeting(firstName + " " + lastName);}
    This is one of the most important parts of your method. It is where we define the functionality of the method.

    BONUS
    static:
    You see this every time you create your Main(Stirng[] args) method.
    It is the most used modifier, that IS NOT an access modifier. All this modifier does, is tells us that it is a class method, and not an instance method. 

    What does that mean: 
    this means that we can use this static method, without the class being instantiated. Meaning we wouldnt have to write a line similiar to: Greeter greeter = new Greeter();
    Also of Note: if you were to create a class attribute, if were then to create a static method, the attribute could not be passed to this static method. 

    */

}
