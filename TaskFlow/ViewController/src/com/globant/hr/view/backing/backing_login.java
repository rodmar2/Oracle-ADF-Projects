package com.globant.hr.view.backing;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class backing_login {
    private RichInputText password;

    public backing_login() {
    }

    public void setPassword(RichInputText password) {
        this.password = password;
    }

    public RichInputText getPassword() {
        return password;
    }
}
