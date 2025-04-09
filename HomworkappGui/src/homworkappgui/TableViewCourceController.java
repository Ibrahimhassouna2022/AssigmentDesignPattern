/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homworkappgui;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ABu_Alkhel
 */
public class TableViewCourceController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private TextField roomField;
    @FXML
    private TextField nameFiled;
    @FXML
    private TableView<Courc> TableView;
    @FXML
    private TableColumn<Courc, Integer> tcId;
    @FXML
    private TableColumn<Courc, String> tcName;
    @FXML
    private TableColumn<Courc, String> tcMajor;
    @FXML
    private Button btnShow;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnedit;
    @FXML
    private Button btndelet;

    /**
     * Initializes the controller class.
     */
    Statement stat;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
             
            String url1 = "jdbc:mysql://127.0.0.1:3306/Students2?serverTimezone=UTC";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con
                    = DriverManager.getConnection(url1, user, password);
            this.stat = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tcId.setCellValueFactory(new PropertyValueFactory<>("cid"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcMajor.setCellValueFactory(new PropertyValueFactory<>("room"));
        TableView.getSelectionModel().selectedItemProperty().addListener(e -> {
        });

    }

    @FXML
    private void btnActionShow(ActionEvent event) throws SQLException {
        ResultSet rs = this.stat.executeQuery("SELECT * FROM course ");
        TableView.getItems().clear();
        while (rs.next()) {
            Courc s = new Courc();
            s.setCid(rs.getInt("cid"));
            s.setName(rs.getString("name"));
            s.setRoom(rs.getString("room"));

            TableView.getItems().add(s);

        }
    }

    @FXML
    private void btnAddAction(ActionEvent event) throws SQLException {
        Integer id = Integer.parseInt(idField.getText());
        String name = nameFiled.getText();
        String room = roomField.getText();
        String sql = "Insert Into course values(" + id + ",'" + name + "','" + room + "')";
        this.stat.executeUpdate(sql);
    }

 @FXML
private void btnDeletAction(ActionEvent event) throws SQLException {
    Courc course = TableView.getSelectionModel().getSelectedItem();
    String sql = "DELETE FROM course WHERE cid = " + course.getCid();
    stat.executeUpdate(sql);
    btnActionShow(event);  // Refresh the table
}

@FXML
private void btnEditAction(ActionEvent event) throws SQLException {
    Integer id = Integer.parseInt(idField.getText());
    String name = nameFiled.getText();
    String room = roomField.getText();
    String sql = "UPDATE course SET name = '" + name + "', room = '" + room + "' WHERE cid = " + id;
    stat.executeUpdate(sql);
    btnActionShow(event);  // Refresh the table
}


  

    private void showSelectedStudent() {
        Courc cs = TableView.getSelectionModel().getSelectedItem();
        idField.setText(String.valueOf(cs.getCid()));
        nameFiled.setText(cs.getName());
        roomField.setText(String.valueOf(cs.getRoom()));

    }

}
