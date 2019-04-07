package com.codingwithmitch.mvvmrecyclerview;

import com.codingwithmitch.mvvmrecyclerview.models.ResponseInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StoreApi {
    @GET("/channels/{teamId}/fan/teamchannels") //https://staging-api-avaloq.vdrop.com/channels/kO16fdw1BmnZWM/fan/teamchannels
    Call<List<ResponseInfo>> getStoreInfo(@Path("teamId") String teamId);

}
