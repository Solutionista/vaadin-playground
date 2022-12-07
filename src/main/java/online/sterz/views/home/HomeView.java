/*
 * Copyright (c) 7.7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.views.home;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import online.sterz.views.components.CurrencyField;

@PageTitle("Home")
@Route(value = "Home")
@RouteAlias(value = "")
public class HomeView extends HorizontalLayout {

    private final TextField name;
    private final Button sayHello;

    public HomeView() {
        name = new TextField("Your name");
        CurrencyField currency = new CurrencyField("Betrag", "EUR");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, currency, sayHello);

        add(name, sayHello, currency);
    }

}
