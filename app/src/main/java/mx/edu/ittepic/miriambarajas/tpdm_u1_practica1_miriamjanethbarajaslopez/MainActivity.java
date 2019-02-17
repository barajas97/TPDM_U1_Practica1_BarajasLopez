package mx.edu.ittepic.miriambarajas.tpdm_u1_practica1_miriamjanethbarajaslopez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Spinner state;
    Spinner brand;
    CheckBox agree;
    Button send;
    TextView label;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.nombre);
        state=findViewById(R.id.estado);
        brand=findViewById(R.id.marca);
        agree=findViewById(R.id.aceptar);
        send=findViewById(R.id.enviar);
        label=findViewById(R.id.etiqueta);
    }

    public void envioDatos (View e){
        String mensaje = "Hola "+name.getText()+". Gracias por calificar a "+brand.getSelectedItem().toString()+", saludos hasta "+state.getSelectedItem().toString();
        if (agree.isChecked()){
            name.setText("");
            label.setText(mensaje);
        }
        else {
            Toast.makeText(this,"Es necesario aceptar los términos y condiciones",Toast.LENGTH_LONG).show();
        }
    }
}
