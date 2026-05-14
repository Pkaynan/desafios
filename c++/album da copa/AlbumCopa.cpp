#include <iostream>

using namespace std;

int main()
{
    int totalAlbum = 0;
    cin >> totalAlbum;

    int quantidadeCartas = 0;
    cin >> quantidadeCartas;

    int cartasCompradas[totalAlbum + 1]{};

    for (int i = 0; i < quantidadeCartas; i++)
    {
        int carta = 0;
        cin >> carta;

        cartasCompradas[carta] = 1;
    }

    int count = 0;

    for (int i = 1; i < totalAlbum + 1; i++)
    {
        if (cartasCompradas[i] == 0)
        {
            count++;
        }
    }

    cout << count << endl;

    return 0;
}