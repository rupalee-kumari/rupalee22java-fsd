public class TryCatchFinally {
         public static void main(String[] args) {
            System.out.println("Hi");
            int a=100;
            int b=0;
            try {
                int result = 100/0;
                System.out.println("Result is "+result);
                System.out.println("No Exception");


            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("finally block");
            }
            System.out.println("Finish");
        }

    }
