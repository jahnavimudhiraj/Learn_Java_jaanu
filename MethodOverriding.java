public class Parent{
    void property(){
    System.out.println("This property belongs to SRINIVAS");

    }
}
class Child extends Parent{
   void property(){
    System.out.println("This peoperty belongs to JAHNAVI");
   }
}
public class MethodOverriding{
    public static void main(String jons[]){
        Child jaanu=new Child();
        jaanu.property();

    }

}