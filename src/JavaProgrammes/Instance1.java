package JavaProgrammes;

public class Instance1 {
    public int first;
    //Declear instance variables
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Instance1 obj = new Instance1();
        System.out.println(obj.x);//access by object into static variable
        System.out.println(obj.y);//access by object into static variable
    }

    public void text(){
        //Instance area
        System.out.println(x);
        System.out.println(y);
    }
    }
