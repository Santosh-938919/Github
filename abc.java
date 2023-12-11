public class abc {
 public static void main(String[] args) {
 String str = null;
 try {
 // This will throw a NullPointerException
 int length = str.length();
 } catch (NullPointerException e) {
 // Handle the NullPointerException
 System.err.println("NullPointerException: " + e.getMessage());
 }
 }
}
