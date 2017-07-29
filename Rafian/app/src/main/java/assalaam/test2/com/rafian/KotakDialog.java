package assalaam.test2.com.rafian;

import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class KotakDialog extends AppCompatActivity implements View.OnClickListener{
    Button pesanToast;
    Button keluar;
    Button tampilList;
    /**called when the activity is first created*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak_dialog);

        pesanToast = (Button) findViewById(R.id.toastBtn);
        pesanToast.setOnClickListener(this);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);

        tampilList = (Button) findViewById(R.id.listDialogBtn);
    }

    @Override
    public void onClick(View cliked) {
        switch (cliked.getId()){
            case R.id.listDialogBtn:
                munculListDialog();
                break;
            case R.id.toastBtn:
                Toast.makeText(this, "kamu memilih toast",Toast.LENGTH_SHORT).show();
                break;
            case R.id.exitBtn:
                exit();
                break;
        }

    }

    private void munculListDialog(){
        final CharSequence[] items = {"Es Teh","Es Jeruk","Lemon Squash","Soft drink"};

        AlertDialog.Builder kk = new AlertDialog.Builder(this);
        kk.setTitle("Pilih Minuman");
        kk.setItems(items, new  DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int item) {
                Toast.makeText(getApplicationContext(),items[item],
                Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
    private void exit(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("apakah Kamu Benar-benar ingin keluar ?")
                .setCancelable(false)
                .setPositiveButton("ya", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog,int id){
                KotakDialog.this.finish();
            }
        })
                .setNegativeButton("tidak", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int arg1){
                        dialog.cancel();
                    }
                }).show();
    }
}
