

var nombre = document.getElementById("nombre");
var apellido = document.getElementById("apellido");
const cantidad = document.getElementById("cantidad");
const btnCalcular = document.getElementById("tonbo");
const presultado = document.getElementById("resultado");
const categoria = document.getElementById("categoria");
const estudiante = document.getElementById("afaplus");
const trainee = document.getElementById("socioclub");
const junior = document.getElementById("invitado");
const precio = 2000;
const btnReserva = document.getElementById("rese");
const est = 0.2;
const tra = 0.5;
const jun = 0.85;


btnCalcular.addEventListener("click", calcular);
btnReserva.addEventListener("click", reserva);


function calcular(){
    const operacion = categoria.value
    const cant = parseFloat(cantidad.value)
    const cantl = parseFloat(cantidad.value.length)
    const nom = parseFloat(nombre.value.length)
    const ape = parseFloat(apellido.value.length)

if(cantl == 0 || cant == 0 || nom == 0 || ape == 0){
    presultado.innerText = "Ingrese todos los datos"
} else{
    if (operacion == "estudiante" || operacion == "trainee" || operacion == "junior"){
        let resultado;
        switch (operacion){
        case "estudiante":
            resultado = precio*cant*est
            break;
        case "trainee":
        resultado = precio*cant*tra
        break;
        case "junior":
        resultado = precio*cant*jun
        break;
        
        }
        presultado.innerText = "Total a pagar:        $" + resultado 
    }else{
        presultado.innerText = "Cálculo imposible"
    }
}
        
    } 

    function reserva () {
        const cantl = parseFloat(cantidad.value.length)
        const nom = parseFloat(nombre.value.length)
        const ape = parseFloat(apellido.value.length)
        
        if(nom == "0" || ape == 0 || cantl == 0){
            alert("Ingrese todos los datos solicitados")
        }else{
    alert("Entradas Agotadas. Gracias por confiar en Baires Conecta, proximamente ampliaremos las capacidades.")
    }}
    
    

    
