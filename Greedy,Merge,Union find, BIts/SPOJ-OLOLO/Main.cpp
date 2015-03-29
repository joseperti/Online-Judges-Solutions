//============================================================================
// Name        : Problema_1_C.cpp
// Author      :
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n;
	//cout << "Inserta num: ";
	scanf("%d",&n);
	int lista[n];
	//cout << n;
	//cout << "\n";
	int i;
	int j = 0;
	for (i=0; i < n; i++){
		scanf("%d",&j);
		lista[i] = j;
	}
	int elements = sizeof(lista) / sizeof(lista[0]);
	std::sort(lista, lista + elements);
	int inf = 0;
	while (lista[inf]==lista[inf+1]){
		inf = inf + 2;
	}
	printf("%d",lista[inf]);

}
