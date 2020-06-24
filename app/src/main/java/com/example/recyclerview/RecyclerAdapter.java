package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<RecyclerModel> recyclerModelList;
    private Boolean recyclerList;

    public RecyclerAdapter(List<RecyclerModel> recyclerModelList, Boolean recyclerList) {
        this.recyclerModelList = recyclerModelList;
        this.recyclerList = recyclerList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int position) {
        String title = recyclerModelList.get(position).getTitle();
        String description = recyclerModelList.get(position).getDescription();
        int imageUrl = recyclerModelList.get(position).getImageUrl();
        viewHolder.setData(title, description, imageUrl);
    }

    @Override
    public int getItemCount() {
        return recyclerModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView Image;
        private TextView Title;
        private TextView Description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.image);
            Title = itemView.findViewById(R.id.title_text);
            Description = itemView.findViewById(R.id.description);
        }

        public void setData(final String title, String description, int imageUrl) {
            Image.setImageResource(imageUrl);
            Title.setText(title);
            Description.setText(description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), title, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
