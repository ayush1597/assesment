//6. WAP showing try, multi-catch and finally blocks.
class try_class {
    public static void main(String[] args) {
        int[] array=new int[4];

        try {
             int i=array[4];
            }
            catch(Exception e) {
System.out.println("catch block executed");
e.printStackTrace();
            }
            finally {
            System.out.println("final block executed");
        }
        System.out.println("Outside try-catch-finally clause");
    }
}
