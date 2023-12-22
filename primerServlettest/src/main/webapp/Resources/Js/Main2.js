var name = document.getElementById("nombre");
var surname = document.getElementById("apellido");
var theme = document.getElementById("tema");
var email = document.getElementById("email"); // Corregí la variable aquí
const btnEnviar = document.getElementById("tonbo");

btnEnviar.addEventListener("click", send);

function send() {
    const mailLength = parseFloat(email.value.length); // Cambié el nombre de la variable aquí
    const themeLength = parseFloat(theme.value.length);
    const nameLength = parseFloat(name.value.length);
    const surnameLength = parseFloat(surname.value.length);

    if (nameLength === 0 || surnameLength === 0 || themeLength === 0 || mailLength === 0) {
        alert("Ingrese todos los datos solicitados");
    } else {
        alert("Se ha inscrito correctamente. Si es seleccionado, le enviaremos un email al correo suscrito.");
    }
}