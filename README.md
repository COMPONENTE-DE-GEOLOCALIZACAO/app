# Geolocation Console Application

Esta é uma aplicação Java desenvolvida no Eclipse IDE, utilizando o Maven como ferramenta de gerenciamento de dependências. A aplicação é uma Interface de Usuário de Texto (TUI) que permite ao usuário selecionar várias opções para obter informações de geolocalização baseadas no IP da máquina do usuário.

## Funcionalidades

O menu da aplicação possui as seguintes opções:
1. Localização completa
2. Cidade
3. Estado
4. País
5. Coordenadas aproximadas
6. Sair

## Estrutura do Projeto

### Classes Principais

#### `LocationEnum`

Uma classe de enumerações que representa as opções do menu.

**Métodos:**
- **Construtor**: Recebe um código (int) e uma descrição (string).
- **Getters e Setters**: Para os campos do construtor.
- **obterDescricaoCompleta()**: Retorna uma string com o código e a descrição.
- **valueOfCodigo(int codigo)**: Recebe um código e verifica se o código recebido é igual a algum dos códigos existentes. Se existir, retorna a opção. Se não, lança uma `IllegalArgumentException`.

#### `LocationTUI`

Classe responsável pela interface do usuário e pela lógica de seleção e execução das opções do menu.

**Métodos:**
- **exibirMenu()**: Percorre e exibe os valores da enumeração.
- **selecionarOpcao(int numero)**: Recebe um número do usuário e faz a busca na enumeração, verificando se o número escolhido é válido.
- **executarOpcao(LocationEnum opcao)**: Chama os métodos correspondentes de acordo com a opção escolhida pelo usuário.
- **exibirLocalizacaoCompleta()**: Exibe a localização completa do usuário.
- **exibirCidade()**: Exibe a cidade do usuário.
- **exibirEstado()**: Exibe o estado do usuário.
- **exibirPais()**: Exibe o país do usuário.
- **exibirCoordenadas()**: Exibe as coordenadas aproximadas do usuário.

## Configuração e Execução

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior.
- Apache Maven.
- Eclipse IDE (ou qualquer outra IDE de sua preferência).

### Passos para Configurar

1. Clone o repositório do projeto:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
