package com.example.restclient.bannerlist

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.restclient.App
import com.example.restclient.R
import com.example.restclient.model.BannerResponse
import com.example.restclient.model.ProductParms
import com.example.restclient.model.ProductResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressDialog = ProgressDialog(this)
        banner_list_rv.layoutManager = LinearLayoutManager(this)
        makeRestCall()
    }

    private fun makeRestCall() {
        progressDialog.show()
        (application as App).api
                .getBanners()
                .enqueue(object : Callback<BannerResponse> {
                    override fun onFailure(call: Call<BannerResponse>, t: Throwable) {
                        progressDialog.hide()
                        Toast.makeText(this@MainActivity, "error", Toast.LENGTH_SHORT).show()
                    }

                    override fun onResponse(call: Call<BannerResponse>, response: Response<BannerResponse>) {
                        val bannerList = response.body()?.data
                        if (bannerList != null)
                            banner_list_rv.adapter = BannerListAdapter(bannerList)
                        else Toast.makeText(this@MainActivity, "no data", Toast.LENGTH_SHORT).show()
                        progressDialog.hide()
                    }
                })
        (application as App).api
                .getProducts(ProductParms(1,2,"seller"))
                .enqueue(object : Callback<ProductResponse>{
                    override fun onFailure(call: Call<ProductResponse>, t: Throwable) {

                    }

                    override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                    }
                })

    }
}
