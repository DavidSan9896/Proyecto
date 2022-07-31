package view;
import persistence.HandlerLanguage;
import presenter.Presenter;

import javax.swing.*;

public class JMainFrame extends JFrame {

    private JPMainPanel mainPanel;
    private Presenter myPresenter;

    public JMainFrame(Presenter presenter){
        myPresenter = presenter;
        setExtendedState(MAXIMIZED_BOTH);
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }


}
