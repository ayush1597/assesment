// Implement multiple inheritance with default method inside  interface.
interface  MainInterface {
    default int compute(int a, int b) {
        return a + b;
    }
}

    interface  interface1 extends MainInterface {
        default int compute(int a, int b) {
            return a - b;
        }

        interface interface2 extends MainInterface {
            default int compute(int a, int b) {
                return a * b;
            }
        }

        public class Ques8 implements interface1, interface2 {
            @Override
            public int compute(int a, int b) {
                return a / b;
            }

            public static void main(String[] args) {


                Ques8 performComputation = new Ques8();
                System.out.println(performComputation.compute(4, 2));

            }

        }
    }