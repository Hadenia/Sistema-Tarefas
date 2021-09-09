# Sistema-Tarefas
Sistema desenvolvido para gerenciamento de tarefas.

## Proposta ## 
Esse projeto tem como objetivo a criação de um CRUD utilizando Java web para gerenciamento de tarefas.

## Objetivos especificos ##
- [x] Criar uma a plicação Java Web utilizando JavaServer Faces (JSF)
- [ ] Utilizar persistência em um banco de dados PostgreSQL.
- [x] Utilizar JPA
- [ ] Utilizar testes de unidades
- [ ] Publicar projeto no heroku ou outro ambiente cloud.
- [ ] outros diferenciais que julgar conveniente.

### Tecnologias ### 
Para a criação do projeto foi utilizado as seguintes tecnologias:
- Apache NetBeans IDE 12.4
- Tomcat-9.0.52
- PostgreSQL 13
- JDK 11

### Execução ### 
- Para a execução recomenda-se a utilização das tecnologias citadas acima.
- Criar um projeto java web no Netbeans
- Abrir local do projeto e substituir as pastas 'scr' e 'web'
- Executar aplicação e visualizar o mesmo no navegador atráves do endereço localhost:8080/Projeto_Tarefas

### Funcionalidades implementadas ###
- Criação da entity Tarefa e adicionados as anotações JPA.
- Criação da Beans Tarefa, com funcionalidades de adicionar e listar tarefas.
- Criação da tela principal utilizando JSF do qual contem a Adição de tarefa, Visualização de lista de tarefas e Busca por tarefa. Funcionando apenas os dois primeiros.
- Dados do cadastro de tarefas gravados em memória.
- O banco de dados foi criado, mas não houve comunicação com o projeto.

### Dificuldades ### 
Não foi possivel a conclusão de todos os objetivos, pois ao longo da criação do projeto surgiram várias dificuldades dentre elas:
- Não foi possivel a instalação do PrimeFaces (biblioteca de componentes de interface). *Ao tentar utilizar a aplicação não rodava*
- Não consegui utilizar o Hibernate o que impossibilitou a comunicação com o banco de dados.

Imagem da tela principal:

![Alt text](https://github.com/Hadenia/Sistema-Tarefas/blob/main/SistemaImagem.png "/imagem do Sistema Web")
