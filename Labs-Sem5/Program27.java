class Box{
    int length;
    int breadth;
    int height;

    // default constructor
    public Box(){
        length = 10;
        breadth = 10;
        height = 10;
    }

    //parameterised constructor
    public Box(int l,int b,int h){
        length = l;
        breadth = b;
        height = h;
    }

    //copy constructor 
    public Box(Box obj){
        this.length = obj.length;
        this.breadth = obj.breadth;
        this.height = obj.height;
    }

    public int calculateVol(){
        return (length*breadth*height);
    }

}

public class Program27 {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Volume is: "+b.calculateVol());
        Box b1 = new Box(10,15,20);
        System.out.println("Volume is: "+b1.calculateVol());
    }
}
