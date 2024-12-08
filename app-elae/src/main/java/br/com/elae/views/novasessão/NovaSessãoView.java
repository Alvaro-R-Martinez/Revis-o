package br.com.elae.views.novasessão;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Nova Sessão")
@Route("RegisterHistory")
@Menu(order = 10, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class NovaSessãoView extends Composite<VerticalLayout> {

    public NovaSessãoView() {
        FormLayout formLayout2Col = new FormLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H1 h1 = new H1();
        TextArea textArea = new TextArea();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        DatePicker datePicker = new DatePicker();
        NumberField numberField = new NumberField();
        FormLayout formLayout2Col2 = new FormLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        FormLayout formLayout3Col = new FormLayout();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        Button buttonPrimary5 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        layoutColumn2.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h1.setText("Heading");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        textArea.setLabel("Text area");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, textArea);
        textArea.setWidth("100%");
        textArea.setHeight("250px");
        layoutColumn3.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutColumn3.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn3.setAlignItems(Alignment.CENTER);
        datePicker.setLabel("Date picker");
        datePicker.setWidth("100%");
        numberField.setLabel("Number field");
        numberField.setWidth("100%");
        layoutColumn3.setAlignSelf(FlexComponent.Alignment.CENTER, formLayout2Col2);
        formLayout2Col2.setWidth("100%");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Button");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutColumn3.setAlignSelf(FlexComponent.Alignment.CENTER, formLayout3Col);
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        buttonPrimary3.setText("Button");
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Button");
        buttonPrimary4.setWidth("min-content");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary5.setText("Button");
        buttonPrimary5.setWidth("min-content");
        buttonPrimary5.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(formLayout2Col);
        formLayout2Col.add(layoutColumn2);
        layoutColumn2.add(h1);
        layoutColumn2.add(textArea);
        formLayout2Col.add(layoutColumn3);
        layoutColumn3.add(datePicker);
        layoutColumn3.add(numberField);
        layoutColumn3.add(formLayout2Col2);
        formLayout2Col2.add(buttonPrimary);
        formLayout2Col2.add(buttonPrimary2);
        layoutColumn3.add(formLayout3Col);
        formLayout3Col.add(buttonPrimary3);
        formLayout3Col.add(buttonPrimary4);
        formLayout3Col.add(buttonPrimary5);
    }
}
