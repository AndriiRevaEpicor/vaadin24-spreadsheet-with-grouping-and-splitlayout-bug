package org.vaadin.example;

import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.spreadsheet.Spreadsheet;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

@Route
public class MainView extends VerticalLayout {

    public MainView() throws IOException {
        Spreadsheet spreadsheet;
        try (InputStream stream = new ClassPathResource("example.xlsx").getInputStream()) {
            spreadsheet = new Spreadsheet(stream);
        }

        Button button = new Button("Random button label");
        button.setSizeFull();

        SplitLayout splitLayout = new SplitLayout(spreadsheet, button, SplitLayout.Orientation.HORIZONTAL);
        splitLayout.setWidth("100%");
        splitLayout.setHeight("500px");

        add(splitLayout);
    }
}
