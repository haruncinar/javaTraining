import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}

public class inheritance1{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}