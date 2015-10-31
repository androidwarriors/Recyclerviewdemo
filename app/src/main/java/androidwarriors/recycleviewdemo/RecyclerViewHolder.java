package androidwarriors.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.list_title);
        tv2= (TextView) itemView.findViewById(R.id.list_desc);
        imageView= (ImageView) itemView.findViewById(R.id.list_avatar);

    }
}
