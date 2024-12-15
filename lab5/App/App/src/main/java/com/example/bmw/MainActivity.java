package com.example.bmw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bmw.utils.PasswordUtils;

public class MainActivity extends AppCompatActivity {

    private Button btnlogin;
    private Button btnregister;


    private MySQLConnector databaseHelper;
    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.txtUsernameLogin);
        editTextPassword = findViewById(R.id.txtPasswordLogin);
        btnlogin = findViewById(R.id.btnLogin);
        btnregister = findViewById(R.id.btnRegister);

        databaseHelper = new MySQLConnector(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserLogin();
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentregister = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intentregister);
            }
        });

    }

    private void UserLogin() {

        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String hashedPassword = PasswordUtils.hashPassword(password);

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show();
            return;
        }


        if (hashedPassword == null) {
            Toast.makeText(this, "Error in password hashing", Toast.LENGTH_SHORT).show();
            return;
        }

        // Login with ori pass
//        if (databaseHelper.checkUser(username, password)) {
//            Intent intentLogin = new Intent(MainActivity.this, DisplayActivity.class);
//            intentLogin.putExtra("USERNAME", username);
//            startActivity(intentLogin);
//        } else {
//            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
//        }

        // Login with hashed pass
        if (databaseHelper.checkUser(username, hashedPassword)) {
            Intent intentLogin = new Intent(MainActivity.this, DisplayActivity.class);
            intentLogin.putExtra("USERNAME", username);
            startActivity(intentLogin);
        } else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }

    }
}