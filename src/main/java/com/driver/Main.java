package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly r = new RWOnly();
//        String name = r.name;
//        System.out.println(name);
//       Error: java: name has private access in com.driver.RWOnly

        r.setName("Nikhil's Assignment");
        System.out.println(r.getName());


    }
  
}