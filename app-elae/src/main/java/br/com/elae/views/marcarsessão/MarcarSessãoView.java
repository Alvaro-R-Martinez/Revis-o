package br.com.elae.views.marcarsessão;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Marcar Sessão")
@Route("RegisterSession")
@Menu(order = 5, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class MarcarSessãoView extends Composite<VerticalLayout> {

    public MarcarSessãoView() {
        FormLayout formLayout2Col = new FormLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        ComboBox comboBox = new ComboBox();
        Button buttonPrimary3 = new Button();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        DatePicker datePicker = new DatePicker();
        FormLayout formLayout2Col2 = new FormLayout();
        TimePicker timePicker = new TimePicker();
        TimePicker timePicker2 = new TimePicker();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        layoutColumn2.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Button");
        buttonPrimary.getStyle().set("flex-grow", "1");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Button");
        buttonPrimary2.getStyle().set("flex-grow", "1");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        comboBox.setLabel("Combo Box");
        comboBox.setWidth("100%");
        setComboBoxSampleData(comboBox);
        buttonPrimary3.setText("Button");
        buttonPrimary3.setWidth("219px");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutColumn3.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        datePicker.setLabel("Date picker");
        datePicker.setWidth("100%");
        formLayout2Col2.setWidth("100%");
        timePicker.setLabel("Time picker");
        timePicker.setWidth("min-content");
        timePicker2.setLabel("Time picker");
        timePicker2.setWidth("min-content");
        getContent().add(formLayout2Col);
        formLayout2Col.add(layoutColumn2);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);
        layoutColumn2.add(comboBox);
        layoutColumn2.add(buttonPrimary3);
        formLayout2Col.add(layoutColumn3);
        layoutColumn3.add(datePicker);
        layoutColumn3.add(formLayout2Col2);
        formLayout2Col2.add(timePicker);
        formLayout2Col2.add(timePicker2);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
