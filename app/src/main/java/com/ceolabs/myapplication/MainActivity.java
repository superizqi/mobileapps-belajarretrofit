package com.ceolabs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.TextView;

import com.ceolabs.myapplication.model.Items;
import com.ceolabs.myapplication.rest.ApiClient;
import com.ceolabs.myapplication.rest.ApiInterface;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvSubuh)
    TextView tvSubuh;

    @BindView(R.id.tvZuhur)
    TextView tvZuhur;

    @BindView(R.id.tvAshar)
    TextView tvAshar;

    @BindView(R.id.tvMagrhib)
    TextView tvMagrhib;

    @BindView(R.id.tvIsya)
    TextView tvIsya;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLoadData)
    void actionLoadData(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Items> call = apiService.getJadwalSholat("jakarta");

        call.enqueue(new Callback<Items>() {

                     }
        )




    }
}
