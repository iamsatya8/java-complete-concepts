>Class is a blueprint of objects, for Example if we take an example of birds there are many birds but the states and functions of all birds are same right same thing here, bird class is different from other classes for example human class has different sates and function so from human class we can create many human objects one person could be small in height one person in tall these .are features nothing but properties of the class walking, doing something called function so Class (Blue Print) can have >properties and functions

CREATE A CLASS IN JAVA 

class ClassName{
    // fields
    // methods
}

CREATING AN OBJECTS IN JAVA

className object = new className();

//for Bicycle class
Bicycle sportsBicycle = new Bicycle();
Bicycle touringBicycle = new Bicycle();


ACCESS MEMBERS OF A CLASS

class Bicycle {
    //filed of class
    int gear = 5;
    //method of class
    void braking(){
    }
}

// create object
Bicycle sportsBicycle = new Bicycle();

// access field and method
sportsBicycle.gear;
sportsBicycle.breaking();

