//Implement Singleton Design Pattern on a dummy class.
class Singleton{
  //private constructor
    private Singleton(){
    }
    // Inner class to provide instance of class
    private static  class InnerSingleton{
         static Singleton object=new Singleton();
    }
    //method to get instance
    static  Singleton getInstance(){

        return InnerSingleton.object;
    }

}
class Dummy {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance();
    }
}

