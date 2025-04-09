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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ABu_Alkhel
 */
public class RegisterStuController implements Initializable {

    @FXML
    private ComboBox<Student> studentComboBox;
    @FXML
    private ComboBox<Courc> courseComboBox;
    @FXML
    private ComboBox<String> semesterComboBox;
    @FXML
    private TextField markField;
    @FXML
    private Button saveButton;
    @FXML
    private Button clearButton;

    private Statement stat;
    ObservableList<String> semesters = FXCollections.observableArrayList("Fall", "Spring", "Summer");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            String dbUrl = "jdbc:mysql://127.0.0.1:3306/Students2?serverTimezone=UTC";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, user, password);
            this.stat = con.createStatement();

            semesterComboBox.setItems(semesters);
            loadStudents();
            loadCourses();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void loadStudents() throws SQLException {
        ResultSet rs = stat.executeQuery("SELECT * FROM student");
        while (rs.next()) {
            Student s = new Student(rs.getInt("sid"), rs.getString("name"), rs.getDouble("major"));
            studentComboBox.getItems().add(s);
        }
    }

    private void loadCourses() throws SQLException {
        ResultSet rs = stat.executeQuery("SELECT * FROM course");
        while (rs.next()) {
            Courc c = new Courc(rs.getInt("cid"), rs.getString("name"), rs.getString("room"));
            courseComboBox.getItems().add(c);
        }
    }

    @FXML
    private void registerStudent(ActionEvent event) throws SQLException {
        if (studentComboBox.getValue() == null || courseComboBox.getValue() == null || semesterComboBox.getValue() == null) {
            // Validation check
            System.out.println("All fields must be filled.");
            return;
        }

        Student student = studentComboBox.getValue();
        Courc course = courseComboBox.getValue();
        String semester = semesterComboBox.getValue();
        double mark = Double.parseDouble(markField.getText());

        String sql = "INSERT INTO registration (sid, cid, semester, mark) VALUES ("
                + student.getSid() + ", " + course.getCid() + ", '" + semester + "', " + mark + ")";
        stat.executeUpdate(sql);

        System.out.println("Registration saved successfully.");
        clearFields();
    }

    @FXML
    private void clearFields() {
        studentComboBox.getSelectionModel().clearSelection();
        courseComboBox.getSelectionModel().clearSelection();
        semesterComboBox.getSelectionModel().clearSelection();
        markField.clear();
    }
}
