//5. WAP to show object cloning in java using cloneable and copy constructor both.
class copy {

    public void main(String[] args) {
        main c1 = new main("ayush");
        main c2 = new main(c1);
    }
    class main{
        String string;
        public main(String string){
            this.string=string;
        }
        //copy constructor
        public main(main c) {
            System.out.println("copy constructor called");
            string = c.string;
            System.out.println("copied string is:" + string);
        }
    }
}


