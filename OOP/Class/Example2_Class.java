class CellPhone{
    public void ring(){
        System.out.println("Phone is Ringing.....");
    }

    public void vibrate(){
        System.out.println("Phone is Vibrating.....");
    }

    public void call(){
        System.out.println("Calling to Friend.....");
    }
}
public class Example2_Class {
    public static void main(String[] args) {
        CellPhone cell = new CellPhone();

        cell.call();
        cell.ring();
        cell.vibrate();
    }
}
