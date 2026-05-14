#include <iostream>

using namespace std;

int main()
{

    int quantityN = 0;
    int intervalM = 0;

    int count = 1;

    cin >> quantityN;
    cin >> intervalM;

    while (quantityN != 0 && intervalM != 0)
    {
        int maxSum = 0;
        int minSum = 0;
        int temperature[quantityN];

        for (int i = 0; i < quantityN; i++)
        {
            int num = 0;
            cin >> num;
            temperature[i] = num;
        }

        cout << "Teste " << count << endl;

        for (int i = 0; i <= quantityN - intervalM; i++)
        {
            int actualSum = 0;

            for (int j = i; j < i + intervalM; j++)
            {
                actualSum += temperature[j];
            }

            if (maxSum == 0 && minSum == 0)
            {
                maxSum = actualSum;
                minSum = actualSum;
            }

            if (actualSum > maxSum)
            {
                maxSum = actualSum;
            }

            if (actualSum < minSum)
            {
                minSum = actualSum;
            }
        }

        int maxMiddle = maxSum / intervalM;
        int minMiddle = minSum / intervalM;

        cout << minMiddle << " " << maxMiddle << endl << endl;

        cin >> quantityN;
        cin >> intervalM;

        count++;
    }

    return 0;
}