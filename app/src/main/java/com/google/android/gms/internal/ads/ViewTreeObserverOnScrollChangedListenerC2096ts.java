package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ts */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnScrollChangedListenerC2096ts extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f24497OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public View f24498OooOo0o;

    public ViewTreeObserverOnScrollChangedListenerC2096ts(Context context) {
        super(context);
        this.f24497OooOo0O = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC2096ts OooO00o(Context context, View view, kd0 kd0Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC2096ts viewTreeObserverOnScrollChangedListenerC2096ts = new ViewTreeObserverOnScrollChangedListenerC2096ts(context);
        List list = kd0Var.OooOo0;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = viewTreeObserverOnScrollChangedListenerC2096ts.f24497OooOo0O;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((ld0) list.get(0)).f20851OooO00o;
            float f2 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC2096ts.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r5.f20852OooO0O0 * f2)));
        }
        viewTreeObserverOnScrollChangedListenerC2096ts.f24498OooOo0o = view;
        viewTreeObserverOnScrollChangedListenerC2096ts.addView(view);
        zzv.zzy();
        ViewTreeObserverOnScrollChangedListenerC1536em viewTreeObserverOnScrollChangedListenerC1536em = new ViewTreeObserverOnScrollChangedListenerC1536em(viewTreeObserverOnScrollChangedListenerC2096ts, viewTreeObserverOnScrollChangedListenerC2096ts);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC1536em.f23178OooOo0O).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC1536em.o00000oo(viewTreeObserver);
        }
        zzv.zzy();
        ViewTreeObserverOnGlobalLayoutListenerC1500dm viewTreeObserverOnGlobalLayoutListenerC1500dm = new ViewTreeObserverOnGlobalLayoutListenerC1500dm(viewTreeObserverOnScrollChangedListenerC2096ts, viewTreeObserverOnScrollChangedListenerC2096ts);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC1500dm.f23178OooOo0O).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC1500dm.o00000oo(viewTreeObserver3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObject = kd0Var.f20541Oooooo;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC2096ts.OooO0O0(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC2096ts.OooO0O0(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC2096ts.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC2096ts;
    }

    public final void OooO0O0(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f24497OooOo0O;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(C3034d9.h.f8077K0, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        zzbc.zzb();
        int iZzx = zzf.zzx(context, (int) dOptDouble);
        textView.setPadding(0, iZzx, 0, iZzx);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        zzbc.zzb();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzf.zzx(context, (int) dOptDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f24498OooOo0o.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f24498OooOo0o.setY(-r0[1]);
    }
}
