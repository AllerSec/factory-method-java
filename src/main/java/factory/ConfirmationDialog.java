package factory;

import buttons.Button;
import buttons.ConfirmationButton;

public class ConfirmationDialog extends Dialog {

    @Override
    public Button createButton() {
        return new ConfirmationButton();
    }
}