package com.example.controledenotas

    //Calcular media isolando a função
    fun situacaoAluno(media: Int): String? {
        if (media >= 5)
            return "Aprovado"
        else
            return "Reprovado"
    }

    //função calcular media
    /*private fun calcularMedia(nota1: Int, nota2: Int): Int {
        return  (nota1 + nota2) / 2
    }*/

    //outra forma de fazer função em kotlim
    // private fun calcularMedia(nota1: Int, nota2: Int) = (nota1 + nota2) / 2

    //função array utilizada para diminuir a fração
    // val calcularMedia = {nota1: Int, nota2: Int -> (nota1 + nota2) / 2}

    //função para calculo de mais de uma media
    //vararg varios argumentos
    //for utilizado para percorrer o for
    fun calcularMedia (vararg notas:Int): Int {
        var soma = 0
        for (nota in notas) {
            soma += nota
        }
        return soma / notas.size
    }