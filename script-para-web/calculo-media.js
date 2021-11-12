/*Disciplina: Linguagens de Scrip para a Web
Autor: Mariana de Athayde Costa Ozorio
Data: 16/11/2021
Objetivo:<<<coloque o objetivo do programa>>>*/

function calcularRendimento(primeiraNota=9, segundaNota=7, terceiraNota=6, quartaNota=10) {

    var media = 0
    media = ((primeiraNota*0.1) + (segundaNota*0.2) + (terceiraNota*0.3) + (quartaNota*0.4))
  
    /*let media2 = parseFloat(media.toFixed(2))*/
    return(media)
}

calcularRendimento()
console.log(media)