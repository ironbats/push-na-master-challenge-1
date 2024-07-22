# Config Server Talke2Me

Este repositório contém o Config Server utilizado pelas aplicações que
compõem o Talk2Me, uma plataforma de comunicação inovadora.
O Config Server é uma parte fundamental da arquitetura do TalkToMe,
fornecendo uma maneira centralizada de gerenciar e distribuir as
configurações necessárias para as diferentes partes da aplicação.

## Funcionalidades

Armazenamento Centralizado de Configurações: Todas as configurações
necessárias para as aplicações do TalkToMe são armazenadas e gerenciadas
centralmente neste servidor.

### Versionamento de Configurações:

Utilizando este servidor, é possível versionar e rastrear mudanças nas
configurações ao longo do tempo, garantindo uma gestão eficaz das alterações.

### Segurança:

As configurações sensíveis são protegidas por criptografia e medidas de
segurança adequadas para garantir a integridade e a confidencialidade dos
dados.

### Distribuição Dinâmica de Configurações:

As configurações são distribuídas de forma dinâmica para as aplicações,
permitindo atualizações em tempo real sem a necessidade de reinicialização
das aplicações.

## Como Contribuir

Este repositório é parte integrante do ecossistema Talk2Me e é mantido
pela equipe de desenvolvimento.

## Como Usar

Para utilizar este Config Server em suas aplicações do Talk2Me,
siga as instruções de configuração fornecidas na documentação.
Certifique-se de configurar corretamente as permissões e credenciais
para garantir a segurança adequada das configurações.

Dentro do repositório do [gitlab](https://gitlab.com/JFischer87/spring-config-repository),
foram criadas branchs por ambientes de desenvolvimento, dentro do pacote config-server:

- dev: deve ser usada para colocarmos as configurações de desenvolvimento.
- hml: deve ser usada para colocarmos as configurações de homologação ou staging.
- prd: deve ser usada para colocarmos as configurações de produção
- main: será uma cópia atualizada das configurações de produção.

Para utilizar em um projeto será necessário criar o arquivo. yml a partir
da branch que irá subir as configurações e posteriormente submeter o PR para
a branch de origem.

## Autor

Este repositório é mantido e atualizado pela equipe de desenvolvimento do
Talk2Me.

## Licença

Este projeto está licenciado sob a Licença MIT, o que significa que você
pode utilizá-lo livremente em seus próprios projetos, modificar e
distribuir de acordo com os termos da licença.
