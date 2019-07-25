package com.wyboltech.views



fun showCurrentColorInRectangle(numberColor: String): String{
	val text: String = numberColor
	return Integer.toHexString(text.toInt())
	//val color : Color = Color.web(text.toUpperCase())// blue as a hex web value, implicit alpha
	//rectangle_curr_color.fill = color
}


fun main(args: Array<String>) {
	//"7925089" Verde claro
	//"43775" Azul claro
	//"187" Azul escuro
	
	val stringToFormat = showCurrentColorInRectangle("11861912")
	val formatZeroPad: String  = "000000";
	val formattedHexColor = formatZeroPad.substring(stringToFormat.length) + stringToFormat
	println(formattedHexColor)
}


@FXML
fun showCurrentColorInRectangle(numberColor: String){
	val formatColor = Integer.toHexString(numberColor.toInt())
	//Define o padrão de 6 dígitos, caso a string de retorno tenha menos que 6 casas, preenche as casas à esquerda com zero
	val formatZeroPad: String  = "000000" 	
	//Converte o inteiro em hexadecimal
	val formattedHexColor = formatZeroPad.substring(formatColor.length) + formatColor
	//Usa o hexadecimal para criar uma Cor
	val color : Color = Color.web(formattedHexColor.toUpperCase())
	//Pinta um retângulo
	<Shape: Node>.fill = color
}
