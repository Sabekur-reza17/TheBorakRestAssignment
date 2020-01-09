package com.sabekur2017.theborakrestassignment;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sabekur2017.theborakrestassignment.adapters.RequestRecyclerAdapter;
import com.sabekur2017.theborakrestassignment.models.TvChannelModel;
import com.sabekur2017.theborakrestassignment.service.RetrofitApiBuilder;
import com.sabekur2017.theborakrestassignment.service.TvApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private RequestRecyclerAdapter requestRecyclerAdapter;
   // private ArrayList<TvChannelModel.Request> requests=new ArrayList<>();
    List<TvChannelModel.Request> requestList;
    private String requestName;
    private TextView nameTv,url0Tv,url1Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        nameTv=findViewById(R.id.chanelName);
        url0Tv=findViewById(R.id.url_link_1);
        url1Tv=findViewById(R.id.url_link_2);
        TvApiService tvApiService=new RetrofitApiBuilder().getTvApiService();

        String key=String.format("%s",getString(R.string.api_key));
        Call<TvChannelModel> channelModelCall=tvApiService.getTvChannelModel(key);
        channelModelCall.enqueue(new Callback<TvChannelModel>() {
            @Override
            public void onResponse(Call<TvChannelModel> call, Response<TvChannelModel> response) {
                if(response.isSuccessful()){
                    TvChannelModel tvChannelModel=response.body();
                    String channelName=tvChannelModel.getName();
                  // ArrayList<TvChannelModel.Request> requestList=new ArrayList<>();
                    requestList=tvChannelModel.getRequests();
                    int requestSize=requestList.size();
                    Log.d(TAG,"SIZE :"+requestSize);
                    for(int i=0;i<requestList.size();i++){
                        String requestName=tvChannelModel.getRequests().get(i).getName();
                        String requestUrl=tvChannelModel.getRequests().get(i).getUrl();
                        Log.d(TAG, " requestName: "+requestName);
                        Log.d(TAG, " requestUrl: "+requestUrl);
                    }
                    //int requestListSize=requestList.size();

                  /*  String requestName0=tvChannelModel.getRequests().get(0).getName();
                    String requestUrl0=tvChannelModel.getRequests().get(0).getUrl();
                    String requestName1=tvChannelModel.getRequests().get(1).getName();
                    String requestUrl1=tvChannelModel.getRequests().get(1).getUrl();*/
                    Log.d(TAG, " name: "+channelName);
                   // Log.d(TAG,"requestSize :"+requestListSize);
                   /* Log.d(TAG,"rName0 :"+requestName0);
                    Log.d(TAG,"rName1 :"+requestName1);
                    Log.d(TAG,"RuRL0 :"+requestUrl0);
                    Log.d(TAG,"Rurl1 :"+requestUrl1);*/

                    String requestUrl0=tvChannelModel.getRequests().get(0).getUrl();
                    String requestUrl1=tvChannelModel.getRequests().get(1).getUrl();
                    nameTv.setText("Name : "+channelName);
                    url0Tv.setText("Url 1 :"+requestUrl0);
                    url1Tv.setText("Url 2 :"+requestUrl1);

                   TvChannelModel.Request request=new TvChannelModel.Request(requestName);
                    requestList.add(request);
                }
                requestRecyclerAdapter=new RequestRecyclerAdapter(getApplicationContext(),requestList);
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(linearLayoutManager);
               // recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL));
                recyclerView.setAdapter(requestRecyclerAdapter);

            }

            @Override
            public void onFailure(Call<TvChannelModel> call, Throwable t) {
                String error=t.getMessage();
                Log.d(TAG,"error"+error);

            }
        });
    }

}
