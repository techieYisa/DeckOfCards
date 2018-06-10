package nyc.c4q.practical.presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import nyc.c4q.practical.R;

public class CardsRVAdapter extends RecyclerView.Adapter<CardsRVAdapter.CardsViewHolder> {
    private List<String> cardUrls;

    public CardsRVAdapter(List<String> cardUrls) {this.cardUrls = cardUrls; }

    @NonNull
    @Override
    public CardsRVAdapter.CardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_item_view, parent, false);
        return new CardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardsRVAdapter.CardsViewHolder holder, int position) {
        holder.bindImage(cardUrls.get(position));
    }

    @Override
    public int getItemCount() {
        return cardUrls.size();
    }

    static class CardsViewHolder extends RecyclerView.ViewHolder{
        private ImageView cardImageView;

        public CardsViewHolder(View itemView) {
            super(itemView);

            cardImageView = itemView.findViewById(R.id.card_image);
        }

        void bindImage(String cardUrl) {
            Picasso.get().load(cardUrl).into(cardImageView);
        }
    }
}
