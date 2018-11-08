package sample;

import javafx.fxml.FXML;
import model.*;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML
    public TextField val2;
    @FXML
    public TextField val1;
    @FXML
    public TextField rezult;



    public void log_I(){
        Context context = new Context(new OperationAND());
        rezult.setText(context.executeStrategy(val1.getText(), val2.getText()));
    }
    public void log_ILI(){
        Context context = new Context(new OperationOR());
        rezult.setText(context.executeStrategy(val1.getText(), val2.getText()));

    }
    public void log_I_NE(){
        Context context = new Context(new OperationAND_NO());
        rezult.setText(context.executeStrategy(val1.getText(), val2.getText()));
    }
    public void loh_ILI_NE(){
        Context context = new Context(new OperationOR_NO());
        rezult.setText(context.executeStrategy(val1.getText(), val2.getText()));
    }
    public void log_XOR(){
        Context context = new Context(new OperationXOR());
        rezult.setText(context.executeStrategy(val1.getText(), val2.getText()));
    }
    public void cleen(){
        val1.setText("");
        val2.setText("");
        rezult.setText("");
    }



}


