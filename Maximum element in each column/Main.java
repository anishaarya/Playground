#include<iostream>
using namespace std;
int largestInEachCol(int rows, int cols) 
{
  int mat[10][10],i,j;
  
  for(i=0;i<rows;i++)
    for(j=0;j<cols;j++)
      std::cin>>mat[i][j];

   for ( i = 0; i < cols; i++) {
      int max_col_element = mat[0][i];
   for ( j = 1; j < rows; j++) {
      if (mat[j][i] > max_col_element)
         max_col_element = mat[j][i];
   }
   cout << max_col_element << endl;
   }
}
int main()
{
   int row,col;
  std::cin>>row>>col;
      largestInEachCol(row, col);
}