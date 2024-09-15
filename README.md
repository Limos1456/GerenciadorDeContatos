*Como usar as Funcionalidades*

Depois de executar o sistema, você verá um menu com as seguintes opções:

Sistema de Gerenciamento de Contatos:
1. Adicionar Contato
2. Buscar Contato
3. Remover Contato
4. Listar Todos os Contatos
0. Sair
Escolha uma opção:

Opções

Adicionar Contato:

Insira o nome, número de telefone e email do contato que deseja adicionar.
Exemplo:

Nome: Silva
Telefone: 99999-9999
Email: uuuuu@gmail.com

Buscar Contato:

Insira o nome ou número de telefone do contato que deseja encontrar.
Exemplo:
Buscar por nome ou telefone: João Silva

Remover Contato:

Insira o nome ou número de telefone do contato que deseja remover.
Exemplo:

Remover por nome ou telefone: 99999-9999

Listar Todos os Contatos:

Exibe uma lista de todos os contatos atualmente armazenados no sistema.

Sair:

Escolha 0 para encerrar o programa.

Exemplo de Uso:
Ao executar o sistema, você verá algo assim no terminal:

Sistema de Gerenciamento de Contatos:
1. Adicionar Contato
2. Buscar Contato
3. Remover Contato
4. Listar Todos os Contatos
0. Sair
Escolha uma opção: 1

Nome: Maria
Telefone: 88888-8888
Email: maria@email.com
Contato adicionado com sucesso!

Sistema de Gerenciamento de Contatos:
1. Adicionar Contato
2. Buscar Contato
3. Remover Contato
4. Listar Todos os Contatos
0. Sair
Escolha uma opção: 4

Name: Maria, Phone: 88888-8888, Email: maria@email.com

Estrutura do Projeto
O projeto contém as seguintes classes:

Contact: Representa um contato com os atributos name, phoneNumber e email.
Node: Representa um nó da lista encadeada que contém um objeto Contact e a referência para o próximo nó.
ContactList: Gerencia a lista encadeada, permitindo adicionar, buscar, remover e listar contatos.
ContactManager: Controla a interação do usuário com o sistema via menu CLI.

Detalhes Técnicos
Linguagem de Programação: Java
Interface: Linha de Comando (CLI)
Estrutura de Dados: Lista Encadeada
Portabilidade: Compatível com qualquer sistema que suporte a JVM (Windows, Linux, macOS)
