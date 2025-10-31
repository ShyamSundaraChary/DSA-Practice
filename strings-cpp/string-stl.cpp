#include<bits/stdc++.h>
using namespace std;
// string reverseWords(string s) {
//     //normal 
//     vector<string>words;
//     string word="";
//     for(char ch:s){
//         if(ch == ' '){
//             words.push_back(word);
//             word = "";
//         }
//         word += ch;
//     }
//     if(word != ""){
//         words.push_back(word);
//     }
//     //reverse the words
//     string result="";
//     reverse(words.begin(),words.end());
//     for(auto word:words){
//         result += word+" ";
//     }
//     result.pop_back();
//     return result;
// }
string reverseWords(string s) {
    stringstream ss(s);
    string word, result = "";
    vector<string> words;
    while (ss >> word)
        words.push_back(word);

    reverse(words.begin(), words.end());
    for (string& w : words)
        result += w + " ";
    result.pop_back(); // remove trailing space
    return result;
}

int main() {
    string s = "apple banana orange";
    cout<<reverseWords(s)<<endl; // orange banana apple
    return 0;
}