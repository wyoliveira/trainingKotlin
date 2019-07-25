package codes

import javafx.scene.Scene
import javafx.application.Application
import javafx.stage.Stage
import javafx.event.ActionEvent
import javafx.scene.control.ColorPicker
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import javafx.scene.text.Text


class ColorPickerTraining : Application() {
    override fun start(stage: Stage) {
        val scene = Scene(HBox(20.0), 400.0, 100.0)
        val box = scene.root as HBox
        val colorPicker = ColorPicker()
        colorPicker.value = Color.RED

        val text = Text("Color picker:")
        text.setFill(colorPicker.value)

        colorPicker.setOnAction { t: ActionEvent ->
            text.setFill(colorPicker.value)
            println(Integer.decode(colorPicker.value.toString().substring(0,8)))
        }

        box.children.addAll(colorPicker, text)

        stage.scene = scene
        stage.show()

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(ColorPickerTraining::class.java)
        }

    }


}