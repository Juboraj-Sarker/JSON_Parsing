package com.juborajsarker.assignment.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.juborajsarker.assignment.R;
import com.juborajsarker.assignment.json_class.MainStation;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private List<MainStation> mainStationList;
    private RecyclerView recyclerView;
    private String type;

    public CustomAdapter(Context context, List<MainStation> mainStationList, RecyclerView recyclerView, String type) {
        this.context = context;
        this.mainStationList = mainStationList;
        this.recyclerView = recyclerView;
        this.type = type;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView ivDeviceType;

        public TextView tvStationId;
        public TextView tvCustomName;
        public TextView tvDeviceType;

        public TextView tvLastCommunication;
        public TextView tvNetworkSignalQuality;
        public TextView tvBattery;
        public TextView tvAirTemperature;
        public TextView tvRelativeHumidity;
        public TextView rainIn24H;


        public CardView cvFullChild;
        public CardView cvBottomChild;

        public LinearLayout layoutLastCommunication;
        public LinearLayout layoutNetworkQuality;
        public LinearLayout layoutBattery;
        public LinearLayout layoutAir;
        public LinearLayout layoutHumidity;
        public LinearLayout layoutRain;

        public MyViewHolder(@NonNull View view) {
            super(view);

            ivDeviceType = (ImageView) view.findViewById(R.id.iv_device_type);

            tvStationId = (TextView) view.findViewById(R.id.tv_station_id);
            tvCustomName = (TextView) view.findViewById(R.id.tv_custom_name);
            tvDeviceType = (TextView) view.findViewById(R.id.tv_device_type);

            tvLastCommunication = (TextView) view.findViewById(R.id.tv_last_communication);
            tvNetworkSignalQuality = (TextView) view.findViewById(R.id.tv_network_signal_quality);
            tvBattery = (TextView) view.findViewById(R.id.tv_battery);
            tvAirTemperature = (TextView) view.findViewById(R.id.tv_air_temperature);
            tvRelativeHumidity = (TextView) view.findViewById(R.id.tv_relative_humidity);
            rainIn24H = (TextView) view.findViewById(R.id.tv_rain);


            cvFullChild = (CardView) view.findViewById(R.id.cv_full_child);
            cvBottomChild = (CardView) view.findViewById(R.id.cv_bottom_child);

            layoutLastCommunication = (LinearLayout) view.findViewById(R.id.layout_last_communication);
            layoutNetworkQuality = (LinearLayout) view.findViewById(R.id.layout_network);
            layoutBattery = (LinearLayout) view.findViewById(R.id.layout_battery);
            layoutAir = (LinearLayout) view.findViewById(R.id.layout_temperature);
            layoutHumidity = (LinearLayout) view.findViewById(R.id.layout_humidity);
            layoutRain = (LinearLayout) view.findViewById(R.id.layout_rain);


        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_child, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        MainStation station = mainStationList.get(position);

        String deviceId = "Device ID: " + station.getInfo().getDeviceId();
        String customName = "Custom Name: " + station.getName().getCustom();
        String deviceName = "Device Type: " + station.getInfo().getDeviceName();




        String lastCommunication = "";
        String networkSignal = "" ;
        String battery = "" ;
        String airTemp = "" ;
        String humidity = "" ;
        String rain = "";
        String batteryFlag = "";

        try {
            lastCommunication = ""+ station.getDates().getLastCommunication();
            networkSignal = "" + station.getNetworking().getRssiPct();
            battery = "" + station.getMeta().getBattery();
            airTemp = "" + station.getMeta().getAirTemp();
            humidity = "" + station.getMeta().getRh();
            rain = "" + station.getMeta().getRain24h().getSum();

        }catch (Exception e){

            e.printStackTrace();
        }



        holder.tvStationId.setText(deviceId);
        checkValidityAndHide(holder.tvCustomName, station.getName().getCustom());
        holder.tvDeviceType.setText(deviceName);


        checkValidityAndHide(holder.tvLastCommunication, lastCommunication, holder.layoutLastCommunication, "last_communication");
        checkValidityAndHide(holder.tvNetworkSignalQuality, networkSignal, holder.layoutNetworkQuality, "network_signal");
        checkValidityAndHide(holder.tvBattery, battery, holder.layoutBattery, "battery");
        checkValidityAndHide(holder.tvAirTemperature, airTemp, holder.layoutAir, "air");
        checkValidityAndHide(holder.tvRelativeHumidity, humidity, holder.layoutHumidity, "humidity");
        checkValidityAndHide(holder.rainIn24H, rain, holder.layoutRain, "rain");

        if (type.equals("weather")){

            holder.ivDeviceType.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_weather));

        }else if (type.equals("trackers")){

            holder.ivDeviceType.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_tracker));

        }else if (type.equals("camera")){

            holder.ivDeviceType.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_camera));
        }


        holder.cvFullChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (holder.cvBottomChild.getVisibility() == View.GONE){

                    holder.cvBottomChild.setVisibility(View.VISIBLE);

                }else {

                    holder.cvBottomChild.setVisibility(View.GONE);
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return mainStationList.size();
    }


    private void checkValidityAndHide(TextView textView, String value){

        if (value.equals("") || value.contains("null") ){

            textView.setVisibility(View.GONE);

        }else {

            textView.setVisibility(View.VISIBLE);
            textView.setText("Custom Name: "+value);
        }

    }


    private void checkValidityAndHide(TextView textView, String value, LinearLayout layout, String type){

        if (value.equals("") || value.contains("null") ){

            layout.setVisibility(View.GONE);

        }else {

            if (type.equals("network_signal")){

                layout.setVisibility(View.VISIBLE);
                textView.setText(":"+value + "%");

            }else if (type.equals("battery")){

                String flag = getBatteryFlag(Integer.parseInt(value));
                layout.setVisibility(View.VISIBLE);
                textView.setText(":"+value + " (" + flag + ")");

            }else {

                layout.setVisibility(View.VISIBLE);
                textView.setText(":"+value);
            }

        }

    }


    private String getBatteryFlag(int value){

        String flag = "";
        if (value < 5800){

            flag = "EMPTY";

        }else if (value > 6700){

            flag = "FULL";

        }else {

            flag = "NORMAL";
        }

        return flag;
    }


}
