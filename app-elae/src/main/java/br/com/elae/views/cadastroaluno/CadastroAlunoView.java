package br.com.elae.views.cadastroaluno;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Cadastro Aluno")
@Route("RegisterStudent")
@Menu(order = 2, icon = LineAwesomeIconUrl._500PX)
public class CadastroAlunoView extends Composite<VerticalLayout> {

    public CadastroAlunoView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
