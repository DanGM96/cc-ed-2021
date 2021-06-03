# Lista de Exercício - Fila com Prioridade

Utilizando as classes **_FilaComPrioridade_** e **_PriorityQueue_** desenvolvida em sala de aula, desenvolva o programa descrito abaixo:

1. O programa tem quer simular o controle de atendimento de um pronto socorro hospitalar, utilizando a ideia de **_fila de prioridade_**;

2. Programa deve implementar uma classe **_paciente_**;

    1. O paciente deve ter nome, data de nascimento, sintoma e prioridade;

3. Desenvolva o método **_boolean enfileiraComPrioridade(Paciente paciente)_**;

    1. O método adiciona o paciente de acordo com a regra de prioridade definida na triagem pelo sistema de coloração. A prioridade por coloração está definida abaixo:

        1. ordem de prioridade dos pacientes: verde < amarelo < vermelho.

4. Faça um programa que apresente o seguinte menu:

    1. Cadastro de Paciente (onde deve criar o objeto paciente e adiciona-lo na nossa fila utilizando o método criado no passo 3;

    2. Chamar paciente (nessa opção deve desenfileirar (remover da fila) o primeiro paciente, ou seja o paciente de maior prioridade da fila;

    3. Imprimir a Fila (nessa opção deve imprimir a fila, que deve estar respeitando a ordem de prioridade descrito no passo 3.
