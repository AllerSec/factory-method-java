package factory;

import buttons.Button;
import buttons.StyledButton;

public class StyledDialog extends Dialog {

    @Override
    public Button createButton() {
        return new StyledButton();
    }
}