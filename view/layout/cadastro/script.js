const nome = document.getElementById("nome");
const nascimento = document.getElementById("nascimento");
const email = document.getElementById("email");
const cep = document.getElementById("cep");
const senha = document.getElementById("senha");
const form = document.getElementById("formCadastro");

// Essa função troca os Icons quando a senha estiver visivel ou escondida
function viewSenha(){
    const icon = document.getElementById("meuIcon")

    if(icon.classList.contains("bx-eye-slash")){
        icon.classList.remove("bx-eye-slash");
        icon.classList.add("bx-eye-alt");
    }else{
        icon.classList.remove("bx-eye-alt");
        icon.classList.add("bx-eye-slash");
    }

    if(senha.type == "password"){
        senha.type = "text"
    }else{
        senha.type = "password"
    }
}

function clear(){
    nome.value = "";
    nascimento.value = "";
    email.value = "";
    cep.value = "";
    senha.value = "";
}

// Está função adiciona o usuario no banco de dados
function cadastrar(){
    fetch("http://localhost:8080/user", {
        headers:{
            'Accept':'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            "nome": nome.value,
            "nascimento": nascimento.value,
            "email": email.value,
            "senha": senha.value,
            "cep": cep.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res) {console.log(res)})
}

form.addEventListener("submit", function(event){
    event.preventDefault();

    cadastrar()
    clear();
})

