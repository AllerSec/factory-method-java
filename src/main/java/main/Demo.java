package main;

import factory.*;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        // Seleccionar el diálogo que deseas probar
        //dialog = new WindowsDialog(); // Cambia esto para probar otros diálogos
        //dialog = new HtmlDialog();
        dialog = new CustomActionDialog();
        // dialog = new StyledDialog();
        // dialog = new ConfirmationDialog();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}