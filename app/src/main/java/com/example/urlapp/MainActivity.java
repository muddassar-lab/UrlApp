package com.example.urlapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText urlInput;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urlInput=findViewById(R.id.urlInput);
        btnSearch=findViewById(R.id.btnSearch);
    }


    public void search(View view) {
        String url=urlInput.getText().toString();
      boolean valid = URLUtil.isValidUrl(url);
      if(valid){
            Uri uri= Uri.parse(url);
          Intent intent=new Intent(Intent.ACTION_VIEW,uri);
          startActivity(intent);
      }
    }
}