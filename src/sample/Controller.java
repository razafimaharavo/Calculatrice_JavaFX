package sample;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Controller {

    @FXML
    private ImageView SaryKely;
    @FXML
    private Label HistoriqueLab;
    @FXML
    private Button BtnHistoire;
    @FXML
    private Pane PaneCash;
    @FXML
    private TextField Answers;

    @FXML
    private Label textBoxInput;
    public String Cacher="";


    @FXML
    void BtnHistoire_click(ActionEvent event) {

        if (Cacher.equals("Cacher"))
        {
            PaneCash.setVisible(false);
            Cacher="Show";
            return;
        }
        Cacher="Cacher";
        PaneCash.setVisible(true);
    }

    @FXML
    void delete_Click(ActionEvent event) {
        String chaine = textBoxInput.getText();
        if (chaine.length()!=0){
            String newChaine = chaine.substring(0, chaine.length() - 1);
            textBoxInput.setText(newChaine);
        }
    }


    @FXML
    void egale_Click(ActionEvent event) {

        String expression = textBoxInput.getText();
        ScriptEngineManager calculer = new ScriptEngineManager();//evaluer l'expression mathématique entrer par l'utilisateur sur textBox
        ScriptEngine engine = calculer.getEngineByName("JavaScript"); // pour gérer les moteurs d'exécution de scripts
        try {
            Object result = engine.eval(expression); // évaluer cette expression et stocker le résultat dans un objet de type Object.
            Answers.setText("= " + result.toString());
        } catch (ScriptException e) {
            Answers.setText("Syntax ERROR");
        }
        HistoriqueLab.setText(HistoriqueLab.getText()+"\n"+Answers.getText());
    }

    @FXML
    void point_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+".");
    }

    @FXML
    void reset_Click(ActionEvent event) {
        textBoxInput.setText("");
        Answers.setText("=");
    }

    @FXML
    void zero_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"0");
    }
    @FXML
    void un_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"1");
    }
    @FXML
    void deux_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"2");
    }
    @FXML
    void trois_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"3");
    }
    @FXML
    void quatre_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"4");
    }
    @FXML
    void cing_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"5");
    }
    @FXML
    void six_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"6");
    }
    @FXML
    void sept_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"7");
    }
    @FXML
    void huit_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"8");
    }
    @FXML
    void neuf_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"9");
    }

    @FXML
    void div_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"/");
    }
    @FXML
    void mul_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"*");
    }
    @FXML
    void plus_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"+");
    }
    @FXML
    void sous_Click(ActionEvent event) {
        textBoxInput.setText(textBoxInput.getText()+"-");
    }
}
