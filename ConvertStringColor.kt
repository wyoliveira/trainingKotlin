package com.wyboltech.views


fun showCurrentColorInRectangle(numberColor: String): String{
	val text: String = numberColor
	return Integer.toHexString(text.toInt())
	//val color : Color = Color.web(text.toUpperCase())// blue as a hex web value, implicit alpha
	//rectangle_curr_color.fill = color
}


fun main(args: Array<String>) {
	//"7925089"
	//"43775"
	
	val stringToFormat = showCurrentColorInRectangle("11861912")
	val formatZeroPad: String  = "000000";
	val formattedHexColor = formatZeroPad.substring(stringToFormat.length) + stringToFormat
	println(formattedHexColor)
}