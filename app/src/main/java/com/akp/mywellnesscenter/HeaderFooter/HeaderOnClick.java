package com.akp.mywellnesscenter.HeaderFooter;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import android.widget.RelativeLayout;


import com.akp.mywellnesscenter.R;


public class HeaderOnClick extends RelativeLayout {

    String UserId, UserName;

    SharedPreferences sharedPreferences;

    public HeaderOnClick(Context context) {
        super(context);
    }

    public HeaderOnClick(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HeaderOnClick(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void initHeader() {
        inflateHeader();
    }

    private void inflateHeader() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.header, this);
        sharedPreferences = getContext().getSharedPreferences("login_preference", MODE_PRIVATE);
        UserId = sharedPreferences.getString("U_id", "");
        UserName = sharedPreferences.getString("U_name", "");


//
//        profile_ll.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (UserId.equalsIgnoreCase("")) {
//                    name_tv.setText("Login");
////                    Intent intent = new Intent(getContext(), LoginScreenAkp.class);
////                    getContext().startActivity(intent);
//                } else {
////                    Intent intent = new Intent(getContext(), SettingScreen.class);
////                    getContext().startActivity(intent);
//                }
//            }
//        });

    }



  /*  private void Plan_popup() {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = findViewById(android.R.id.content);
        //then we will inflate the custom alert dialog xml that we created
        View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.popup_plan, viewGroup, false);
        plan_rec = dialogView.findViewById(R.id.plan_rec);
        // on below line we are initializing our variables.
         switchView = dialogView.findViewById(R.id.idSwitch);
        statusTV = dialogView.findViewById(R.id.idTVStatus);

        GetProfile();
        // on below line we are checking
        // the status of switch
        if (switchView.isChecked()) {
            // on below line we are setting text
            // if switch is checked.
            statusTV.setText("Auto Mode ON");
        } else {
            // on below line we are setting the text
            // if switch is un checked
            statusTV.setText("Auto Mode OFF");
        }
        switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!UserId.equalsIgnoreCase("")){
                    // on below line we are adding check change listener for our switch.
                    // on below line we are checking
                    // if switch is checked or not.
                    if (isChecked) {
                        // on below line we are setting text
                        // if switch is checked.
                        statusTV.setText("Auto Mode ON");
                        AutoModeStatusUpdate("ON");

                    }
                    else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("AUTO MODE CONFIRMATION!")
                                .setMessage("Are You Sure Want To OFF Auto Mode?")
                                .setCancelable(false)
                                .setIcon(R.drawable.logo)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // on below line we are setting text
                                        // if switch is unchecked.
                                        statusTV.setText("Auto Mode OFF");
                                        AutoModeStatusUpdate("OFF");
                                        dialog.dismiss(); }});
                        builder.create().show();
                    }
                }
                else {
                    switchView.setClickable(false);
                    Toast.makeText(getContext(),"Login First",Toast.LENGTH_LONG).show();
                }
            } });


        arrayList.clear();
        GetPlanList();
        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
        //setting the view of the builder to our custom view that we already inflated
        builder1.setView(dialogView);
        //finally creating the alert dialog and displaying it
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }*/

}


    
