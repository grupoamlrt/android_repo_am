package fiap.com.br.pointcred;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText et_Email, et_Senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_Email = (EditText) findViewById(R.id.et_Email);
        et_Senha = (EditText) findViewById(R.id.et_Senha);
    }

    public void Entrar(View v){

        if(et_Email.getText().toString().equalsIgnoreCase("fiap") &&
                et_Senha.getText().toString().equalsIgnoreCase("fiap")){
            Intent intent = new Intent(this, PrimeiraTelaActivity.class);
            startActivity(intent);
        }
    }

    public void CriarConta(View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void Sobre(View view){
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }
}
