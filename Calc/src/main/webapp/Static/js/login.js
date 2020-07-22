btn = document.querySelector("#logar");

btn.addEventListener("click", function(event){
    event.preventDefault();
    s = $("#senha").val();
    e = $("#email").val();

    if(s.trim()=="")
        alert("Campo vazio");
    else{
        $.post("verificarLogin.action", {email:e, senha:s},
        function(resultado){
            if(resultado==="Usuario Invalido")
                $("#resposta").html(resultado);
            else{
                location.replace("http://localhost:8080/CalcWEB"+resultado);
            }
        });
    }
});

