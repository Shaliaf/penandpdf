package com.cgogolin.penandpdf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class ChoosePDFAdapter extends BaseAdapter {
    private final LinkedList<ChoosePDFItem> mItems;
    private final LayoutInflater mInflater;

    public ChoosePDFAdapter(LayoutInflater inflater) {
        mInflater = inflater;
        mItems = new LinkedList<ChoosePDFItem>();
    }

    public void clear() {
        mItems.clear();
    }

    public void add(ChoosePDFItem item) {
        mItems.add(item);
    }

    public int getCount() {
        return mItems.size();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int arg0) {
        return 0;
    }

    private int iconForType(ChoosePDFItem.Type type) {
        switch (type) {
            case PARENT:
                return R.drawable.ic_action_up;
            case DIR:
                return R.drawable.ic_dir;
            case NEW:
            case DOC:
                return R.drawable.ic_doc;
            default:
                return 0;
        }
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (convertView == null) {
            v = mInflater.inflate(R.layout.picker_entry, null);
        } else {
            v = convertView;
        }
        ChoosePDFItem item = mItems.get(position);
        ((TextView) v.findViewById(R.id.name)).setText(item.name);
        ((ImageView) v.findViewById(R.id.icon)).setImageResource(iconForType(item.type));
        return v;
    }

}
