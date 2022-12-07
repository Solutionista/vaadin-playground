/*
 * Copyright (c) 7.7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.backend.textfieldformatter.phone;

import com.vaadin.flow.component.dependency.JsModule;
import online.sterz.backend.textfieldformatter.AbstractPhoneFieldFormatter;

/**
 * Formatter for phone numbers. Provide the region code in the constructor. This
 * formatter includes all the regions supported by Cleave into a single bundle
 * resulting in a bigger file size loaded by the browser. Use this if you need
 * to support more than one region or want to create formatters without knowing the class
 * name compile time. If you want to support specific regions separately, use
 * PhoneXXFieldFormatter classes, e.g. PhoneUSFieldFormatter.
 */
@JsModule("cleave.js/dist/addons/cleave-phone.i18n.js")
public class PhoneI18nFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneI18nFieldFormatter(String phoneRegionCode) {
        super(phoneRegionCode);
    }

}
