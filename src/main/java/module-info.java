module com.ipastorl.tablafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires retrofit2;
    requires io.reactivex.rxjava3;
    requires retrofit2.converter.gson;
    requires retrofit2.adapter.rxjava;


    opens com.ipastorl.tablafx to javafx.fxml;
    exports com.ipastorl.tablafx;
}