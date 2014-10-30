package com.globant.hr.view.backing;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class backing_login {
    private RichInputText password;

    public backing_login() {
        System.out.println(String.format("Creating backing_login: "));
    }

    public void setPassword(RichInputText password) {
        System.out.println(String.format("Setting backing_login: %s ", password));
        this.password = password;
    }

    public RichInputText getPassword() {
        System.out.println(String.format("Getting backing_login: %s ", password));
        return password;
    }
}
