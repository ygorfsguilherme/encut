
<div align="center">
   <img src="https://user-images.githubusercontent.com/100237670/210073579-42b5a77e-8129-4396-b380-4203c0517dba.png" />
</div>

<p align="center">
   <img src="http://img.shields.io/static/v1?label=React&message=FRAMEWORK&color=blue&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=Java&message=17.0.5&color=red&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=Srping%20Boot&message=FRAMEWORK&color=green&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=license&message=MIT&color=yellow&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=greeb&style=for-the-badge" #vitrinedev/>
</p>

## <img height="30px" src="https://img.icons8.com/plasticine/100/null/todo-list.png"/> Tópicos
- [Descrição](#-descrição)
- [Funcionalidades](#-funcionalidades)
- [Layout](#-layout-ou-deploy-da-aplicação)
- [Ferramentas Utilizadas](#-ferramentas-utilizadas)
- [Pré Requisitos](#-pré-requisitos)
- [Executar / Testar](#-executar--testar)
- [Licença](#-licença)

## <img src="https://cdn-icons-png.flaticon.com/512/3534/3534033.png" style="widht:30px; height:30px;" /> Descrição

Encut é um encutador de url, para facilitar a memorização, digitação e entre outros fatores que uma url menor pode proporcionar. Como envia em redes sociais, e-mail, curriculo e documentos ocupadando menos espaço.


<div align="center">
  <img src="https://img.icons8.com/color/48/null/error--v1.png"/>
      <h2>AVISO: voltado para aprendizado</h2>
  <img src="https://img.icons8.com/color/48/null/error--v1.png"/>
</div>

## <img height="35px" src="https://img.icons8.com/color/96/null/puzzle-matching.png"/> Funcionalidades
- Gera uma nova url curta
- Url personalizada

## <img height="30px" src="https://img.icons8.com/color/96/null/template.png"/> Layout ou Deploy da Aplicação
- [Figma - Representação das funcionalidades e designer](https://www.figma.com/file/d8qu274P7vIjO6yu163LQy/Encut?node-id=0%3A1&t=2DLsvKm4Y0uahWfE-0)

## <img src="https://cdn-icons-png.flaticon.com/512/1835/1835211.png" style="widht:30px; height:30px;" /> Ferramentas Utilizadas

- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/trello/trello-plain.svg" /> Trello
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/figma/figma-original.svg" /> Figma
- <img height="20px"  src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/react/react-original.svg" /> React
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/typescript/typescript-plain.svg" /> TypeScript
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" /> Java
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" /> Spring boot
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/sass/sass-original.svg" /> Sass
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" /> HTML 5

Outras tecnologias como, banco de dados H2.

## <img height="35px" src="https://img.icons8.com/fluency/96/null/requirement.png"/> Pré-requisitos
- [Nodejs 18.xx](https://nodejs.org)
- [Java 17.xx](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.htmlnode)

## <img src="https://cdn-icons-png.flaticon.com/512/3068/3068553.png" style="widht:30px; height:30px;" /> Executar / Testar

Ao baixa / clona o projeto, no diretorio raiz havera dois diretorios principais, o client que ira conter o front end e o server nele estara o back end.

> No terminal, clone o projeto:
```
git clone https://github.com/ygorfsguilherme/encut.git
```
> Entre na raiz do projeto:
```
cd encut/
```

<img height="20px" src="https://img.icons8.com/color/48/null/error--v1.png"/> Aviso: *Para testa o projeto por completo, e de valia iniciar o back end e posteriormente o front end.*

### - Back-end
A dependencia necessario para o funcionamento correta do back end e o java 17.0.x
apartir do diretorio raiz execute os seguintes comandos:

> Entre no diretorio server:

```
cd server
```
> Executar o back end no modo desenvolvidor/teste:

```
./gradlew bootRun --args='--spring.profiles.active=dev'
```

### - Front end
Primeiro precisa certificar se o nodejs esta instalado em sua maquina e que esteja na versão v18.xx, para roda o projeto precisa do npm.
no diretorio raiz execute os seguintes comandos:

certifique que esta no diretorio raiz do projeto antes de realiza os proximos passos

> Entra no diretorio client:

```
cd client
```

> Necessario instalar as dependencias que o projeto necessita:

```
npm install
```

> Executando o projeto em modo desenvolvedor/teste:

```
npm run dev
```


## <img height="30px" src="https://img.icons8.com/external-filled-outline-icons-maxicons/85/null/external-balance-law-and-justice-filled-outline-filled-outline-icons-maxicons.png"/> Licença
Encut é licenciado pelo [MIT License](https://github.com/ygorfsguilherme/encut/blob/main/LICENSE).
