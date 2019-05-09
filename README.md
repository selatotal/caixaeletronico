# Problema

Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico. Os requisitos básicos são os seguintes:
* Entregar o menor número de notas;
* É possível sacar o valor solicitado com as notas disponíveis;
* Saldo do cliente infinito;
* Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do problema);
* Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00

Exemplos:

* Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
* Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.

# Descrição de como o problema foi resolvido

* Resposta desenvolvida em Java.
* Utilizado um array com os tipos de notas disponíveis
* Adicionada verificação para ver se o valor é possível de ser obtido (múltiplo de 10, pela definição do problema)
* Realizada a separação das notas e impresso o resultado

# Para executar
```
./gradlew run
```

# Para executar os testes
```
./gradlew test
```
