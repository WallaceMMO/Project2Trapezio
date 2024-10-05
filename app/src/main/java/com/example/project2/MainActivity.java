/*
*@author:<Wallace Moura Machado de Oliveira;1110482413004>
 */

package com.example.project2;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnCalcular = (Button)findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ma = Integer.parseInt(((EditText)findViewById(R.id.txtMa)).getText().toString());
                int me = Integer.parseInt(((EditText)findViewById(R.id.txtMe)).getText().toString());
                int alt = Integer.parseInt(((EditText)findViewById(R.id.txtAlt)).getText().toString());

                int area = ((ma+me)*alt)/2;

                TextView lblAns = (TextView)findViewById(R.id.lblAns);


                lblAns.setText("A área do trapézio é: " + area);
            }
        });
    }
}