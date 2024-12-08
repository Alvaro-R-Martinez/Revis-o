package br.com.elae.views.listaanamnese;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Lista Anamnese")
@Route("ListAnamnesis")
@Menu(order = 6, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class ListaAnamneseView extends Composite<VerticalLayout> {

    public ListaAnamneseView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        getContent().add(layoutColumn2);
    }
}
