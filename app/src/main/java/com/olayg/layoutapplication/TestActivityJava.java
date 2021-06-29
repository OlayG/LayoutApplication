package com.olayg.layoutapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.olayg.layoutapplication.databinding.ActivityTestBinding;

public class TestActivityJava extends AppCompatActivity {

    private ActivityTestBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*
           How to toggle error for TextInputLayout
        binding.password.setError("Testing error feature");
        binding.password.setErrorEnabled(true);

        */


        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = "";
                if (binding.username.getEditText() != null) {
                    username = binding.username.getEditText().getText().toString();
                }

                String password = "";
                if (binding.password.getEditText() != null) {
                    password = binding.password.getEditText().getText().toString();
                }

                // This is an example of a Explicit Intent to navigate from current activity to another activity
                Intent navigationIntent = new Intent(TestActivityJava.this, TestActivityKt.class);
                // This is an example of passing data from 1 activity to another
                navigationIntent.putExtra(Constant.EXTRA_USERNAME, username);
                startActivity(navigationIntent);
            }
        });

        /*binding.btnLogin.setOnClickListener(v -> {
            //Intent navigationIntent = new Intent(this, TestActivityKt.class);

        });*/

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
