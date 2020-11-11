using System.IO;
using System;

class Program
{
    static void Main()
    {
        int a,b;
        var p = Console.ReadLine().Split();
        a = int.Parse(p[0]);
        b = int.Parse(p[1]);
    if(a % b == 0 || b % a == 0)
    {
        Console.WriteLine("Sao Multiplos");
    }
    else
    {
        Console.WriteLine("Nao sao Multiplos");
    }
  }
}
