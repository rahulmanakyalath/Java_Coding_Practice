package Leatcode150.MathFuctions;

public class SquareRoot {
    public int mySqrt(long x) {

        for (int i=1;i<=x/2;i++)
        {
            int k=i+1;
            if((i*i)<=x&& (k*k)>=x){
                if((k*k)==x)
                    return k;
                else
                    return i;
            }
        }
        return 0;
    }
}
