package mypack;
public class TestEncapsulation {
public static void main(String[] args) {
Account acc = new Account ();
acc.setAcc_no(7560504000L);
acc.setName("PRADEEP");
acc.setEmail("chpradeep129@gmail.com");
acc.setAmount(100000L);
System.out.println( acc.getAcc_no()+" " +acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
}
}
