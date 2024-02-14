package org.example.app.controller;

import org.example.app.service.UserService;
import org.example.app.utils.AppStarter;
import org.example.app.view.*;

public class UserController {

    UserService service = new UserService();

    public void createInfoUser() {
        UserCreateView createView = new UserCreateView();
        createView.getOutput(service.createInfoUser(createView.getData()));
        AppStarter.startApp();
    }

    public void readInfoUser() {
        UserReadView readView = new UserReadView();
        readView.getOutput(service.readInfoUser());
        AppStarter.startApp();
    }

    public void updateInfoUser() {
        UserUpdateView updateView = new UserUpdateView();
        updateView.getOutput(service.updateInfoUser(updateView.getData()));
        AppStarter.startApp();
    }

    public void deleteInfoUser() {
        UserDeleteView deleteView = new UserDeleteView();
        deleteView.getOutput(service.deleteInfoUser(deleteView.getData()));
        AppStarter.startApp();
    }

    public void readInfoUserById() {
        UserReadByIdView readByIdView = new UserReadByIdView();
        readByIdView.getOutput(service.readUserById(readByIdView.getData()));
        AppStarter.startApp();
    }
}
