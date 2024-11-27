package com.example.lab7.picture;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Picture extends Application {
    private GraphicsContext gc;
    private double brushSize = 10.0;

    @Override
    public void start(Stage stage) {
        // Створення полотна
        Canvas canvas = new Canvas(800, 600);
        gc = canvas.getGraphicsContext2D();
        drawInitialCanvas(); // Початковий малюнок

        // Вибір розміру пензля
        ChoiceBox<Double> brushSizeSelector = new ChoiceBox<>();
        brushSizeSelector.getItems().addAll(5.0, 10.0, 20.0, 30.0);
        brushSizeSelector.setValue(brushSize);
        brushSizeSelector.setOnAction(e -> brushSize = brushSizeSelector.getValue());

        // Логіка видалення малюнка мишею
        canvas.setOnMouseDragged(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                gc.clearRect(e.getX() - brushSize / 2, e.getY() - brushSize / 2, brushSize, brushSize);
            }
        });

        // Повернення до вихідного стану при потрійному натисканні
        canvas.setOnMouseClicked(e -> {
            if (e.getClickCount() == 3) {
                drawInitialCanvas();
            }
        });

        // Розміщення елементів на сцені
        BorderPane root = new BorderPane();
        root.setCenter(canvas);
        root.setTop(brushSizeSelector);

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Canvas Drawing App");
        stage.setScene(scene);
        stage.show();
    }

    // Початковий малюнок
    private void drawInitialCanvas() {
        // Градієнтний фон
        for (int i = 0; i < 800; i++) {
            gc.setStroke(Color.hsb(i * 0.5, 0.7, 0.9));
            gc.strokeLine(i, 0, i, 600);
        }

        // Сонце (жовтий круг)
        gc.setFill(Color.YELLOW);
        gc.fillOval(600, 50, 150, 150);

        // Будинок (коричневий прямокутник + червоний дах)
        gc.setFill(Color.SADDLEBROWN);
        gc.fillRect(200, 300, 200, 200);

        gc.setFill(Color.DARKRED);
        gc.fillPolygon(new double[]{200, 400, 300}, new double[]{300, 300, 200}, 3);

        // Вікна (блакитні прямокутники)
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(220, 320, 60, 60);
        gc.fillRect(320, 320, 60, 60);

        // Дерево (зелений круг + коричневий стовбур)
        gc.setFill(Color.SADDLEBROWN);
        gc.fillRect(100, 350, 30, 150);
        gc.setFill(Color.FORESTGREEN);
        gc.fillOval(70, 300, 90, 90);

        // Хмари (білі овали)
        gc.setFill(Color.WHITE);
        gc.fillOval(100, 100, 100, 50);
        gc.fillOval(130, 80, 100, 50);
        gc.fillOval(150, 110, 120, 50);

        gc.fillOval(500, 120, 120, 50);
        gc.fillOval(520, 100, 100, 50);
        gc.fillOval(480, 90, 110, 50);

        // Квіти (рожеві круги + жовті центри)
        gc.setFill(Color.PINK);
        for (int i = 0; i < 5; i++) {
            double x = 100 + i * 120;
            gc.fillOval(x, 500, 40, 40);
            gc.setFill(Color.YELLOW);
            gc.fillOval(x + 10, 510, 20, 20);
            gc.setFill(Color.PINK);
        }

        // Трава (зелені прямокутники)
        gc.setFill(Color.LAWNGREEN);
        for (int i = 0; i < 800; i += 20) {
            gc.fillRect(i, 550, 10, 50);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
