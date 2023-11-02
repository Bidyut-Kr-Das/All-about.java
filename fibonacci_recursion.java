public class fibonacci_recursion {
    
    static void fibonacci(int a, int b,int elements){
        int sum;
        if(elements>2){
            if(elements!=2){
                sum=a+b;
                a=b;
                b=sum;
                elements--;
                System.out.print(","+sum);
                fibonacci(a, b, elements);
            }
            else{
                sum=a+b;
                System.out.print(sum);   
            }
        }
    }
    public static void main(String[] args) {
        //printing the initial two values seperately;
        System.out.print("0");
        System.out.print(",1");
        //Calling the recursive function;
        fibonacci(0,1,6);
    }
}
// step 1 : get first 2 value from user and how many elements of fibonacci series to print and pass all these to the function as an argument.

// step 2: create a function that can recursively call it self and determine the next element.
// step 3: in the function we need to take the user given first 2 values as an argument.
// step 4: then we will check if  recursive call is exceeding the number of elements. If it is not exceeding then we will calculate
//             next element and call the function again.
// step 5: if the recursive call is exceeding the number of elements provided by the user then we will stop the recursive call.
//             and print the final result.            
