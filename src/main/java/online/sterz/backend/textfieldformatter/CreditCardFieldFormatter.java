/*
 * Copyright (c) 7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.backend.textfieldformatter;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.textfield.TextField;

import java.util.ArrayList;
import java.util.List;

public class CreditCardFieldFormatter extends CleaveExtension {

    private final List<CreditCardChangedListener> listeners = new ArrayList<>();

    public CreditCardFieldFormatter() {
        this(false);
    }

    public CreditCardFieldFormatter(boolean support19DigitPAN) {
        getConfiguration().creditCard = true;
        getConfiguration().creditCardStrictMode = support19DigitPAN;
    }

    /**
     * Adds this extension to a TextField. Extension cannot be moved to another
     * TextField again.
     *
     * @param textField TextField to attach this extension to
     */
    public void extend(TextField textField) {
        super.extend(textField);
    }

    public void addCreditCardChangedListener(CreditCardChangedListener listener) {
        listeners.add(listener);
    }

    @ClientCallable
    public void onCreditCardChanged(String type) {
        final CreditCardType cardType = (type != null) ? CreditCardType.valueOf(type.toUpperCase())
                : CreditCardType.UNKNOWN;
        listeners
                .forEach(l -> l.creditCardChanged(new CreditCardChangedEvent(CreditCardFieldFormatter.this, cardType)));
    }

    public void removeCreditCardChangedListener(CreditCardChangedListener listener) {
        listeners.remove(listener);
    }

    public enum CreditCardType {
        UNKNOWN, AMEX, MASTERCARD, VISA, DINERS, DISCOVER, JCB, DANKORT, INSTAPAYMENT, UATP, MIR, UNIONPAY
	}

    public interface CreditCardChangedListener {
        void creditCardChanged(CreditCardChangedEvent event);
    }

    public class CreditCardChangedEvent {
        private final CreditCardType creditCardType;
        private final CreditCardFieldFormatter source;

        public CreditCardChangedEvent(CreditCardFieldFormatter source, CreditCardType creditCardType) {
            this.source = source;
            this.creditCardType = creditCardType;
        }

        public CreditCardType getCreditCardType() {
            return creditCardType;
        }

        public CreditCardFieldFormatter getSource() {
            return source;
        }
    }
}
