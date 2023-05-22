package java11;

// public class Question1 {
    import java.util.function.BiFunction;

    public class SimpleInterestCalculator {
        public static void main(String[] args) {
            BiFunction<Double, Double, Double> calculateSimpleInterest = (principal, rate) -> (principal * rate) / 100;
            
            double principal = 1000.0;
            double rate = 5.0;
            
            double interest = calculateSimpleInterest.apply(principal, rate);
            System.out.println("Simple Interest: " + interest);
        }
    }
      
// }
