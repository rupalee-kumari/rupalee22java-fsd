public class stringconversion {
        public static void main(String[] args) {
            // Create a string
            String s1= "welcome";

            // Convert string to StringBuffer
            StringBuffer sb = new StringBuffer(s1);
            System.out.println("String to StringBuffer:");
            System.out.println("s1 " + s1);
            System.out.println(sb);
            System.out.println();

            // Convert string to StringBuilder
            StringBuilder s2 = new StringBuilder(s1);
            System.out.println("String to StringBuilder:");
            System.out.println(s1);
            System.out.println(s2);
        }
    }


