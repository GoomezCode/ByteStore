/*Captura todos os dados do form*/
const Iemail = document.getElementById("email");
const Isenha = document.getElementById("password");
const form = document.getElementById("formLogin");


/*Adiciona a Função para limpar os campos*/
function clear(){
    Iemail.value = "";
    Isenha.value = "";
}

// Esse e o Methodo para a criação de um Usuário no banco de dados
function cadastrar(){
    fetch("http://localhost:8080/user", {
        headers:{
            'Accept':'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            "nome": "Teste",
            "nascimento": "2020-10-12",
            "email": Iemail.value,
            "senha": Isenha.value,
            "cep": "789432743"
        })
    })
    .then(function(res) { console.log(res)})
    .catch(function (res) {console.log(res)})
}



/*Essa e a ação dps que eu faço uma ação com o Button do form*/
/*Tudo que for colocado dentro sera acionado dps da ação*/
form.addEventListener('submit', function(event){
    event.preventDefault();
    
    

    if(Iemail.value == " " && Isenha == " "){
        console.log("Erro 404")
    }else{
        cadastrar();
        clear();
    }
})



/*Crie um button no html com o " onclick="visualSenha()" "
    ai ja vai esta funcionando */
function visualSenha(){
    console.log("chegou aqui")

    if(Isenha.type == "password"){
        Isenha.type = "text";
    }else{
        Isenha.type = "password";
    }
}
    