const nome = document.getElementById("nome");
const email = document.getElementById("email");
const senha = document.getElementById("senha");
const form = document.getElementById("formLogin");

const icon = document.getElementById("meuIcon");

function viewSenha(){
    console.log("Chegou a aqui")

    if(icon.classList.contains("bx-eye-slash")){
        icon.classList.remove("bx-eye-slash")
        icon.classList.add("bx-eye-alt")
    }else{
        icon.classList.remove("bx-eye-alt")
        icon.classList.add("bx-eye-slash")
    }

    if(senha.type == "password"){
        senha.type = "text"
    }else{
        senha.type = "password"
    }
}


// Esse e o Methodo para a criação de um Usuário no banco de dados
function cadastrar(){
    fetch("http://localhost:8080/user", {
        headers:{
            'Accept':'application/json',
            'Content-Type': 'application/json'
        },
        method: "GET"
    })
    .then(function(res) { console.log(res)})
    .catch(function (res) {console.log(res)})
}

form.addEventListener("submit", function(event){
    event.preventDefault();

    cadastrar()
})
