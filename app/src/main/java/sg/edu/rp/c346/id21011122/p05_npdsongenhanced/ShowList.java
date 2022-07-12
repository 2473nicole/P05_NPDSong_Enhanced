package sg.edu.rp.c346.id21011122.p05_npdsongenhanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class ShowList extends AppCompatActivity {

    Button btnList;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        btnList = findViewById(R.id.btnList);
        lv = findViewById(R.id.lv);
    }
}