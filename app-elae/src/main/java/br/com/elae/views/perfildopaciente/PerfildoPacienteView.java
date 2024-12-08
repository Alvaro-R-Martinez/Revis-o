package br.com.elae.views.perfildopaciente;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Perfil do Paciente")
@Route("ListProfile")
@Menu(order = 8, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class PerfildoPacienteView extends Composite<VerticalLayout> {

    public PerfildoPacienteView() {
        FormLayout formLayout2Col = new FormLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        getContent().add(formLayout2Col);
    }
}
