package com.example.ntutcsie.app01_105590022;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtgrade;
    private Button mBtnOK;
    private TextView mTxtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtgrade = (EditText) findViewById(R.id.grade);
        mBtnOK = (Button) findViewById(R.id.btnOK);
        mTxtR = (TextView) findViewById(R.id.textView);

        mBtnOK.setOnClickListener(btnOKOnClick);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            int score = Integer.parseInt(mEdtgrade.getText().toString());

            String strgrade = getString(R.string.grade);

                if (score > 100) {
                    strgrade += getString(R.string.grade100);
                } else if (100 >= score || score> 90) {
                    strgrade += getString(R.string.grade90);
                }  else if (89 >= score || score> 80){
                    strgrade += getString(R.string.grade80);
                } else if (79 >= score || score> 70){
                    strgrade += getString(R.string.grade70);
                } else if (69 >= score || score> 60){
                    strgrade += getString(R.string.grade60);
                } else if (59 >= score || score>= 0){
                    strgrade += getString(R.string.grade50);
                } else if (score<0) {
                    strgrade += getString(R.string.grade0);
                }


            mTxtR.setText(strgrade);
        }
    };
}