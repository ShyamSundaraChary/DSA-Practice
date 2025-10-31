#include <bits/stdc++.h>
using namespace std;

string getFruitsList(vector<string>& fruitsList)
{
    stringstream ss;
    for (auto& fruit : fruitsList) 
    {
        reverse(fruit.begin(), fruit.end());
        ss << fruit << ",";
    }
    return ss.str();
}

int main()
{
    string fruits = "Apple,Banana,Cherry,Date,Elderberry";
    stringstream ss(fruits);
    string fruit;
    vector<string> fruitsList;

    while (getline(ss, fruit, ','))
    {
       
        fruitsList.push_back(fruit);
    }

    cout << "Fruits List: " << endl
         << getFruitsList(fruitsList) << endl;

    return 0;
}
