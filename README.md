# Sistema de Cadastro de Estudantes

API REST desenvolvida em Spring Boot para gerenciamento de estudantes e cursos.

## 👨‍💻 Desenvolvedor
Eduardo Lemos  


---

## 🚀 Como Executar o Projeto

1. Clonar o repositório
2. Abrir o projeto na IDE (IntelliJ ou VS Code)
3. Executar a classe:
   SistemaEstudantesApplication.java
4. A aplicação iniciará em:
   http://localhost:8080

---

## 📌 Endpoints Disponíveis

### 🔹 Sistema

GET → /api/sistema/info  
Retorna informações do sistema (nome, versão, data/hora e status)

---

### 🔹 Estudantes

GET → /api/estudantes  
Lista todos os estudantes cadastrados

POST → /api/estudantes  
Cadastra um novo estudante

GET → /api/estudantes/{matricula}  
Busca estudante pela matrícula

GET → /api/estudantes/info/{matricula}  
Retorna informações formatadas do estudante

GET → /api/estudantes/curso/{curso}  
Lista estudantes por curso

---

### 🔹 Cursos

GET → /api/cursos  
Lista os 5 cursos disponíveis

GET → /api/cursos/{id}  
Busca curso pelo ID

---

## 🧪 Exemplos para Teste

http://localhost:8080/api/sistema/info

http://localhost:8080/api/estudantes

http://localhost:8080/api/estudantes/123

http://localhost:8080/api/estudantes/curso/ADS

http://localhost:8080/api/cursos

http://localhost:8080/api/cursos/1