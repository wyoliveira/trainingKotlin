import java.lang.StringBuilder

class FormatMoney {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var number: String = "1270050025"
            //12.700.500.25
            number = number.reversed()
            println(number.length)
            var strBuilder = StringBuilder()

            strBuilder = StringBuilder(number.substring(0, 2))
            println(strBuilder)
            number = number.substring(2)
            strBuilder.append(",")


            if (number.length > 3) {
                strBuilder.append(number.substring(0, 3))
                println(strBuilder)
            } else {
                strBuilder.append(".$number")
            }
            number = number.substring(3)

            strBuilder.append(".")
            if (number.length > 3) {
                strBuilder.append(number.substring(0, 3))
                println(strBuilder)
            } else {
                strBuilder.append(".$number")
            }
            number = number.substring(3)

            if (number.length > 3) {
                strBuilder.append(number.substring(0, 3))
                println(strBuilder)
            } else {
                strBuilder.append(".$number")
            }
            // Daqui pra cima é a parte escrota da lógica que eu tive que pensar
            // O método formatMoney abaixo é o resultado da lógica
            println("Resultado final : ${strBuilder.toString().reversed()}")

            fun formatMoney(numberToConvert: String): String {
                when (numberToConvert.length) {
                    1 -> return "0,0$numberToConvert" //Devolve como centavos
                    2 -> return "0,$numberToConvert" //Devolve como centavos
                    else -> {
                        // Acima de 3 algarismos, o código inverte a string do número
                        // e constrói uma nova String, usando o StringBuilder, com essas duas primeiras casas
                        var numberString = numberToConvert.reversed()
                        val stringBuilder = StringBuilder(numberString.substring(0, 2))

                        //O código então adiciona uma vírgula, para futuramente representar a vírgula dos centavos
                        stringBuilder.append(",")
                        //Depois ele remove as duas primeiras casas
                        numberString = numberString.substring(2)

                        // Agora que o código está tratando apenas a parte inteira do "dinheiro em reais"
                        // enquanto a parte inteira tiver um tamanho maior que 3, ele irá pegar 3 algarismos,
                        // adicionar no StringBuilder e colocar um ponto "."
                        while (numberString.length >3){
                            stringBuilder.append(numberString.substring(0, 3))
                            numberString = numberString.substring(3)
                            stringBuilder.append(".")
                        }

                        // Caso o numberString fique restando um valor que não atenda mais o while, ou seja,
                        // tem tamanho menor ou igual a 3, ele apenas adiciona no StringBuilder
                        // Pra finalizar o código inverte outra vez a string do número, colocando os números na ordem original
                        return stringBuilder.append(numberString).toString().reversed()
                    }
                }
            }
            println(formatMoney("4329874")) //89.320.000.343,10

        }
    }


}
