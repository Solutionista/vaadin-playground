
/*
 * Copyright (c) 6.7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.backend.util;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class NotificationUtil extends Notification {

    public NotificationUtil() {
        this.setDuration(2500);

    }

    public NotificationUtil error(String notificationText) {
        final NotificationUtil notification = new NotificationUtil();
        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);

        final Button closeButton = new Button(new Icon("lumo", "cross"));
        closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
        closeButton.getElement().setAttribute("aria-label", "Close");
        closeButton.addClickListener(event -> {
            notification.close();
        });
        Div notificationDiv = new Div(new Text(notificationText));
        final HorizontalLayout layout = new HorizontalLayout(notificationDiv, closeButton);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        notification.add(layout);
        notification.open();
        notification.setPosition(Position.MIDDLE);
        return notification;
    }


}
