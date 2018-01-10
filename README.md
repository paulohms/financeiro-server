# financeiro-server

Projeto financeiro-server que expoẽm os serviços REST para o front-end [financeiro-client](https://github.com/paulohms/financeiro-client).

## Passo a passo para execução

No Mysql com a usuário e senha root criar a data base executando o comando

**create database financeiro;**

Certificar-se que o JDK na versão 8 está instalado corretamente

**java -version**

Certificar-se que o maven está configurado em uma versão compatível com o java 8

**mvn –version**

Acessar o projeto financeiro-server e fazer o build executando o comando (Caso o usuário e senha do banco não for root conforme informado no item 1, alterar o arquivo application.properties antes de fazer o build)

**mvn clean package**

Navegar até a pasta target e executar o comando para que os serviços sejam expostos

**java –jar financeiro-server-1.0.jar**

Agora que os serviços REST estão funcionando, podemos levantar a aplicação [financeiro-client](https://github.com/paulohms/financeiro-client).