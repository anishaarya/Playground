#include<iostream>
int main()
{
  int arr[10], n, i, max, min;
    std::cin >> n;
    for (i = 0; i < n; i++)
        std::cin >> arr[i];
    max = arr[0];
    for (i = 0; i < n; i++)
    {
        if (max < arr[i])
            max = arr[i];
    }
    std::cout<< max;
    return 0;
}