#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n=5;
    for (int i = 1; i < 2 * n; i++)
    {
        int stars = i <= n ? i : 2 * n - i;
        
        for(int j = 0; j < stars; j++)
        {
            cout << "* ";
        }
        cout << endl;
    }
    
    return 0;
}