<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=200&section=header&text=Cadastro%20de%20Alunos&fontSize=60&fontColor=fff&animation=twinkling&fontAlignY=35&desc=Sistema%20Java%20e%20MySQL%20com%20POO%20%7C%20kevinhsdev&descAlignY=55&descSize=18"/>

</div>
<p align="center">
<img src="https://skillicons.dev/icons?i=java,idea,mysql" />

![Status](https://img.shields.io/badge/Status-Concluído-639922?style=for-the-badge)



---

## 📖 Sobre o projeto

Sistema de gerenciamento de alunos desenvolvido em Java com integração ao MySQL,
aplicando conceitos de Programação Orientada a Objetos e padrão DAO (Data Access Object).
Projeto criado para praticar a conexão entre back-end Java e banco de dados relacional.

---

## ⚙️ Funcionalidades

| Função | Descrição |
|--------|-----------|
| Cadastrar | Adiciona novo aluno com nome, idade e turma |
| Listar | Exibe todos os alunos ordenados por nome |
| Buscar | Localiza alunos pelo nome (busca parcial) |
| Editar | Atualiza dados de um aluno pelo ID |
| Remover | Exclui aluno com confirmação de segurança |

---

## 🖥️ Demonstração

```
===== SISTEMA DE CADASTRO DE ALUNOS =====
1. Cadastrar aluno
2. Listar todos
3. Buscar por nome
4. Editar aluno
5. Remover aluno
0. Sair
=========================================
Escolha: 1

--- CADASTRAR ALUNO ---
Nome: Kevin
Idade: 18
Turma: Engenharia de Software - 3° período
✔ Aluno cadastrado com sucesso!
```

---

## 📂 Estrutura do projeto

```
cadastro-de-alunos/
├── cadastro-aluno/
│   ├── Aluno.java        — modelo (atributos + getters/setters)
│   ├── AlunoDAO.java     — lógica com o banco (padrão DAO)
│   └── Main.java         — menu e interação com o usuário
├── escolaDataBase.sql    — script para criar o banco
└── README.md
```

---

## ▶️ Como executar

```bash
# 1. Clone o repositório
git clone https://github.com/kevinhsdev/cadastro-de-alunos.git

# 2. Crie o banco de dados
# Execute o arquivo escolaDataBase.sql no MySQL Workbench

# 3. Configure a senha em AlunoDAO.java
private static final String PASS = "sua_senha";

# 4. Adicione o conector MySQL no IntelliJ
# File → Project Structure → Libraries → From Maven
# mysql:mysql-connector-java:8.0.33

# 5. Execute Main.java
```

---

## 🚀 Melhorias futuras

- 🖥️ Interface gráfica com Java Swing
- 🌐 API REST com Spring Boot
- 🔐 Sistema de autenticação

---

## 👨‍💻 Autor



Feito por **Kevin Henrique** 🚀

[![GitHub](https://img.shields.io/badge/kevinhsdev-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/kevinhsdev)



---

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=120&section=footer&text=Let's%20Code!&fontSize=40&fontColor=fff&animation=twinkling"/>
