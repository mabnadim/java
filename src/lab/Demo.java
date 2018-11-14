    package lab;
    public class Demo {
    public static void main(String[] args) {
    // String array example
    char[] a = {'n','a','d','i','m'};
    String str = new String(a);
    String s1 = "Nadim";
    String s2 = "Bhuiyan";
    //concate example
    System.out.println("result is : "+str);
    System.out.println(s1+" "+s2);
    System.out.println(s1.concat(s2));
    System.out.println(s1.charAt(2));
    // Replace example
    String s = s1.replace(s2,s1);
    System.out.println(s);
    System.out.println(s1.replace(s1, s2));
    // length example
    int len = s1.length();
    System.out.print(len+"\n");
    // compare example
    int comp = s1.compareTo(s2);
    System.out.print(comp+"\n");
    //  StringBuffer example
    StringBuffer sb = new StringBuffer("My name is ");
    sb.append("Nadim");
    System.out.println(sb);
    System.out.println(sb.reverse());
    // Substring example
     String sub = "OOP Class";
        System.out.println(sub.substring(0, 3));
        System.out.println(sub.substring(4));
        System.out.println(sub.indexOf("C"));
    }    
  }
