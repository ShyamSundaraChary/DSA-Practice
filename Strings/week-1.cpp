#include <iostream>
#include <string>
using namespace std;
void recursion(string& str, int left, int right) {
    if (left >= right) return;
    swap(str[left], str[right]);
    recursion(str, left + 1, right - 1);
}

void reverseString(string& str) {
    // int left = 0, right = str.length() - 1;
    // while (left < right) {
    //     swap(str[left], str[right]);
    //     left++;
    //     right--;
    // }
    recursion(str, 0, str.length() - 1);
}

int main() {
    string str = "Hello";
    reverseString(str);
    cout << "Reversed String: " << str << endl;
    return 0;
}
