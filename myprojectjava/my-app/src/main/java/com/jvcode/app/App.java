package com.jvcode.app;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        charType();
        minMax();
        casting();
        literals();
    }

    private static void charType(){
        System.out.println("\nType Char:");

        char x1 = '\u0032';
        System.out.println(x1);

        char x2 = '2';
        System.out.println(x2); 
        x2 = 65;
        System.out.println(x2);

        char y1 = '\u0041';
        System.out.println(y1);

        char y2 = 'A';
        System.out.println(y2);
    }

    private static void minMax() {
        System.out.println("\nMin and max");

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
    }

    private static void casting(){
        System.out.println("\nJava floating point & double");

        float f = 43.3f;
        System.out.println(f);
        float d = 45.4F;
        System.out.print(d);

        double a = 42.3f;
        double b = 44.2F;

        System.out.println(a);
        System.out.println(b);
    }

    private static void literals(){
        int i = 42;

        System.out.println("\nLiterals:");
        System.out.println(Integer.toString(i, 8)); //prints 52
        System.out.println(Integer.toString(i, 16)); //prints 2a
        System.out.println(Integer.toString(i, 2)); //prints 101010
    }
       //String types and literals

   public static void compareReferences(){
    System.out.println("\nComparing string references:");
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1 == s2);
    System.out.println("abc" == s1);

    String o1 = new String("abc");
    String o2 = new String("abc");
    System.out.println("abc" == o1);
    System.out.println(o1 == o2);

    System.out.println("\ncomparing string references after using intern():");
    System.out.println("abc" == o1.intern());
    System.out.println("\nCompare string spelling:");
    System.out.println(o1.equals(o2));
    System.out.println(o2.equals(o1));
    System.out.println(o1.equals("abc"));
    System.out.println("abc".equals("abc"));
}

public static void textBlock(){
    System.outprintln("\nText block:"); //Similar to Code blocks
    //without text block
    String html1 = "<html>\n" +
    "   <body>\n" +
    "      <p>Hello World.</p>\n" +
    "   </body>\n" +
    "</html>\n";
    System.out.println(html1);
    //using text block
    String html2 = """
        <html>
           <body>
              <p>Hello World.</p>
           </body>
        </html>
          """;

    System.out.println(html2);

}

}
