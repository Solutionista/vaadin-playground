/*
 * Copyright (c) 10.7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.views.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import online.sterz.backend.textfieldformatter.NumeralFieldFormatter;

import java.text.DecimalFormat;

public class CurrencyField extends TextField {

    public CurrencyField(final String label, final String suffix) {
        super(label);
        setValueChangeMode(ValueChangeMode.LAZY);
        addValueChangeListener(e -> {
            if (!e.getValue().isEmpty()) {
                String fieldString = e.getValue().replace(".", "").replace(",", ".");
                double offerAmountRevDouble = Double.parseDouble(fieldString);
                String offerAmountRevString = new DecimalFormat("#.00").format(offerAmountRevDouble);
                e.getSource().setValue(offerAmountRevString);
                new NumeralFieldFormatter(".", ",", 2).extend(e.getSource());
            } else {
                e.getSource().setValue("");
            }
        });
        setSuffixComponent(new Div(new Text(suffix)));

    }


}
