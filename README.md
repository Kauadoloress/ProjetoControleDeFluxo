# Projeto de Controle de Fluxo

Este projeto faz parte do curso da **Digital Innovation One (DIO)** em parceria com o **Bradesco**, focado em Java. A atividade proposta teve como objetivo colocar em prática conceitos essenciais da linguagem Java, como **métodos**, **exceções** e **estruturas de repetição**.

---

## Descrição do Projeto

O projeto consiste em um sistema simples que recebe dois números inteiros como parâmetros e realiza a contagem do intervalo entre eles. Durante o processo, são aplicados conceitos como:

- **Métodos:** Para encapsular a lógica de contagem e validação.
- **Exceções:** Para tratar casos em que o primeiro número é maior que o segundo.
- **Estruturas de repetição:** Para iterar e imprimir os números no intervalo.

---

## Funcionalidades

1. **Validação de Parâmetros:**
   - O sistema verifica se o primeiro número é maior que o segundo. Caso seja, uma exceção personalizada (`ParametrosInvalidosException`) é lançada.

2. **Contagem do Intervalo:**
   - Se os parâmetros forem válidos, o sistema calcula a diferença entre os números e imprime cada número do intervalo.

3. **Tratamento de Exceções:**
   - A exceção personalizada `ParametrosInvalidosException` é usada para garantir que o segundo número seja maior que o primeiro.

---

## Como Executar o Projeto

### Pré-requisitos
- Java Development Kit (JDK) instalado.
- Ambiente de desenvolvimento (IDE) como Eclipse, IntelliJ ou VS Code.

### Passos para Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/Kauadoloress/ProjetoControleDeFluxo.git
