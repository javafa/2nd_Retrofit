package com.veryworks.android.remoteretrofit;

import com.veryworks.android.remoteretrofit.domain.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by pc on 3/7/2017.
 */

public interface SeoulOpenService {
    // full address - http://openapi.seoul.go.kr:8088/4c425976676b6f643437665377554c/json/SearchParkingInfo/1/10/
    @GET("4c425976676b6f643437665377554c/json/SearchParkingInfo/1/1000/{gu}")
    Call<Data> getData(@Path("gu") String value);
}
