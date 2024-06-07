public class Local_Final_Variable{
    public void display(){
        final int localvariable=10;
        System.out.println("Local final variable:"+localvariable);
    }
    public static void main(String[] args) {
        Local_Final_Variable s=new Local_Final_Variable();
        s.display();
    }
}