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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.omg.CORBA.portable.ValueFactory;

/**
 * FXML Controller class
 *
 * @author ABu_Alkhel
 */
public class TableViewPaneController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private TextField majorField;
    @FXML
    private TextField nameFiled;
    @FXML
    private TableView<Student> TableView;
    @FXML
    private TableColumn<Student, Integer> tcId;
    @FXML
    private TableColumn<Student, String> tcName;
    @FXML
    private TableColumn<Student, Double> tcMajor;

    @FXML
    private Button btnShow;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnedit;
    @FXML
    private Button btndelet;
    Statement stat;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/Students2?serverTimezone=UTC";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con
                    = DriverManager.getConnection(url, user, password);
            this.stat = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcMajor.setCellValueFactory(new PropertyValueFactory<>("major"));
        TableView.getSelectionModel(). selectedItemProperty().addListener(e->{showSelectedStudent();});

    }

    @FXML
    private void btnActionShow(ActionEvent event) throws SQLException {
        ResultSet rs = this.stat.executeQuery("SELECT * FROM student ");
        TableView.getItems().clear();
        while (rs.next()) {
            Student s = new Student();
            s.setSid(rs.getInt("sid"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getDouble("major"));

            TableView.getItems().add(s);

        }
    }

    @FXML
    private void btnAddAction(ActionEvent event) throws SQLException {
        Integer id=Integer.parseInt(idField.getText());
        String name=nameFiled.getText();
        Double major=Double.parseDouble(majorField.getText());
        String sql="Insert Into student values("+id+",'"+name+"',"+major+")";
        this.stat.executeUpdate(sql);
    }

   @FXML
private void btnDeletAction(ActionEvent event) throws SQLException {
    Student student = TableView.getSelectionModel().getSelectedItem();
    String sql = "DELETE FROM student WHERE sid = " + student.getSid();
    stat.executeUpdate(sql);
    btnActionShow(event);  // Refresh the table
}

@FXML
private void btnEditAction(ActionEvent event) throws SQLException {
    Integer id = Integer.parseInt(idField.getText());
    String name = nameFiled.getText();
    Double major = Double.parseDouble(majorField.getText());
    String sql = "UPDATE student SET name = '" + name + "', major = " + major + " WHERE sid = " + id;
    stat.executeUpdate(sql);
    btnActionShow(event);  // Refresh the table
}
    private void showSelectedStudent(){
    Student s=TableView.getSelectionModel().getSelectedItem();
    idField.setText(String.valueOf(s.getSid()));
    nameFiled.setText(s.getName());
    majorField.setText(String.valueOf(s.getMajor()));
    

   


    }}
