#include <iostream>
using namespace std;
int main()
{
    int a[10][10], trans[10][10], r, c, i, j;
    cin >> r >> c;
    for(i = 0; i < r; ++i)
    for(j = 0; j < c; ++j)
    {
        cin >> a[i][j];
    }
    for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
        {
            trans[j][i]=a[i][j];
        }
    for(i = 0; i < c; ++i)
        for(j = 0; j < r; ++j)
        {
            cout<<trans[i][j]<<" ";
            if(j == r - 1)
                cout << endl;
        }
   return 0;
}