package br.com.elae.views.adicionartópico;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import java.util.ArrayList;
import java.util.List;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Adicionar Tópico")
@Route("RegisterAnamnesis")
@Menu(order = 7, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class AdicionarTópicoView extends Composite<VerticalLayout> {

    public AdicionarTópicoView() {
        ComboBox comboBox = new ComboBox();
        TextArea textArea = new TextArea();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        comboBox.setLabel("Combo Box");
        comboBox.setWidth("100%");
        setComboBoxSampleData(comboBox);
        textArea.setLabel("Text area");
        textArea.setWidth("100%");
        textArea.getStyle().set("flex-grow", "1");
        getContent().add(comboBox);
        getContent().add(textArea);
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
