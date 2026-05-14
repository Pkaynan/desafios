#include <iostream>
#include <string>

using namespace std;

int main()
{
    int numberTries = 0;
    int tries = 1;

    cin >> numberTries;

    while (numberTries != 0)
    {
        string playerEven;
        string playerOdd;

        cin >> playerEven;
        cin >> playerOdd;

        cout << "Teste " << tries << endl;

        for (int i = 0; i < numberTries; i++)
        {
            int hand1 = 0;
            int hand2 = 0;

            cin >> hand1;
            cin >> hand2;

            if ((hand1 + hand2) % 2 == 0)
            {
                cout << playerEven << endl;
            }
            else
            {
                cout << playerOdd << endl;
            }
        }
        cout << endl;

        tries++;
        cin >> numberTries;
    }

    return 0;
}