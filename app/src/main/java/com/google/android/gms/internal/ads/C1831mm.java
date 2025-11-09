package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.mm */
/* loaded from: classes2.dex */
public final class C1831mm extends FrameLayout {

    /* renamed from: OooOo */
    public final View f21283OooOo;

    /* renamed from: OooOo0O */
    public final C2129uo f21284OooOo0O;

    /* renamed from: OooOo0o */
    public final FrameLayout f21285OooOo0o;

    /* renamed from: OooOoO */
    public final RunnableC1794lm f21286OooOoO;

    /* renamed from: OooOoO0 */
    public final C1669i7 f21287OooOoO0;

    /* renamed from: OooOoOO */
    public final long f21288OooOoOO;

    /* renamed from: OooOoo */
    public boolean f21289OooOoo;

    /* renamed from: OooOoo0 */
    public final AbstractC1684im f21290OooOoo0;

    /* renamed from: OooOooO */
    public boolean f21291OooOooO;

    /* renamed from: OooOooo */
    public boolean f21292OooOooo;

    /* renamed from: Oooo0 */
    public String f21293Oooo0;

    /* renamed from: Oooo000 */
    public boolean f21294Oooo000;

    /* renamed from: Oooo00O */
    public long f21295Oooo00O;

    /* renamed from: Oooo00o */
    public long f21296Oooo00o;

    /* renamed from: Oooo0O0 */
    public String[] f21297Oooo0O0;

    /* renamed from: Oooo0OO */
    public Bitmap f21298Oooo0OO;

    /* renamed from: Oooo0o */
    public boolean f21299Oooo0o;

    /* renamed from: Oooo0o0 */
    public final ImageView f21300Oooo0o0;

    public C1831mm(Context context, C2129uo c2129uo, int i, boolean z, C1669i7 c1669i7, C2053sm c2053sm) {
        AbstractC1684im textureViewSurfaceTextureListenerC1647hm;
        C1669i7 c1669i72;
        AbstractC1684im c1538eo;
        super(context);
        this.f21284OooOo0O = c2129uo;
        this.f21287OooOoO0 = c1669i7;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21285OooOo0o = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Oooo00O.o000000O.OooO0oo(c2129uo.f24671OooOo0O.f25033OooOoo0);
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = c2129uo.f24671OooOo0O;
        AbstractC1720jm abstractC1720jm = viewTreeObserverOnGlobalLayoutListenerC2166vo.f25033OooOoo0.zza;
        C2090tm c2090tm = new C2090tm(context, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25029OooOoO, viewTreeObserverOnGlobalLayoutListenerC2166vo.o0Oo0oo(), c1669i7, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25060OooooOO);
        if (i == 3) {
            c1538eo = new C1538eo(context, c2090tm);
            c1669i72 = c1669i7;
        } else {
            if (i == 2) {
                viewTreeObserverOnGlobalLayoutListenerC2166vo.zzO().getClass();
                textureViewSurfaceTextureListenerC1647hm = new TextureViewSurfaceTextureListenerC2312zm(context, c2090tm, c2129uo, z, c2053sm);
                c1669i72 = c1669i7;
            } else {
                c1669i72 = c1669i7;
                textureViewSurfaceTextureListenerC1647hm = new TextureViewSurfaceTextureListenerC1647hm(context, c2129uo, z, viewTreeObserverOnGlobalLayoutListenerC2166vo.zzO().OooO0O0(), new C2090tm(context, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25029OooOoO, viewTreeObserverOnGlobalLayoutListenerC2166vo.o0Oo0oo(), c1669i7, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25060OooooOO));
            }
            c1538eo = textureViewSurfaceTextureListenerC1647hm;
        }
        this.f21290OooOoo0 = c1538eo;
        View view = new View(context);
        this.f21283OooOo = view;
        view.setBackgroundColor(0);
        frameLayout.addView(c1538eo, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17752OoooO0O)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17738Oooo)).booleanValue()) {
            OooOO0O();
        }
        this.f21300Oooo0o0 = new ImageView(context);
        this.f21288OooOoOO = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17753OoooOO0)).longValue();
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17750OoooO0)).booleanValue();
        this.f21294Oooo000 = zBooleanValue;
        c1669i72.OooO0O0("spinner_used", true != zBooleanValue ? "0" : "1");
        this.f21286OooOoO = new RunnableC1794lm(this);
        c1538eo.OooOo0(this);
    }

    public final void OooO() {
        if (this.f21299Oooo0o && this.f21298Oooo0OO != null) {
            ImageView imageView = this.f21300Oooo0o0;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f21298Oooo0OO);
                imageView.invalidate();
                FrameLayout frameLayout = this.f21285OooOo0o;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f21286OooOoO.OooO00o();
        this.f21296Oooo00o = this.f21295Oooo00O;
        zzs.zza.post(new RunnableC1757km(this, 2));
    }

    public final void OooO00o(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("Set video bounds to x:", i, ";y:", i2, ";w:");
            sbOooOo0o.append(i3);
            sbOooOo0o.append(";h:");
            sbOooOo0o.append(i4);
            zze.zza(sbOooOo0o.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f21285OooOo0o.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void OooO0O0() {
        C2129uo c2129uo = this.f21284OooOo0O;
        if (c2129uo.zzi() == null || !this.f21291OooOooO || this.f21292OooOooo) {
            return;
        }
        c2129uo.zzi().getWindow().clearFlags(128);
        this.f21291OooOooO = false;
    }

    public final void OooO0OO(String str, String... strArr) {
        HashMap map = new HashMap();
        AbstractC1684im abstractC1684im = this.f21290OooOoo0;
        Integer numOooOoO0 = abstractC1684im != null ? abstractC1684im.OooOoO0() : null;
        if (numOooOoO0 != null) {
            map.put("playerId", numOooOoO0.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f21284OooOo0O.OooO0o("onVideoEvent", map);
    }

    public final void OooO0Oo() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17839o000o0O)).booleanValue()) {
            this.f21286OooOoO.OooO00o();
        }
        OooO0OO(C3034d9.h.f8106g0, new String[0]);
        OooO0O0();
    }

    public final void OooO0o() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17839o000o0O)).booleanValue()) {
            RunnableC1794lm runnableC1794lm = this.f21286OooOoO;
            runnableC1794lm.f20903OooOo0o = false;
            pj0 pj0Var = zzs.zza;
            pj0Var.removeCallbacks(runnableC1794lm);
            pj0Var.postDelayed(runnableC1794lm, 250L);
        }
        C2129uo c2129uo = this.f21284OooOo0O;
        if (c2129uo.zzi() != null && !this.f21291OooOooO) {
            boolean z = (c2129uo.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.f21292OooOooo = z;
            if (!z) {
                c2129uo.zzi().getWindow().addFlags(128);
                this.f21291OooOooO = true;
            }
        }
        this.f21289OooOoo = true;
    }

    public final void OooO0o0() {
        OooO0OO("pause", new String[0]);
        OooO0O0();
        this.f21289OooOoo = false;
    }

    public final void OooO0oO() {
        AbstractC1684im abstractC1684im = this.f21290OooOoo0;
        if (abstractC1684im != null && this.f21296Oooo00o == 0) {
            OooO0OO("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(abstractC1684im.OooOO0O() / 1000.0f), "videoWidth", String.valueOf(abstractC1684im.OooOOO0()), "videoHeight", String.valueOf(abstractC1684im.OooOO0o()));
        }
    }

    public final void OooO0oo() {
        this.f21283OooOo.setVisibility(4);
        zzs.zza.post(new RunnableC1757km(this, 0));
    }

    public final void OooOO0(int i, int i2) {
        if (this.f21294Oooo000) {
            C2148v6 c2148v6 = AbstractC1448c7.f17749OoooO;
            int iMax = Math.max(i / ((Integer) zzbe.zzc().OooO00o(c2148v6)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) zzbe.zzc().OooO00o(c2148v6)).intValue(), 1);
            Bitmap bitmap = this.f21298Oooo0OO;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f21298Oooo0OO.getHeight() == iMax2) {
                return;
            }
            this.f21298Oooo0OO = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f21299Oooo0o = false;
        }
    }

    public final void OooOO0O() {
        AbstractC1684im abstractC1684im = this.f21290OooOoo0;
        if (abstractC1684im == null) {
            return;
        }
        TextView textView = new TextView(abstractC1684im.getContext());
        Resources resourcesOooO0O0 = zzv.zzp().OooO0O0();
        textView.setText(String.valueOf(resourcesOooO0O0 == null ? "AdMob - " : resourcesOooO0O0.getString(R.string.watermark_label_prefix)).concat(abstractC1684im.OooOOo0()));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f21285OooOo0o;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void OooOO0o() {
        AbstractC1684im abstractC1684im = this.f21290OooOoo0;
        if (abstractC1684im == null) {
            return;
        }
        long jOooO = abstractC1684im.OooO();
        if (this.f21295Oooo00O == jOooO || jOooO <= 0) {
            return;
        }
        float f = jOooO / 1000.0f;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue()) {
            String strValueOf = String.valueOf(f);
            String strValueOf2 = String.valueOf(abstractC1684im.OooOOOo());
            String strValueOf3 = String.valueOf(abstractC1684im.OooOOO());
            String strValueOf4 = String.valueOf(abstractC1684im.OooOOOO());
            String strValueOf5 = String.valueOf(abstractC1684im.OooOO0());
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            OooO0OO("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            OooO0OO("timeupdate", "time", String.valueOf(f));
        }
        this.f21295Oooo00O = jOooO;
    }

    public final void finalize() throws Throwable {
        try {
            this.f21286OooOoO.OooO00o();
            AbstractC1684im abstractC1684im = this.f21290OooOoo0;
            if (abstractC1684im != null) {
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1442c1(abstractC1684im, 13));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        RunnableC1794lm runnableC1794lm = this.f21286OooOoO;
        if (z) {
            runnableC1794lm.f20903OooOo0o = false;
            pj0 pj0Var = zzs.zza;
            pj0Var.removeCallbacks(runnableC1794lm);
            pj0Var.postDelayed(runnableC1794lm, 250L);
        } else {
            runnableC1794lm.OooO00o();
            this.f21296Oooo00o = this.f21295Oooo00O;
        }
        zzs.zza.post(new RunnableC1794lm(this, z, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        RunnableC1794lm runnableC1794lm = this.f21286OooOoO;
        if (i == 0) {
            runnableC1794lm.f20903OooOo0o = false;
            pj0 pj0Var = zzs.zza;
            pj0Var.removeCallbacks(runnableC1794lm);
            pj0Var.postDelayed(runnableC1794lm, 250L);
            z = true;
        } else {
            runnableC1794lm.OooO00o();
            this.f21296Oooo00o = this.f21295Oooo00O;
        }
        zzs.zza.post(new RunnableC1794lm(this, z, 1));
    }
}
