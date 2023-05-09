public class SumCalculator {
    public int sum(int n){
        int counter = 0;
        if(n <= 0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i <= n; i++) {
            counter += i;
        }
        return counter;
    }
}
