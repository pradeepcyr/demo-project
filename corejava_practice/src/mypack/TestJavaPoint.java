package mypack;
class Javatpoint{  
private int i;  
Javatpoint(){}  
Javatpoint(int i){  
this.i=i;  
}  
public int getValue(){  
return i;  
}  
public void setValue(int i){  
this.i=i;  
}  
 public String toString() {  
  return Integer.toString(i);  
}  
}  
public class TestJavaPoint {
public static void main(String[] args) {
Javatpoint j = new Javatpoint (60000);
System.out.println(j);
}
}
