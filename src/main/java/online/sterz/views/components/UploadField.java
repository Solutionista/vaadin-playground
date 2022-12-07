/*
 * Copyright (c) 6.7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.views.components;

import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import online.sterz.backend.util.NotificationUtil;


/**
 * Uploadfeld ohne Drop-Funktion für PDF-Dokumente, die nicht größer als 20MB groß sind.
 */
public class UploadField extends Upload {

    public static String uploaded;
    private final NotificationUtil notification = new NotificationUtil();

    public UploadField() {

        //Restrictions
        this.setMaxFiles(1);
        this.setAcceptedFileTypes("application/pdf", ".pdf"); //pdf
        final int maxFileSizeInBytes = 20 * 1024 * 1024; // 20MB
        this.setMaxFileSize(maxFileSizeInBytes);
        this.setClassName("uploadfield");
        this.setDropAllowed(false);
        this.setWidthFull();
        final FileBuffer fileBuffer = new FileBuffer();
        this.setReceiver(fileBuffer);
        addFileRejectedListener(event -> {
            notification.error("Datei ist zu groß oder falsches Dateiformat");
        });
        addUploadAbortListener(e -> {
            getUploadButton().getElement().getStyle().set("background-color", "var(--lumo-primary-color)");
        });
        addSucceededListener(e -> {
            getUploadButton().getElement().getStyle().set("background-color", "green");
        });

    }
}
