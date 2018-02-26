package com.example.android.rubikcube;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        Button submit1 = findViewById(R.id.submit1);
        Button submit2 = findViewById(R.id.submit2);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num = findViewById(R.id.numberOfCubes);
                String storeTemp = num.getText().toString();
                x = Integer.parseInt(storeTemp);
                TextView updateScore = findViewById(R.id.score);
                String p = String.valueOf((int)algo(x));
                updateScore.setText(p);

            }
        });

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num = findViewById(R.id.numberOfInternalCubes);
                String storeTemporal = num.getText().toString();
                int y = Integer.parseInt(storeTemporal);
                TextView updateScore = findViewById(R.id.score1);
                if(y>2){
                    y -= 2;
                    String value = String.valueOf((int)algo(y));
                    updateScore.setText(value);

                }else {
                    updateScore.setText("Enter a value greater than 2");

                }

            }
        });

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num = findViewById(R.id.numberOfCubes2);
                String temporal = num.getText().toString();
                int z = Integer.parseInt(temporal);
                int w = z-2;
                int ans = ((int)algo(z)) - ((int)algo(w));
                String value = String.valueOf(ans);

                TextView update = findViewById(R.id.score2);
                update.setText(value);


            }
        });
       final ArrayList<DataSource> source = new ArrayList<>();

        final DataAdapter adapter = new DataAdapter(this,source);
        final ListView listView = findViewById(R.id.list);

        Button submit3 = findViewById(R.id.submit3);
        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num = findViewById(R.id.numberOfCubes3);
                String temporal = num.getText().toString();
                int n = Integer.parseInt(temporal);
                for (int i=n; i>=2; i-=2){
                    source.add(new DataSource(n));


                }

                listView.setAdapter(adapter);




            }
        });





    }

    private double algo(int n){
        double k = Math.pow(n,3);
        return k;
    }
    //public void submit(View view){
       // TextView score = (TextView)findViewById(R.id.score);
    //}
}
