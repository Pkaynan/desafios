#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int tamanho = 0;
    cin >> tamanho;

    int vetor[tamanho];

    int posicao = 0;
    int minimo = 0;

    for(int i = 0; i < tamanho; i++){
        cin >> vetor[i];
        
        if(minimo == 0){
            minimo = vetor[i];
        }

        if(vetor[i] < minimo){
            minimo = min(minimo, vetor[i]);
            posicao = i;
        }
    }

    cout << "Menor valor: " << minimo << endl;
    cout << "Posicao: " << posicao << endl;

    return 0;
}