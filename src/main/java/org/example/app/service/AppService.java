package org.example.app.service;

import org.example.app.controller.UserController;
import org.example.app.exceptions.OptionException;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.AppView;

public class AppService {

    UserController controller = new UserController();

    public void filterChoice(int choice) {
        switch (choice) {
            case 1 -> controller.createInfoUser();
            case 2 -> controller.readInfoUser();
            case 3 -> controller.updateInfoUser();
            case 4 -> controller.deleteInfoUser();
            case 5 -> controller.readInfoUserById();
            case 0 -> new AppView().getOutput(Integer.toString(choice));
            default -> {
                try {
                    throw new OptionException(Constants.INCORRECT_OPTION_MSG);
                } catch (OptionException e) {
                    new AppView().getOutput(e.getMessage());
                    AppStarter.startApp();
                }
            }
        }
    }
}
