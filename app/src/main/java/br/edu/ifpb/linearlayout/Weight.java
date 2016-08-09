package br.edu.ifpb.linearlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;

public class Weight extends Activity {

    @BindView(R.id.editText) EditText editText;
    @BindView(R.id.editText2) EditText editText2;
    @BindView(R.id.editText3) EditText editText3;
    @BindView(R.id.editText4) EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
    };

    public void metodoExemplo(View view){

        //EditText editText2 = (EditText) findViewById(R.id.editText2);
        Toast.makeText(this,editText2.getText().toString(), Toast.LENGTH_LONG).show();

    }

}
