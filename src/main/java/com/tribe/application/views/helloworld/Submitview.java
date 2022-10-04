package com.tribe.application.views.helloworld;

import com.tribe.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Hello World")
@Route(value = "hello-world", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class Submitview extends HorizontalLayout {

    private TextField name;
    private Button submit;

    public Submitview() {
        name = new TextField("Paste your audio link");
        submit = new Button("Submit");
        submit.addClickListener(e -> {

            if(name != null) {
                Notification.show("Your audio has been submitted");
            }

        });
        submit.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, submit);

        add(name, submit);
    }

}
