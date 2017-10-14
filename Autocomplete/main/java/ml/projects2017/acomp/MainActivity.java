package ml.projects2017.acomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actView;
    String[] coll={
            "abc","acd","ade","bcd","bde","cdf","cfe"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actView=(AutoCompleteTextView)findViewById(R.id.actv);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,coll);

        actView.setThreshold(1);
        actView.setAdapter(adapter);

    }









}
