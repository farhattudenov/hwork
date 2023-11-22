package com.geeks.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText, passwordEditText;
    private Button loginButton;
    private TextView welcomeText;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = findViewById(R.id.editText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        welcomeText = findViewById(R.id.welcomeText);

        loginButton.setOnClickListener(v -> onClick(v));
    }

    private <LoginActivity> void onClick(View v) {
        String login = editText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Неправильный логин и пароль
        if (login.equals("admin") && password.equals("admin")) {
            // Правильный логин и пароль
            Toast.makeText(MainActivity.this,
                    "Вы успешно зарегистрировались",
                    Toast.LENGTH_SHORT).show();
            welcomeText.setVisibility(View.VISIBLE);
            editText.setVisibility(View.GONE);
            passwordEditText.setVisibility(View.GONE);
            loginButton.setVisibility(View.GONE);
        } else {
            Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
        }
    }
}
