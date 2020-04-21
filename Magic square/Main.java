#include <iostream>
int main() {
 int A[50][50];
 int i, j, M, N;
 int size;
 int rowsum, columnsum, diagonalsum;
 int magic = 0;
 std::cin>>N;
  M=N;
 if(M==N) 
 {
 for(i=0; i<N; i++)
 {
 for(j=0; j<N; j++)
 {
 std::cin>>A[i][j];
 }
 }
 
 // calculate diagonal sum 
 diagonalsum = 0;
 for(i=0; i<N; i++) {
 for(j=0; j<N; j++) {
 if(i==j) {
 diagonalsum = diagonalsum + A[i][j];
 }
 }
 }
 
 // calculate row sum
 for(i=0; i<N; i++) {
 rowsum = 0;
 for(j=0; j<N; j++) {
 rowsum = rowsum + A[i][j];
 }
 if(rowsum != diagonalsum) {
 std::cout<<"No\n";
 return 0;
 }
 }
 
 // calculate column sum
 for(i=0; i<N; i++) {
 columnsum = 0;
 for(j=0; j<N; j++) {
 columnsum = columnsum + A[j][i];
 }
 if(columnsum != diagonalsum) {
 std::cout<<"No\n";
 return 0;
 }
 }
std::cout<<"Yes\n";
 } else {
 std::cout<<"enter the square matrix order(m=n) \n\n";
 }
}