package BasicQuestion;

public class CompareObject {
   public static void main(String []args) {
	   String s1=new String("kundan");
	   String s2=new String("kundan");
	   System.out.println(s1==s2);
	   System.out.println(s1.equals(s2));
	   //but in other case
	   String s3="kundan";
	   String s4="kundan";
	   System.out.println(s3==s4);
	   //here also reference comparison but constant pool concept
	   
	   
	   
   }
}
