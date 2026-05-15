#include <stdio.h>
#include <iostream>

using namespace std;

int main()
{
    int botasQuantidade;

    while (cin >> botasQuantidade)
    {
        int botasEsquerda[61]{};
        int botasDireita[61]{};

        for (int i = 0; i < botasQuantidade; i++)
        {
            int indiceBota = 0;
            cin >> indiceBota;

            char lado;
            cin >> lado;
            lado = toupper(lado);

            if (lado == 'E')
            {
                botasEsquerda[indiceBota] += 1;
            }
            else
            {
                botasDireita[indiceBota] += 1;
            }
        }

        int pares = 0;

        for (int i = 30; i <= 60; i++)
        {
            pares += min(botasDireita[i], botasEsquerda[i]);
        }

        cout << pares << endl;
    }

    return 0;
}