#include <iostream>
#include <string.h> 
int main ()
{
  std::string str;
  //std::string word("the");
char word[100]="the";
  char twoD[10][30];
	int i = 0, j = 0, k = 0;
  int len1 = 0, len2 = 0;
std::getline(std::cin,str);
	for (i = 0; str[i] != '\0'; i++)
	{
		if (str[i] == ' ')
		{
			twoD[k][j] = '\0';
			k ++;
			j = 0;
		}
		else
		{
			twoD[k][j] = str[i];
			j ++;
		}
	}
 
	twoD[k][j] = '\0';
 
	j = 0;
	for (i = 0; i < k + 1; i++)
	{
		if (strcmp(twoD[i], word) == 0)
		{
			twoD[i][j] = '\0';
		}
	}
 
	j = 0;
 
	for (i = 0; i < k + 1; i++)
	{
		if (twoD[i][j] == '\0')
			continue;
		else
			printf ("%s ", twoD[i]);
	}
 
	printf ("\n");
 
	return 0;
}