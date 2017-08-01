package assalaam.test2.com.rafian;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button lls = (Button) findViewById(R.id.LinearLayout);
        lls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), LinearLayout.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button llt = (Button) findViewById(R.id.RelativeLayoutSederhana);
        llt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativeLayoutSederhana) {
                Intent myIntent = new
                        Intent(RelativeLayoutSederhana.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button uu = (Button) findViewById(R.id.LayoutTable);
        uu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LayoutTable) {
                Intent myIntent = new
                        Intent(LayoutTable.getContext(), LayoutTable.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ga = (Button) findViewById(R.id.TampilanGambar);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View TampilanGambar) {
                Intent myIntent = new
                        Intent(TampilanGambar.getContext(), TampilanGambar.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ta = (Button) findViewById(R.id.AutocompleteSederhana);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View AutocompleteSederhana) {
                Intent myIntent = new
                        Intent(AutocompleteSederhana.getContext(), AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button kd = (Button) findViewById(R.id.KotakDialog);
        kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View KotakDialog) {
                Intent myIntent = new
                        Intent(KotakDialog.getContext(), KotakDialog.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button aa = (Button) findViewById(R.id.ceckBox);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ceckBox) {
                Intent myIntent = new
                        Intent(ceckBox.getContext(), ceckBox.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button bb = (Button) findViewById(R.id.Picker);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Picker) {
                Intent myIntent = new
                        Intent(Picker.getContext(), Picker.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button cc = (Button) findViewById(R.id.Seleksi);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Seleksi) {
                Intent myIntent = new
                        Intent(Seleksi.getContext(), Seleksi.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button dd = (Button) findViewById(R.id.RadioButton);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button ii = (Button) findViewById(R.id.activity_pertama);
        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pertama) {
                Intent myIntent = new
                        Intent(pertama.getContext(), Pertama.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button qq = (Button) findViewById(R.id.activity_playing_audio);
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View playingAudio) {
                Intent myIntent = new
                        Intent(playingAudio.getContext(), playingAudio.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
