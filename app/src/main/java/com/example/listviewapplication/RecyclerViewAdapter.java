package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int MENU_ITEM_VIEW_TYPE = 0;
    private static final int NATIVE_EXPRESS_AD_VIEW_TYPE = 1;

    private final Context mContext;
    private final List<Object> mRecyclerViewItems;


    public RecyclerViewAdapter(Context mContext, List<Object> mRecyclerViewItems, Context context) {
        this.mContext = mContext;
        this.mRecyclerViewItems = mRecyclerViewItems;
    }

    public class MenuItemViewHolder extends RecyclerView.ViewHolder{
        private TextView menuItemVote;
        private TextView menuItemSchoolName;
        private TextView menuItemValidationAttendance;
        private TextView menuItemThreshold;
        private TextView menuItemVariable;
        private TextView menuItemAnnualBudget;
        private TextView menuItemQuarterRelease;

        public MenuItemViewHolder(@NonNull View itemView) {
            super(itemView);
            menuItemVote = itemView.findViewById(R.id.menu_item_vote);
            menuItemSchoolName = itemView.findViewById(R.id.menu_item_school_name);
            menuItemValidationAttendance = itemView.findViewById(R.id.menu_item_validation_attendance);
            menuItemThreshold = itemView.findViewById(R.id.menu_item_threshold);
            menuItemVariable = itemView.findViewById(R.id.menu_item_variable);
            menuItemAnnualBudget = itemView.findViewById(R.id.menu_item_annual_budget);
            menuItemQuarterRelease = itemView.findViewById(R.id.menu_quarter_release);

        }
    }

    public class NativeExpressAdViewHolder extends RecyclerView.ViewHolder{

        public NativeExpressAdViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case MENU_ITEM_VIEW_TYPE:
                default:
                    View menuItemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                            R.layout.menu_item_container, parent, false);
                    return  new MenuItemViewHolder(menuItemLayoutView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType){
            case MENU_ITEM_VIEW_TYPE:
                default:
                    MenuItemViewHolder menuItemHolder = (MenuItemViewHolder) holder;
                    Education menuItem = (Education) mRecyclerViewItems.get(position);

                    menuItemHolder.menuItemVote.setText(menuItem.getVote());
                    menuItemHolder.menuItemSchoolName.setText(menuItem.getSchoolname());
                    menuItemHolder.menuItemValidationAttendance.setText(menuItem.getValidation_attendance());
                    menuItemHolder.menuItemThreshold.setText(menuItem.getThreshold());
                    menuItemHolder.menuItemVariable.setText(menuItem.getVariable());
                    menuItemHolder.menuItemAnnualBudget.setText(menuItem.getAnnual_budget());
                    menuItemHolder.menuItemQuarterRelease.setText(menuItem.getQuarter_release());
        }

    }

    @Override
    public int getItemCount() {
        return mRecyclerViewItems.size();
    }
}
