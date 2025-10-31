#include <iostream>
#include <string>
using namespace std;

bool isSubstring(string str, string pattern) {
    for(int i=0;i<=str.length()-pattern.length();i++) {
        int j=0;
        while(j<pattern.length() && str[i+j]==pattern[j]) {
            j++;
        }
        if(j==pattern.length()) {
            return true; // Pattern found
        }
    }
    return false; // Pattern not found

}

int main() {
    string str = "hello world";
    string pattern = "world";
    if (isSubstring(str, pattern)) {
        cout << "Pattern Found!" << endl;
    } else {
        cout << "Pattern Not Found!" << endl;
    }

    string s1 ="xys";
    string s2="hello";
    cout << s1.compare(s2) << endl; // 0
    cout << s1.compare("zzz") << endl; // 0
    return 0;
}
