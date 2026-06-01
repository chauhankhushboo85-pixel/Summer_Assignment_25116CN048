#include <stdio.h>

int main() {
      
  int n;
   int sum = 0;
   printf("Enter the number of natural numbers: ");
   scanf("%d", &n);
   for(int i = 1; i <= n; i++) {
       sum =sum+ i;
   }
   printf("the sum of natural no is:%d\n",sum);
   return 0;
}
   