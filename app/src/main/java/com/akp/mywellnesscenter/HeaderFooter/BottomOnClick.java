package com.akp.mywellnesscenter.HeaderFooter;

import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;

import com.akp.mywellnesscenter.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class BottomOnClick extends RelativeLayout {

    public static final String TAG = HeaderOnClick.class.getSimpleName();

    String UserId, UserName;

    public BottomOnClick(Context context) {
        super(context);
    }

    public BottomOnClick(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BottomOnClick(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void initHeader() {
        inflateHeader();
    }

    private void inflateHeader() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.bottom, this);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("login_preference", MODE_PRIVATE);
        UserId = sharedPreferences.getString("U_id", "");
        UserName = sharedPreferences.getString("U_name", "");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        break;
                    case R.id.cart:
                        break;
                    case R.id.shopping_bag:
                        break;
                    case R.id.llCategory:
//                        getContext().startActivity(new Intent(getContext(), CategoryActivity.class));
                        break;
                    case R.id.message:
                        break;
                    case R.id.user:
//                        getContext().startActivity(new Intent(getContext(), CustomerProfileActivity.class));
                        break;
                }
                return false;
            }
        });
        if (getContext() == null) {
            bottomNavigationView.setSelectedItemId(R.id.home); // change to whichever id should be default
        }
    }
}
