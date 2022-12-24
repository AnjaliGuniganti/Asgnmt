class Palindrome
{
static int reverseDigits(int num)
{
int rev_num = 0;
while (num > 0)
{
rev_num = rev_num * 10 + num % 10;
num = num / 10;
}
return rev_num;
}
    static int isPalindrome(int n)
    {
     int rev_n = reverseDigits(n);
     if (rev_n == n)
     return 1;
     else
     return 0;
    }

   public static void  main(String []args)
{
int n = 2552;
System.out.println("Is" + n + "a Palindrome number? -> " +
(isPalindrome(n) == 1 ? "true" : "false"));

n = 2002;

System.out.println("Is" + n + "a Palindrome number? -> " +
(isPalindrome(n) == 1 ? "true" : "false"));
}
}