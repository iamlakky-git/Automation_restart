package programming;

public class program{

    void  add (int a , int b){
        int c = a+b;
        System.out.println("addition of Number="+c);
    }

    void multiply(int a, int b){
        int m= a*b;
        System.out.println("Multiply of Number="+m);
    }

    void subtract(int a, int b){
        int s=a-b;
        System.out.println("Subtraction of Number="+s);
    }

    public static void main(String[] args) {
        program p1= new program();
        p1.add(10,20);
        p1.multiply(5,2);
        p1.subtract(20,12);
    }


//    int id;
//     String name;
//    program(int roll, String n1){
//       id = roll;
//       name= n1;
//
//    }
//
//    void display(){
//        System.out.println(id+""+name);
//    }
//
//    public static void main(String[] args) {
//        program p1 = new program(111, "laxman");
//        p1.display();
//    }



}
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//
//
//            System.out.println(i);
////        }
////        int number = 9;
////        if(number%2==0) {
////            System.out.println("Even number");
////        }
////
////            else {
////                System.out.println("odd number");
////
////        }
//        }
//    }

