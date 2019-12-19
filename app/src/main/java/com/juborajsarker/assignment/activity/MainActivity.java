package com.juborajsarker.assignment.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.juborajsarker.assignment.R;
import com.juborajsarker.assignment.api.Api;
import com.juborajsarker.assignment.fragments.CameraDeviceFragment;
import com.juborajsarker.assignment.fragments.WeatherStationFragment;
import com.juborajsarker.assignment.fragments.TrackersFragment;
import com.juborajsarker.assignment.json_class.MainStation;
import com.juborajsarker.assignment.utils.MyDialog;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String restUrl = "bins/o7epo/";

    boolean doubleBackToExitPressedOnce = false;

    List<MainStation> stationList = new ArrayList<>();

    public static List<MainStation> weatherStationsList = new ArrayList<>();
    public static List<MainStation> trackersList = new ArrayList<>();
    public static List<MainStation> cameraDeviceList = new ArrayList<>();

    MyDialog dialog;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = getResources().getString(R.string.dialog_message);
        dialog = new MyDialog(MainActivity.this, message, false);

        init();

    }

    private void init() {


        stationList.clear();
        weatherStationsList.clear();
        trackersList.clear();
        cameraDeviceList.clear();

        dialog.showDialog();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        Api api = retrofit.create(Api.class);
        Call<List<MainStation>> call = api.getStationList(restUrl);

        call.enqueue(new Callback<List<MainStation>>() {
            @Override
            public void onResponse(Call<List<MainStation>> call, Response<List<MainStation>> response) {

                if (response.isSuccessful()) {

                    List<MainStation> mainStationList = response.body();

                    for (int i = 0; i < mainStationList.size(); i++) {

                        MainStation mainStation = mainStationList.get(i);
                        stationList.add(mainStation);


                        if (mainStation.getInfo().getDeviceId() == 1 ||
                                mainStation.getInfo().getDeviceId() == 6 ||
                                mainStation.getInfo().getDeviceId() == 7 ||
                                mainStation.getInfo().getDeviceId() == 8 ||
                                mainStation.getInfo().getDeviceId() == 50 ||
                                mainStation.getInfo().getDeviceId() == 51){

                            weatherStationsList.add(mainStation);

                        }


                        if (mainStation.getInfo().getDeviceId() == 41 ){

                            trackersList.add(mainStation);

                        }



                        if (mainStation.getInfo().getDeviceId() == 70 ||
                                mainStation.getInfo().getDeviceId() == 71 ||
                                mainStation.getInfo().getDeviceId() == 72 ){

                            cameraDeviceList.add(mainStation);

                        }





                    }

                    Toast.makeText(MainActivity.this, "Data loaded successfully", Toast.LENGTH_SHORT).show();
                    dialog.dismissDialog();
                    setTab();

                } else {

                    Toast.makeText(MainActivity.this, "" + response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<MainStation>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error Found " + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });



    }




    private void setTab(){

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WeatherStationFragment(), "Weather");
        adapter.addFragment(new TrackersFragment(), "Trackers");
        adapter.addFragment(new CameraDeviceFragment(), "Camera Device");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }




    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Light_Dialog);
                } else {
                    builder = new AlertDialog.Builder(this);
                }
                builder.setTitle("Thanks for using my app")
                        .setMessage("Are you sure you want to really exit?")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                AppExit();
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();



            default:
                return super.onOptionsItemSelected(item);
        }


    }



    public void AppExit() {

        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


    }
}
