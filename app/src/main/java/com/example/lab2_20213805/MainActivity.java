package com.example.lab2_20213805;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

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
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_act,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.wifi) {
            Toast.makeText(this, "btn wifi presionado", Toast.LENGTH_LONG).show();
        } else if (itemId == R.id.add) {
            Toast.makeText(this, "btn add presionado", Toast.LENGTH_LONG).show();
        } else if (itemId == R.id.notify) {
            //Toast.makeText(this, "btn notify presionado", Toast.LENGTH_SHORT).show();
            Log.d ("msgOptAppBar", "App Bar onclik");
            View menuItemView = findViewById(R.id.notify);


            PopupMenu popupMenu =  new PopupMenu(this, menuItemView);
            popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    if (item.getItemId() == R.id.reply_all) {
                        Log.d ("msgPopup", "replyAll");
                        return true;
                    } else if (item.getItemId() == R.id.forward) {
                        Log.d ("msgPopup", "forward");
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            popupMenu.show();


        }

        return super.onOptionsItemSelected(item);
    }*/

}