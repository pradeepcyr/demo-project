package com.test.oops;
class king {
king (){System.out.println("king rules");}
}
class Queen extends king {
Queen (){
super ();
System.out.println("Dog is created");
}
}
public class TestSuper3 {
public static void main(String[] args) {
Queen q = new Queen ();
}
}
