//Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer
//(2) Supplier
//(3) Predicate
//(4) Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Ques5 {
    public static void main(String[] args) {
        Consumer consumer=e ->System.out.println(e);
        consumer.accept(2);
        Supplier supplier=()->2;
        System.out.println(supplier.get());
        Predicate predicate= e->true;
        System.out.println(predicate.test(5));
        Function function=e_-> e_.getClass();
        System.out.println(function.apply(5));
    }

}
