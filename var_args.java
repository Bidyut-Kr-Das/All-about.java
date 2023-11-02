public class var_args {
    //example of var args(variable arguments)
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result=result+a;
        }
        return result;
    }
    //method overloading
    static void check(){
        System.out.println("Example of method overloading");
    }
    static void check(int a){
        System.out.println("Example of method overloading with second instance");
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(24,3));
        System.out.println(sum(2,1,2,34));
    }
}
