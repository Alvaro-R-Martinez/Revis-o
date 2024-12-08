package br.com.elae.views.listaaluno;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Lista Aluno")
@Route("ListStudent")
@Menu(order = 4, icon = LineAwesomeIconUrl.CREATIVE_COMMONS_BY)
public class ListaAlunoView extends Composite<VerticalLayout> {

    public ListaAlunoView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
