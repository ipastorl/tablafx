module com.ipastorl.tablafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires com.google.gson;


    opens com.ipastorl.tablafx to javafx.fxml;
    exports com.ipastorl.tablafx;
}