#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout << "Enter the size of the array: \n";
    cin >> n;
    vector<int> arr(n);
    cout << "Enter the elements of the array: \n";
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    int q;
    cout << "Enter the number of queries: ";
    cin >> q;

    // difference array 
    vector<int> diff(n + 1, 0);

    while (q--)
    {
        cout << "Enter l, r and x: ";
        int l, r, x;
        cin >> l >> r >> x;

        // Apply in O(1)
        diff[l] += x;
        if (r + 1 < n)
            diff[r + 1] -= x;
    }

    // Convert diff[] to final updates
    int curr = 0;
    for (int i = 0; i < n; i++)
    {
        curr += diff[i];
        arr[i] += curr;
    }

    cout << "Final array: \n";
    for (auto i : arr)
        cout << i << " ";

    return 0;
}
