package th.ac.su.cp.homework3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import th.ac.su.cp.homework3.model.WordItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        WordItem[] items = {
                new WordItem(R.drawable.white_shark, "Great white shark","ปลาฉลามขาว"),
                new WordItem(R.drawable.whale_shark, "Whale shark","ปลาฉลามวาฬ"),
                new WordItem(R.drawable.tiger_shark, "Tiger shark","ปลาฉลามเสือ"),
                new WordItem(R.drawable.bull_shark, "Bull shark","ปลาฉลามหัวบาตร"),
                new WordItem(R.drawable.blacktip_reef_shark, "Blacktip reef shark","ปลาฉลามครีบดำ"),
                new WordItem(R.drawable.silvertip_shark, "Silvertip shark","ปลาฉลามครีบเงิน"),
                new WordItem(R.drawable.grey_reef_shark, "Grey reef shark","ปลาฉลามจ้าวมัน"),
                new WordItem(R.drawable.bamboo_cat_shark, "Bamboo cat shark","ปลาฉลามกบ"),
                new WordItem(R.drawable.thresher_shark, "Thresher shark","ปลาฉลามหางยาว"),
                new WordItem(R.drawable.gawr_gura_portrait, "Gawr Gura(HololiveEN)","กรอ กูร่า(โฮโลไลฟ์อิ้ง)")
        };

        public MyAdapter() {

        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_word/*บอกรูปแบบการแสดงผล*/, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }
        @Override//holder รับ vh
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.imageView.setImageResource(items[position].imageResId);
            holder.wordTextViewEn.setText(items[position].wordEn);
            holder.wordTextViewTh.setText(items[position].wordTh);
        }

        @Override
        public int getItemCount() {
            return items.length;//จำนวนครั้งการเตรียมแสดง item (บอกว่ามีไอเทมทั้งหมดกี่ชิ้น)
        }
        class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView wordTextViewEn;
            TextView wordTextViewTh;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                wordTextViewEn = itemView.findViewById(R.id.word_text_view_en);
                wordTextViewTh = itemView.findViewById(R.id.word_text_view_th);
            }
        }
    }
