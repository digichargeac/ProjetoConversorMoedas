🪙 Conversor de Moedas via API — Java (Console + HttpClient + Gson)

Este projeto é um conversor de moedas desenvolvido em Java, rodando via console, que consome a API ExchangeRate-API utilizando HttpClient, HttpRequest, HttpResponse e a biblioteca Gson para conversão de JSON em objetos.

O projeto segue princípios SOLID, boas práticas RESTful e organiza o código em múltiplas camadas (controller, service, model, util).

📌 Funcionalidades

Menu interativo no terminal com 6 opções de conversão já configuradas.

Entrada de dados pelo usuário utilizando Scanner.

Consumo de API REST usando:

HttpClient

HttpRequest

HttpResponse

Parseamento JSON com Gson.

Código modular dividido em múltiplas classes e pacotes.

Taxas de câmbio obtidas em tempo real diretamente da API.

📁 Estrutura do Projeto
/src
 ├── Main.java
 ├── controller
 │     └── CurrencyController.java
 ├── model
 │     └── ConversionResponse.java
 ├── service
 │     └── CurrencyService.java
 └── util
       └── HttpClientProvider.java

🚀 Como Executar o Projeto
✔ Pré-requisitos

JDK 17+

Biblioteca Gson instalada no projeto
(Se estiver usando Maven/Gradle, basta instalar a dependência.)

Acesso à internet (para consumir a API)

✔ Passos

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git


Abra o projeto na sua IDE (IntelliJ, Eclipse, VS Code, etc).

Execute a classe:

Main.java


O menu aparecerá e você poderá escolher a conversão desejada e informar o valor.

🔧 Como Funciona o Programa

O usuário escolhe uma das seis opções:

USD → BRL

BRL → USD

EUR → GBP

GBP → EUR

EUR → USD

USD → EUR

O usuário insere o valor a ser convertido.

O programa envia uma requisição GET para:

https://v6.exchangerate-api.com/v6/c458a4a9efeb4e2708bc0813/pair/{FROM}/{TO}


A API retorna um JSON contendo:

conversion_rate

moedas base e alvo

status da requisição

O valor é calculado e exibido ao usuário.

🧩 Tecnologias Utilizadas

Java 17+

HttpClient (Java 11+)

Gson

Programação orientada a objetos

SOLID

RESTful design

Scanner (interação com o terminal)

📜 Exemplo de Execução
===========================================
      CONVERSOR DE MOEDAS (API) 
===========================================

Escolha uma conversão:
1 - USD → BRL
2 - BRL → USD
3 - EUR → GBP
4 - GBP → EUR
5 - EUR → USD
6 - USD → EUR
Digite a opção desejada: 1

Digite o valor que deseja converter: 100

===========================================
RESULTADO: 100.00 USD = 507.32 BRL
===========================================

🔒 API Key

Este projeto utiliza a chave:

c458a4a9efeb4e2708bc0813


Se quiser trocar a chave, altere a constante API_KEY na classe:

CurrencyService.java

🧱 Princípios SOLID aplicados

SRP: cada classe tem uma única responsabilidade

OCP: fácil adicionar novas moedas sem alterar código base

LSP: uso correto de abstrações

ISP: separação entre camadas

DIP: HttpClient desacoplado via HttpClientProvider

🤝 Contribuindo

Sinta-se livre para abrir issues, enviar pull requests ou sugerir melhorias!

📄 Licença

Este projeto está sob a licença MIT — use livremente.
