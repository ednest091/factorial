public class FactorialTestDrive {
    public static void main(String[] args) {
        long numfactorial = 8;
        Factorial fact = new Factorial(numfactorial);
        long resultado = fact.printFactorial(numfactorial);
        System.out.println(resultado);
    }
}
