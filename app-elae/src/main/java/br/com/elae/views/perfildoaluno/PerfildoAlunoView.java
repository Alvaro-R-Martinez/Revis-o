package br.com.elae.views.perfildoaluno;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Perfil do Aluno")
@Route("ListStudent2")
@Menu(order = 9, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class PerfildoAlunoView extends Composite<VerticalLayout> {

    public PerfildoAlunoView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
