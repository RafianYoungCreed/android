package assalaam.test2.com.rafian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pertama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertama);
        Button next = (Button) findViewById(R.id.Button1);
        next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),Kedua.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}