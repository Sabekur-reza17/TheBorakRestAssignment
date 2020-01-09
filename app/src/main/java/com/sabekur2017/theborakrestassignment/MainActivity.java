package com.sabekur2017.theborakrestassignment;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.sabekur2017.theborakrestassignment.models.TvChannelModel;
import com.sabekur2017.theborakrestassignment.service.RetrofitApiBuilder;
import com.sabekur2017.theborakrestassignment.service.TvApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TvApiService tvApiService=new RetrofitApiBuilder().getTvApiService();

        String key=String.format("%s",getString(R.string.api_key));
        Call<TvChannelModel> channelModelCall=tvApiService.getTvChannelModel(key);
        channelModelCall.enqueue(new Callback<TvChannelModel>() {
            @Override
            public void onResponse(Call<TvChannelModel> call, Response<TvChannelModel> response) {
                if(response.isSuccessful()){
                    TvChannelModel tvChannelModel=response.body();
                    String channelName=tvChannelModel.getName();
                    List<TvChannelModel.Request> requestList=tvChannelModel.getRequests();
                    int requestListSize=requestList.size();

                    String requestName0=tvChannelModel.getRequests().get(0).getName();
                    String requestUrl0=tvChannelModel.getRequests().get(0).getUrl();
                    String requestName1=tvChannelModel.getRequests().get(1).getName();
                    String requestUrl1=tvChannelModel.getRequests().get(1).getUrl();
                    Log.d(TAG, " name: "+channelName);
                    Log.d(TAG,"requestSize :"+requestListSize);
                    Log.d(TAG,"rName0 :"+requestName0);
                    Log.d(TAG,"rName1 :"+requestName1);
                    Log.d(TAG,"RuRL0 :"+requestUrl0);
                    Log.d(TAG,"Rurl1 :"+requestUrl1);


                }
            }

            @Override
            public void onFailure(Call<TvChannelModel> call, Throwable t) {
                String error=t.getMessage();
                Log.d(TAG,"error"+error);

            }
        });
    }
}
