function calcular() {
    var gasolina = parseFloat(prompt("Qual é o valor da gasolina?"));
    var alcool = parseFloat(prompt("Qual é o valor do álcool?"));

    var calculo = alcool/gasolina;

    if (calculo > 0.7) {
        alert("Vale a pena abastecer com gasolina!!");
    } else if (calculo < 0.7) {
        alert("Vale a pena abastecer com álcool!!");
    } else {
        alert("Tanto faz abastecer com gasolina ou álcool!!");
    }
}
do {
    calcular();
    var continuar = prompt("\nDeseja efetuar um novo cálculo? \nDigite 1 para sim ou 2 para não");
} while (continuar == "1");
