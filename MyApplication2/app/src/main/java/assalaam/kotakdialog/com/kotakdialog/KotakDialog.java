package assalaam.kotakdialog.com.kotakdialog;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.widget.LinearLayout;
        import android.widget.RadioGroup;

public class KotakDialog extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup orientation;
    RadioGroup gravity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak_dialog);

        orientation = (RadioGroup) findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity = (RadioGroup) findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);

    }

    public void onCheckedChanged(RadioGroup group, int checkId) {
        switch (checkId){
            case R.id.horizontal:
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;
            case R.id.vertical:
                orientation.setOrientation(LinearLayout.VERTICAL);
                break;
            case R.id.kiri:
                gravity.setGravity(Gravity.LEFT);
                break;
            case R.id.tengah:
                gravity.setGravity(Gravity.CENTER);
                break;
            case R.id.kanan:
                gravity.setGravity(Gravity.RIGHT);

                break;
        }

    }
}
