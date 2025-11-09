package o00000O0;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* loaded from: classes2.dex */
public final class o00O0O implements AdapterView.OnItemClickListener {

    /* renamed from: OooOo0O */
    public final /* synthetic */ MaterialAutoCompleteTextView f29201OooOo0O;

    public o00O0O(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        this.f29201OooOo0O = materialAutoCompleteTextView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f29201OooOo0O;
        ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f27868OooOo0O;
        MaterialAutoCompleteTextView.OooO00o(materialAutoCompleteTextView, i < 0 ? listPopupWindow.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i));
        AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = listPopupWindow.getSelectedView();
                i = listPopupWindow.getSelectedItemPosition();
                j = listPopupWindow.getSelectedItemId();
            }
            onItemClickListener.onItemClick(listPopupWindow.getListView(), view, i, j);
        }
        listPopupWindow.dismiss();
    }
}
