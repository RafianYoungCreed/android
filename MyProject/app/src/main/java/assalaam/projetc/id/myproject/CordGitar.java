package assalaam.projetc.id.myproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CordGitar extends AppCompatActivity implements View.OnClickListener {

    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cord_gitar);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);

        Button ll = (Button) findViewById(R.id.DaftarLagu);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View DaftarLagu) {
                Intent myIntent = new
                        Intent(DaftarLagu.getContext(), DaftarLagu.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button rls = (Button) findViewById(R.id.profil);
        rls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View profil) {
                Intent myIntent = new
                        Intent(profil.getContext(), profil.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        CordGitar.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        // TODO Auto-generated method stub
                        dialog.cancel();
                    }
                }).show();
    }
}