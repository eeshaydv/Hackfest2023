package com.example.medhere.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.example.medhere.R;
import com.example.medhere.models.MedicineReminder;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MedicineReminderAdapter extends RecyclerView.Adapter<MedicineReminderAdapter.HolderCallHistory>{

    private Context context;
    private ArrayList<MedicineReminder> medicineReminders;
    private TextDrawable mDrawableBuilder;
    private DatabaseReference CallRef;

    public MedicineReminderAdapter(Context context, ArrayList<MedicineReminder> medicineReminders) {
        this.context = context;
        this.medicineReminders = medicineReminders;
    }

    @NonNull
    @Override
    public HolderCallHistory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.medicine_item_view, parent, false);

        return new MedicineReminderAdapter.HolderCallHistory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderCallHistory holder, int position) {

    }

    @Override
    public int getItemCount() {
        return medicineReminders.size();
    }


    class HolderCallHistory extends RecyclerView.ViewHolder{

        ImageView medicineImage;
        TextView medicineName,medicineQuantity, medicineTime;
        Button edit, delete;

        public HolderCallHistory(@NonNull View itemView) {
            super(itemView);

            medicineImage = itemView.findViewById(R.id.medicine_image);
            medicineName = itemView.findViewById(R.id.medicine_name);
            medicineQuantity = itemView.findViewById(R.id.medicine_quantity);
            medicineTime = itemView.findViewById(R.id.medicine_time);
            edit = itemView.findViewById(R.id.edit);
            delete = itemView.findViewById(R.id.delete);

        }
    }

}
