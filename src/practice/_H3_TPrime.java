package practice;

import java.util.Arrays;

public class _H3_TPrime
{
public static void main(String[] args)
{
genPrime();
}

public static void genPrime()
{
int n = 10000;
boolean[] seive = new boolean[n+5];
seive[0] = false;
seive[1] = false;

System.out.println("setting primes to be true");
for (int i = 0; i < n; i++)
{
seive[i] = true;
}
System.out.println("setted primes to be true");

//System.out.println(Arrays.toString(seive));
// striking out composites
for (int i = 2; i <= Math.sqrt(n); i++)
{
//System.out.println("check primes");
if (seive[i])
{
// counting rest of composite instances as nonprimes
//j=j+i jumps by i
//System.out.println("Striking primes");
for (int j = 2*i; j <=n; j=j+i)
{
seive[j] = false;
}
}

}

System.out.println("printing prime array");
for (int i = 2; i < 100; i++)
{
if(seive[i]==true)
{
System.out.print(i+" ");
}
//System.out.println(Arrays.toString(seive));

}

}

}