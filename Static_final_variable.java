public class Static_final_variable {
    static final int STATIC_VARIABLE = 10;

    public void display(){
        //Static variable=200; //This could cause a compilation error.
        System.out.println("Static final variable:"+STATIC_VARIABLE);
    }
    public static void main(String[] args) {
        Static_final_variable variable = new Static_final_variable();
        variable.display();
    }
}
