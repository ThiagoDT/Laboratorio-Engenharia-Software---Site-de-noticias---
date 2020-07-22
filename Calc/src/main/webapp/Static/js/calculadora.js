calcular = document.querySelector("#calcular");

calcular.addEventListener("click", function resultado(event){
    event.preventDefault();
    var valor1 = $("#number1").val();
    var valor2 = $("#number2").val();
    var op = $("#op").val();

    $.post("resultado.action", {n1:valor1, n2:valor2, operador:op},
        function(resultado){
            valores = JSON.parse(resultado);
            $("#resultado").html("Resultado: "+valores.resultado);
            console.log("Registro do calculo: "+resultado);
    });
});