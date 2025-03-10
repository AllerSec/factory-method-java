package main;

import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        // Forzar el uso de WindowsDialog para ejecutar la interfaz gráfica Swing
        dialog = new WindowsDialog();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}