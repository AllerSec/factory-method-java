package factory;

import buttons.Button;
import buttons.CustomActionButton;

public class CustomActionDialog extends Dialog {

    @Override
    public Button createButton() {
        return new CustomActionButton();
    }
}