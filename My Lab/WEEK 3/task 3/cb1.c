#include <stdio.h>
int main() {
int n,i,j;
printf("enter the number of rows:");
scanf("%d",&n);
for (i = 0; i<n; i++) {
for (j = 0; j < n - i; j++) {
printf("* ");
}
for (j = 0; j < 2 * i; j++) {
printf(" ");
}
for (j = 0; j < n - i; j++) {
printf("* ");
}
printf("\n");
}
for (i = 1; i <= n; i++) {
for (j = 0; j < i; j++) {
printf("* ");
}
for (j = 0; j < 2 * (n - i); j++) {
printf(" ");
}
for (j = 0; j < i; j++) {
printf("* ");
}
printf("\n");
}
return 0;
}
