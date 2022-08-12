package com.example.imdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b_signIn;
    private Intent intent;
    TextView search , MyList ;
    private TextView MyAccount;
    ImageButton search2, list , mylist ,myaccount;
    ImageButton back, account;
    Button logout, save ;
   private EditText username , password;
    private TextView username2,password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.edt_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                listfragment listfragment = new listfragment();
                FragmentTransaction replace = ft.replace(R.id.cv_fra2, listfragment);
                ft.addToBackStack(null);
                ft.commit();
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);
            }
        });
         MyList= findViewById(R.id.tv_mylist);
        MyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                textfragment textfragment = new textfragment();
                FragmentTransaction replace = ft.replace(R.id.cv_fra, textfragment);
                ft.addToBackStack(null);
                ft.commit();
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);
            }
        });
        MyAccount = findViewById(R.id.tv_account);
        MyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                listfragment listfragment = new listfragment();
                FragmentTransaction replace = ft.replace(R.id.cv_fra, listfragment);
                ft.addToBackStack(null);
                ft.commit();
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);
            }
        });
        b_signIn = findViewById(R.id.b_signIn);
        b_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        save = findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
        logout = findViewById(R.id.btn_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
        back = findViewById(R.id.ig_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
        search2 = findViewById(R.id.ib_search);
        search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
        mylist= findViewById(R.id.ib_mylist);
        mylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
        myaccount = findViewById(R.id.ib_account);
        myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
        list = findViewById(R.id.ib_mylist);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainPage.class);
                startActivity(intent);

            }
        });
    }
   }