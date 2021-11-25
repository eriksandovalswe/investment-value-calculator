import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Calculator calculator = new Calculator();
    TextField amountField = new TextField();
    TextField interestField = new TextField();
    TextField yearsField = new TextField();
    TextField resultField = new TextField();
    Text amountText = new Text("Amount:  ");
    Text interestText = new Text("Interest:  ");
    Text yearsText = new Text("Years:  ");
    Text resultText = new Text("Result:  ");
    Button calculateButton = new Button("Calculate");

    GridPane grid = new GridPane();


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Investment Value Calculator");


        grid.add(amountText, 0, 0);
        grid.add(amountField, 1, 0);
        grid.add(interestText, 0, 1);
        grid.add(interestField, 1, 1);
        grid.add(yearsText, 0, 2);
        grid.add(yearsField, 1, 2);
        grid.add(resultText, 0, 3);
        grid.add(resultField, 1, 3);
        grid.add(calculateButton, 2, 3);
        grid.setAlignment(Pos.CENTER);


        calculateButton.setOnAction(e -> {
            calculator.setAmount(Double.parseDouble(amountField.getText()));
            calculator.setInterestRate(Double.parseDouble(interestField.getText()));
            calculator.setYears(Integer.parseInt(yearsField.getText()));
            calculator.computeAndSetMonthlyInterestRate();
            resultField.setText(Double.toString(calculator.getFutureValue()));

        });

        stage.setScene(new Scene(grid, 300, 250));
        stage.show();





        stage.show();
    }
}
