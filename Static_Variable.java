public class Static_Variable {
    int roll_no;//instance variable
    String name;
    static String college="MMDU"; //Static Variable

    //Constructor
    Static_Variable(int r, String n){
        roll_no=r;
        name=n;
    }
    
    //Method to display the values
    void display(){
        System.out.println(roll_no+""+name+""+college);
    }
    //Test class to show the value of objects.
    public class TestStaticVariable{
        public static void main(String [] args){
            Static_Variable s1=new Static_Variable(111,"Gautam");
            Static_Variable s2=new Static_Variable(222,"Vikash");
            Static_Variable s3=new Static_Variable(333,"Diwakar");

            //We can change the college of all objects by the single line of code 
            //Student.college="XYZ";
            s1.display();
            s2.display();
            s3.display();
        }
        
    }
}
