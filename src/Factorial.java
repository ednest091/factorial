public class Factorial {
    private long numFactorial;

    public Factorial(long numFactorial) {
        this.numFactorial = numFactorial;
    }
    public long printFactorial(long numFact) {
        long factorial = 1;
        for (int i = 1; i <= numFact; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
