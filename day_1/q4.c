#include <stdio.h>

int main() {
    int n;
    int count=0;
        
    printf("enter the number whose digits we want to count: ");
    scanf("%d", &n);
    
    while(n>0)
    {
        
        n/=10;
        count++;
    }
    printf("the number of digits is: %d\n", count);
 return 0;
}