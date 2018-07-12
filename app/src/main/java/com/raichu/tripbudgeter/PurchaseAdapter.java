package com.raichu.tripbudgeter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class PurchaseAdapter extends RecyclerView.Adapter<PurchaseAdapter.ViewHolder> {

    private Date[] dates;
    private float[] prices;
    private String[] purchasers;

    public PurchaseAdapter(Date[] dates, float[] prices, String[] purchasers) {
        this.dates = dates;
        this.prices = prices;
        this.purchasers = purchasers;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    @Override
    public PurchaseAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_card, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        DateFormat dateFormat = new SimpleDateFormat("EEE MMMMM dd, yyyy", Locale.CANADA);
        TextView dateView = (TextView) cardView.findViewById(R.id.date_text);
        dateView.setText(dateFormat.format(dates[position]));

    }

    @Override
    public int getItemCount() {
        return prices.length;
    }

}
