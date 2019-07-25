package codes

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class LearningJavaFXKotlin : Application() {

    override fun start(primaryStage: Stage) {
        val root = StackPane()
        val labelMessage = Label()

        labelMessage.text = "Estou aprendendo JavaFX!"
        root.children.addAll(labelMessage)

        val scene = Scene(root,300.0, 150.0)

        primaryStage.setTitle("Aprendendo Java FX")
        primaryStage.setScene(scene)
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(LearningJavaFXKotlin::class.java)
        }
    }
}