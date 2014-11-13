package com.globant.twitter.view.backing.page;

import java.io.Serializable;

import oracle.adf.view.rich.component.rich.input.RichSelectManyCheckbox;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;

public class Test_v4 implements Serializable {
    private RichSelectManyCheckbox values;

    public Test_v4() {
    }

    public void setValues(RichSelectManyCheckbox values) {
        this.values = values;
    }

    public RichSelectManyCheckbox getValues() {
        return values;
    }

    public void method_call(AttributeChangeEvent attributeChangeEvent) {
        // Add event code here...
        System.out.println(String.format("method_call : %s", values.getValue()));
    }
}
