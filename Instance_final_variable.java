public class Instance_final_variable {
    final int instanceVariable;
    //Constructor to initilize final variable
    public Instance_final_variable(int value){
        this.instanceVariable=value;
    }
public void display(){
    //instanceVariable = 20; // This would cause a compilation error.
    System.out.println("Instance final variable:"+instanceVariable);
    }
    public static void main(String[] args) {
        Instance_final_variable variable = new Instance_final_variable(10);
        variable.display();
    }
}
