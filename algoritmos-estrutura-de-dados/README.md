# Exercícios

## 1. Implemente uma pilha
Com base no que foi aprendido no módulo 1, implemente uma classe que represente uma estrutura de dados de Pilha. 

Sua implementação aceitará somente inteiros e deverá conter os seguintes métodos:

- push() → Coloca um inteiro no topo da pilha.
- pop() → Remove o valor do topo da pilha e o retorna ao chamador.
- top() → Espia o inteiro que está no topo e o retorna sem mexer na pilha.
- isEmpty() → Retorna true ou false dependendo da pilha estar vazia ou não.
- size() → Retorna um valor inteiro com o número de elementos da pilha.

> Note: Não use a Pilha da linguagem Java, faça a sua!

## 2. Implemente uma fila FIFO

Com base no que foi aprendido no módulo 1, implemente uma classe que represente uma estrutura de 
dados de Fila (FIFO – first in, first out). 

Sua implementação aceitará somente inteiros e deverá conter os seguintes métodos:

- enqueue() → Adiciona um inteiro à fila.
- dequeue() → Remove um inteiro da fila.
- rear() → Retorna o inteiro que está no fim da fila.
- front() → Retorna o inteiro que está na frente da fila.
- size() → Retorna o tamanho da fila.
- isEmpty() → Retorna true ou false dependendo da fila estar vazia ou não.

> Note: Não use a Fila da linguagem Java, faça a sua!

## 3. Implemente uma lista encadeada

Com base no que foi aprendido no módulo 1, implemente uma classe que represente uma estrutura de dados de Lista Encadeada. 
Sua implementação aceitará somente inteiros e deverá conter os seguintes métodos:

- void push(< Node > node) → Adiciona o nó ao fim da lista.
- < Node > pop() → Remove o nó no fim da lista e retorna o mesmo.
- void insert(int index, <Node> node) → Adiciona um nó na posição da lista indicada via parâmetro.
- void remove(int index) → Remove um nó na posição da lista indicada via parâmetro.
- < Node > elementAt(int index) → Retorna o elemento que está no índice da lista indicado via parâmetro.
- int size() → Retorna o tamanho da lista.
- void printList() → Retorna uma representação em texto da lista.

> Note: Não use a Lista Encadeada da linguagem Java, faça a sua!

## 4. Complexidades assintóticas de tempo e espaço
Usando como base suas implementações dos exercícios de 1 a 3, calcule a complexidade assintótica de tempo e de espaço das estruturas de dados que você criou. 

A complexidade de tempo deverá ser calculada para os métodos definidos abaixo:

- Pilha: métodos push e pop.

- Fila: métodos enqueue, dequeue, rear e front.

- Lista encadeada: métodos push, pop, insert, remove e elementAt.

Justifique seus resultados, sua implementação pode diferir da definição padrão das estruturas de dados apresentadas no curso.

> É normal que os cálculos variem de acordo com a implementação!

## Desafio
Com base no que foi aprendido no módulo 1, implemente uma classe que represente uma estrutura de dados de Mapa de Hash. 

Sua implementação aceitará somente inteiros (chave e valor), terá tamanho fixo de 10 elementos e deverá conter os seguintes métodos:

- put(int key, int value) → Adiciona o par chave/valor ao mapa.
- delete(int key) → Remove o valor do topo da pilha e o retorna ao chamador.
- get(int key) → Retorna o valor associado à chave passada via parâmetro.
- clear() → Remove todos os elementos do mapa.

Que função hash você vai usar? Justifique sua escolha.

> Não use o Mapa de Hash da linguagem Java, faça o seu!