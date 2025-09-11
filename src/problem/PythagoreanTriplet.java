package problem;
/*
* Ques: A Pythagorean triplet is a set of three integers a, b and c such that a2 + b2 = c2. Given a limit, generate all Pythagorean Triples with values smaller than given limit.

Input : limit = 20
Output : 3 4 5
         8 6 10
         5 12 13
         15 8 17
         12 16 20
         *
An Efficient Solution can print all triplets in O(k) time where k is number of triplets printed. The idea is to use square sum relation of Pythagorean triplet, i.e., addition of squares of a and b is equal to square of c, we can write these number in terms of m and n such that,

       a = m2 - n2
       b = 2 * m * n
       c  = m2 + n2
because,
       a2 = m4 + n4 – 2 * m2 * n2
       b2 = 4 * m2 * n2
       c2 = m4 + n4 + 2* m2 * n2

* */
public class PythagoreanTriplet {
    public static void pythagoreanTripletsSelf(int limit)
    {
        for (int i = 1; i <=limit ; i++) {
            for (int j = i+1; j < limit; j++) {
                for (int k = j+1; k < limit; k++) {
                    if (i*i + j*j == k*k)
                        System.out.println(String.format("%d, %d, %d", i, j, k));
                }
            }
        }
    }

    public static void pythagoreanTriplets(int limit)
    {
        int a,b,c=0;
        int m=2;
        while(c<limit)
        {
            for(int n=1;n<m;++n)
            {
                a=m*m-n*n;
                b=2*m*n;
                c=m*m+n*n;
                if(c>limit)
                    break;
                System.out.println(a+" "+b+" "+c);
            }
            m++;
        }
    }

    public static void main(String[] args) {
        pythagoreanTriplets(20);
        System.out.println("*******");
        pythagoreanTripletsSelf(20);
    }
}
