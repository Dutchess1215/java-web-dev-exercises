package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop =  new Laptop(2,3,true,5);
        SmartPhone myPHone = new SmartPhone(1,2,false, 1);

        System.out.println(myLaptop);
        System.out.println(myPHone);
    }
}
