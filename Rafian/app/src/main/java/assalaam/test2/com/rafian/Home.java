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

        Button ll = (Button) findViewById(R.id.LinearLayout);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), LinearLayout.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button rls = (Button) findViewById(R.id.RelativeLayoutSederhana);
        rls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativeLayoutSederhana) {
                Intent myIntent = new
                        Intent(RelativeLayoutSederhana.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button lt = (Button) findViewById(R.id.LayoutTable);
        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LayoutTable) {
                Intent myIntent = new
                        Intent(LayoutTable.getContext(), LayoutTable.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button tg = (Button) findViewById(R.id.TampilanGambar);
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View TampilanGambar) {
                Intent myIntent = new
                        Intent(TampilanGambar.getContext(), TampilanGambar.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button acs = (Button) findViewById(R.id.AutocompleteSederhana);
        acs.setOnClickListener(new View.OnClickListener() {
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

        Button cb = (Button) findViewById(R.id.ceckBox);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ceckBox) {
                Intent myIntent = new
                        Intent(ceckBox.getContext(), ceckBox.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button p = (Button) findViewById(R.id.Picker);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Picker) {
                Intent myIntent = new
                        Intent(Picker.getContext(), Picker.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button s = (Button) findViewById(R.id.Seleksi);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Seleksi) {
                Intent myIntent = new
                        Intent(Seleksi.getContext(), Seleksi.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button rb = (Button) findViewById(R.id.RadioButton);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button pe = (Button) findViewById(R.id.activity_pertama);
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pertama) {
                Intent myIntent = new
                        Intent(pertama.getContext(), Pertama.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button pa = (Button) findViewById(R.id.activity_playing_audio);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View playingAudio) {
                Intent myIntent = new
                        Intent(playingAudio.getContext(), playingAudio.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button cbb = (Button) findViewById(R.id.activity_calculator_berat_badan);
        cbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CalculatorBeratBadan) {
                Intent myIntent = new
                        Intent(CalculatorBeratBadan.getContext(), CalculatorBeratBadan.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button wv = (Button) findViewById(R.id.activity_webview);
        wv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View webview) {
                Intent myIntent = new
                        Intent(webview.getContext(), webview.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }
}
