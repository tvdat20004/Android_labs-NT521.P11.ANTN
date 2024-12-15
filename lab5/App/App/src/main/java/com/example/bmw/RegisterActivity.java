package com.example.bmw;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bmw.utils.PasswordUtils;

public class RegisterActivity extends AppCompatActivity {

    private MySQLConnector databaseHelper;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextEmail;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        databaseHelper = new MySQLConnector(this);

        editTextUsername = findViewById(R.id.txtUsernameRegister);
        editTextPassword = findViewById(R.id.txtPassRegister);
        editTextEmail = findViewById(R.id.txtEmailRegister);
        btnRegister = findViewById(R.id.btnRegisterreal);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String hashedPassword = PasswordUtils.hashPassword(password);

        if (username.isEmpty() || password.isEmpty()|| email.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (databaseHelper.checkUser(email)) {
            Toast.makeText(this, "Email already exists", Toast.LENGTH_SHORT).show();
            return;
        }


        // Check user with ori pass
//        if(databaseHelper.checkUser(username, password)){
//            Toast.makeText(this, "User already exists", Toast.LENGTH_SHORT).show();
//            return;
//        }

        // Check user with hashed pass
        if(databaseHelper.checkUser(username, hashedPassword)){
            Toast.makeText(this, "User already exists", Toast.LENGTH_SHORT).show();
            return;
        }

        if (hashedPassword == null) {
            Toast.makeText(this, "Error in password hashing", Toast.LENGTH_SHORT).show();
            return;
        }

        Log.d("Pass hashed: ", hashedPassword);

        User user = new User();
        user.setName(username);
        user.setEmail(email);

        // Save ori pass
//        user.setPassword(password);

        // Save hashed pass
        user.setPassword(hashedPassword);

        databaseHelper.addUser(user);

        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
        finish();
    }

}