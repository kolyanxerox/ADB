package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.p2 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC1152p2 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    protected Context f1703a;

    /* renamed from: b */
    private List f1704b = new ArrayList();

    /* renamed from: c */
    private Map f1705c = new HashMap();

    /* renamed from: d */
    private a f1706d;

    /* renamed from: com.applovin.impl.p2$a */
    public interface a {
        /* renamed from: a */
        void mo2a(C1053i2 c1053i2, C1143o2 c1143o2);
    }

    public AbstractViewOnClickListenerC1152p2(Context context) {
        this.f1703a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C1143o2 mo130a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public abstract int mo131b();

    @Override // android.widget.Adapter
    /* renamed from: b */
    public C1143o2 getItem(int i) {
        return (C1143o2) this.f1704b.get(i);
    }

    /* renamed from: c */
    public abstract List mo132c(int i);

    /* renamed from: c */
    public void m2061c() {
        AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 11));
    }

    /* renamed from: d */
    public abstract int mo133d(int i);

    /* renamed from: e */
    public abstract C1143o2 mo134e(int i);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1704b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m1988m();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1133n2 c1133n2;
        C1143o2 item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.m1986j(), viewGroup, false);
            c1133n2 = new C1133n2();
            c1133n2.f1516a = (TextView) view.findViewById(R.id.text1);
            c1133n2.f1517b = (TextView) view.findViewById(R.id.text2);
            c1133n2.f1518c = (ImageView) view.findViewById(C1333R.id.imageView);
            c1133n2.f1519d = (ImageView) view.findViewById(C1333R.id.detailImageView);
            view.setTag(c1133n2);
            view.setOnClickListener(this);
            view.setBackground(m2057a(view));
        } else {
            c1133n2 = (C1133n2) view.getTag();
        }
        c1133n2.m1887a(i);
        c1133n2.m1888a(item);
        view.setEnabled(item.mo1440o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return C1143o2.m1980n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).mo1440o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.f1704b = new ArrayList();
        int iMo131b = mo131b();
        this.f1705c = new HashMap(iMo131b);
        C1143o2 c1143o2Mo130a = mo130a();
        if (c1143o2Mo130a != null) {
            this.f1704b.add(c1143o2Mo130a);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < iMo131b; i2++) {
            int iMo133d = mo133d(i2);
            if (iMo133d != 0) {
                this.f1704b.add(mo134e(i2));
                this.f1704b.addAll(mo132c(i2));
                this.f1705c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i = iMo133d + 1 + i;
            }
        }
        this.f1704b.add(new C1250t4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1133n2 c1133n2 = (C1133n2) view.getTag();
        C1143o2 c1143o2M1889b = c1133n2.m1889b();
        C1053i2 c1053i2M2058a = m2058a(c1133n2.m1886a());
        a aVar = this.f1706d;
        if (aVar == null || c1053i2M2058a == null) {
            return;
        }
        aVar.mo2a(c1053i2M2058a, c1143o2M1889b);
    }

    /* renamed from: a */
    public void m2059a(a aVar) {
        this.f1706d = aVar;
    }

    /* renamed from: a */
    private C1053i2 m2058a(int i) {
        for (int i2 = 0; i2 < mo131b(); i2++) {
            Integer num = (Integer) this.f1705c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo133d(i2)) {
                    return new C1053i2(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private Drawable m2057a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_highlightListItemColor, this.f1703a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
