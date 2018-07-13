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

    private float[] prices;
    private String[] buyers;
    private String[] payers;

    public PurchaseAdapter(float[] prices, String[] buyers, String[] payers) {
        this.prices = prices;
        this.buyers = buyers;
        this.payers = payers;
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

        /*DateFormat dateFormat = new SimpleDateFormat("EEE MMMMM dd, yyyy", Locale.CANADA);
        TextView dateView = (TextView) cardView.findViewById(R.id.date_text);
        dateView.setText(dateFormat.format(dates[position]));*/

        TextView priceView = (TextView) cardView.findViewById(R.id.price_text);
        priceView.setText("$" + Float.toString(prices[position]));

        TextView buyerView = (TextView) cardView.findViewById(R.id.buyer_text);
        buyerView.setText(buyers[position]);

        TextView payerView = (TextView) cardView.findViewById(R.id.payer_text);
        payerView.setText(payers[position]);

    }

    @Override
    public int getItemCount() {
        return prices.length;
    }

}
