
 class Singleton {
     private static Singleton single_instance = null;
     String s;
     private Singleton()
     {
     s="hello from singleton class";
     }
     public static Singleton getinstance() {
         if (single_instance == null) {
             single_instance = new Singleton();
         }
         return single_instance;
     }
 }
 class test{
     public static void main(String[] args) {
         Singleton x = Singleton.getinstance();
         System.out.println(x.s);
     }
 }