package recursion;

public class goorm_pizza {
    public int getMaxPizzaCoupon(int n, int m){
        int pizza= n;
        pizza += n/m;
        pizza += ((n/m) + (n%m)) / m;
        return pizza;
    }
}
