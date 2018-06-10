package nyc.c4q.practical.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CardsApiService {
    public static final String BASE_URL = "http://deckofcardsapi.com/api/deck/";

    @GET("new/shuffle/")
    Call<ShuffleApiResponse> getShuffledCards();

    @GET("{deck_id}/draw/?count=2")
    Call<ShuffleApiResponse> getCards(@Path("deck_id") String cards, @Query("count") int numOfCards);
}
