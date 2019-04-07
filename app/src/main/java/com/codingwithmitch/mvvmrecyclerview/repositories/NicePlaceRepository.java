package com.codingwithmitch.mvvmrecyclerview.repositories;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.codingwithmitch.mvvmrecyclerview.StoreApi;
import com.codingwithmitch.mvvmrecyclerview.models.NicePlace;
import com.codingwithmitch.mvvmrecyclerview.models.ResponseInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Singleton pattern
 */
public class NicePlaceRepository {

    private static NicePlaceRepository instance;
    public static final String BASE_URL = "";
    private ArrayList<NicePlace> dataSet = new ArrayList<>();
    private static Retrofit retrofit = null;

    public static NicePlaceRepository getInstance(){
        if(instance == null){
            instance = new NicePlaceRepository();
        }
        return instance;
    }

    public static Retrofit getRetrofitClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    //execute call back in background thread
                    .callbackExecutor(Executors.newSingleThreadExecutor())
                    .build();
        }
        return retrofit;
    }

    // Pretend to get data from a webservice or online source
    public MutableLiveData<List<NicePlace>> getNicePlaces(){
//        setNicePlaces();
        getStoreInfo();
        MutableLiveData<List<NicePlace>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        Log.d("Data-return"," "+data);
        return data;
    }

    public void getStoreInfo() { // team id = 8AvmG2oF6ryalW

        Log.d("Store-info", "PROCESSING IN THREAD BEFORE RETROFIT CALL " + Thread.currentThread().getName());
        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setTeamId("8AvmG2oF6ryalW");
        Call<List<ResponseInfo>> call = getRetrofitClient().create(StoreApi.class).getStoreInfo(responseInfo.getTeamId());

        //rest service call runs on background thread and Callback also runs on background thread
        call.enqueue(new Callback<List<ResponseInfo>>() {
            @Override
            public void onResponse(Call<List<ResponseInfo>> call, Response<List<ResponseInfo>> response) {
                Log.d("ResponseInfo : ",""+response.code());

                List<ResponseInfo> responseInfos = response.body();
                for(int i = 0 ; i < responseInfos.size() ; i++){
                    Log.d("Response-body : ",""+responseInfos.get(i).getCTAImageUrl());
                    NicePlace nicePlace = new NicePlace(responseInfos.get(i).getCTAImageUrl(),responseInfos.get(i).getCreatedBy());
                    dataSet.add(nicePlace);
//                    mNicePlaces.postValue(dataSet);
                    Log.d("Data-set"," "+dataSet.get(i));
                }

            }

            @Override
            public void onFailure(Call<List<ResponseInfo>> call, Throwable t) {
                Log.e("Response-Failed", "Error RETROFIT" +t.getMessage());
            }
        });
    }
}









