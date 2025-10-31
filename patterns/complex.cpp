#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;
    for (int i = 0; i < 2 * n - 1; i++) {
        for (int j = 0; j < 2 * n - 1; j++){
            int top = i;
            int left = j;
            int right = (2 * n - 1) - j;
            int bottom = (2 * n - 1) - i;
            int min1 = min(top, min(left, min(right, bottom)));
            cout << n - min1 << " ";
            // cout << min1 << " ";
        }
        cout << endl;
    }
    cout << endl;
    

    return 0;
}
