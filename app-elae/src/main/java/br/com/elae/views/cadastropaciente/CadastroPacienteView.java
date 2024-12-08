package br.com.elae.views.cadastropaciente;

import br.com.elae.components.phonenumberfield.PhoneNumberField;
import br.com.elae.components.pricefield.PriceField;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Cadastro Paciente")
@Route("RegisterPatient")
@Menu(order = 1, icon = LineAwesomeIconUrl._500PX)
public class CadastroPacienteView extends Composite<VerticalLayout> {

    public CadastroPacienteView() {
        FormLayout formLayout2Col = new FormLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        TextField textField = new TextField();
        DatePicker datePicker = new DatePicker();
        H5 h5 = new H5();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        PriceField price = new PriceField();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        EmailField emailField = new EmailField();
        PhoneNumberField phoneNumber = new PhoneNumberField();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        TextField textField2 = new TextField();
        ComboBox comboBox = new ComboBox();
        ComboBox comboBox2 = new ComboBox();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        layoutColumn2.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textField.setLabel("Text field");
        textField.setWidth("100%");
        datePicker.setLabel("Date picker");
        datePicker.setWidth("100%");
        h5.setText("Heading");
        h5.setWidth("max-content");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Button");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.getStyle().set("flex-grow", "1");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Button");
        buttonPrimary2.getStyle().set("flex-grow", "1");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        price.setLabel("Price");
        price.setWidth("100%");
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        buttonPrimary3.setText("Button");
        buttonPrimary3.getStyle().set("flex-grow", "1");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Button");
        buttonPrimary4.getStyle().set("flex-grow", "1");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutColumn3.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        emailField.setLabel("Email");
        emailField.setWidth("100%");
        phoneNumber.setLabel("Phone number");
        phoneNumber.setWidth("min-content");
        layoutRow3.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        textField2.setLabel("Text field");
        textField2.getStyle().set("flex-grow", "1");
        comboBox.setLabel("Combo Box");
        comboBox.getStyle().set("flex-grow", "1");
        setComboBoxSampleData(comboBox);
        comboBox2.setLabel("Combo Box");
        comboBox2.setWidth("100%");
        setComboBoxSampleData(comboBox2);
        layoutRow4.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        textField3.setLabel("Text field");
        textField3.getStyle().set("flex-grow", "1");
        textField4.setLabel("Text field");
        textField4.setWidth("100px");
        getContent().add(formLayout2Col);
        formLayout2Col.add(layoutColumn2);
        layoutColumn2.add(textField);
        layoutColumn2.add(datePicker);
        layoutColumn2.add(h5);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);
        layoutColumn2.add(price);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(buttonPrimary3);
        layoutRow2.add(buttonPrimary4);
        formLayout2Col.add(layoutColumn3);
        layoutColumn3.add(emailField);
        layoutColumn3.add(phoneNumber);
        layoutColumn3.add(layoutRow3);
        layoutRow3.add(textField2);
        layoutRow3.add(comboBox);
        layoutColumn3.add(comboBox2);
        layoutColumn3.add(layoutRow4);
        layoutRow4.add(textField3);
        layoutRow4.add(textField4);
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
