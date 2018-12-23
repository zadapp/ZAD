package com.example.dell.zad.customer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.zad.ProductItems;
import com.example.dell.zad.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

public class HomeCustomer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_customer);
        RecyclerView rvProductList = findViewById(R.id.rv_productList);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL,false);

    }
    class MyHolder extends RecyclerView.ViewHolder{
        ImageView ivProduct;
        TextView tvProductName , tvProductPrice;
        Button btnAddToCrt;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ivProduct=itemView.findViewById(R.id.iv_product);
            tvProductName=itemView.findViewById(R.id.tv_productName);
            tvProductPrice=itemView.findViewById(R.id.tv_productPrice);
            btnAddToCrt=itemView.findViewById(R.id.btn_addToCart);
        }
    }
    class MyAdapter extends RecyclerView.Adapter<MyHolder>{
        Context context;
        ArrayList<ProductItems> productItemsArrayList;

        public MyAdapter(Context context, ArrayList<ProductItems> productItemsArrayList) {
            this.context = context;
            this.productItemsArrayList = productItemsArrayList;
        }

        public Context getContext() {
            return context;
        }

        public void setContext(Context context) {
            this.context = context;
        }


        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           // View convertView =layoutInflater.inflate(R.layout.rv_item_product,parent,false);
            View convertView =layoutInflater.inflate(R.layout.rv_item_product,viewGroup,false);
            return new MyHolder(convertView);
        }

        @Override
        public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {
            ProductItems productItems =productItemsArrayList.get(i);
            myHolder.tvProductName.setText(productItems.getProductName());
            myHolder.tvProductPrice.setText(productItems.getProductPrice());
            Picasso.with(context).load(productItems.getProductImaage()).into(myHolder.ivProduct);
            myHolder.btnAddToCrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //code to take info and add it into cart
                    Toast.makeText(context, myHolder.tvProductName+" Added To Cart", Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return productItemsArrayList.size();
        }
    }
}
