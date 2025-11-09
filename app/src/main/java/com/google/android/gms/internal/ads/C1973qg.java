package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.collection.ArraySet;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C3034d9;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.qg */
/* loaded from: classes2.dex */
public final class C1973qg extends C2249xx {

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f23592OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public String f23593OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f23594OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f23595OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f23596OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public int f23597OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public int f23598OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public ViewGroup f23599Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final Activity f23600Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public int f23601Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final Object f23602Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final InterfaceC1722jo f23603Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public Oooo0oO.o0O0O00 f23604Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f23605Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public final C1847n1 f23606Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public LinearLayout f23607Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public PopupWindow f23608Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public RelativeLayout f23609Oooo0oo;

    static {
        String[] strArr = {C3034d9.e.f7988c, C3034d9.e.f7987b, "top-center", "center", C3034d9.e.f7990e, C3034d9.e.f7989d, "bottom-center"};
        ArraySet arraySet = new ArraySet(7);
        Collections.addAll(arraySet, strArr);
        Collections.unmodifiableSet(arraySet);
    }

    public C1973qg(InterfaceC1722jo interfaceC1722jo, C1847n1 c1847n1) {
        super(16, interfaceC1722jo, "resize");
        this.f23593OooOoO0 = C3034d9.e.f7987b;
        this.f23592OooOoO = true;
        this.f23594OooOoOO = 0;
        this.f23596OooOoo0 = 0;
        this.f23595OooOoo = -1;
        this.f23597OooOooO = 0;
        this.f23598OooOooo = 0;
        this.f23601Oooo000 = -1;
        this.f23602Oooo00O = new Object();
        this.f23603Oooo00o = interfaceC1722jo;
        this.f23600Oooo0 = interfaceC1722jo.zzi();
        this.f23606Oooo0o = c1847n1;
    }

    public final void OooOOo(boolean z) {
        synchronized (this.f23602Oooo00O) {
            try {
                if (this.f23608Oooo0oO != null) {
                    if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0OO)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        OooOOoo(z);
                    } else {
                        AbstractC2200wl.f25325OooO0o.OooO00o(new OoooOOO.oO000O0O(this, z, 1));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOoo(boolean z) {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOO0)).booleanValue();
        InterfaceC1722jo interfaceC1722jo = this.f23603Oooo00o;
        if (zBooleanValue) {
            this.f23609Oooo0oo.removeView((View) interfaceC1722jo);
            this.f23608Oooo0oO.dismiss();
        } else {
            this.f23608Oooo0oO.dismiss();
            this.f23609Oooo0oo.removeView((View) interfaceC1722jo);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0Oo)).booleanValue()) {
            View view = (View) interfaceC1722jo;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f23599Oooo;
        if (viewGroup != null) {
            viewGroup.removeView(this.f23605Oooo0OO);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0o0)).booleanValue()) {
                try {
                    this.f23599Oooo.addView((View) interfaceC1722jo);
                    interfaceC1722jo.o0OoOo0(this.f23604Oooo0O0);
                } catch (IllegalStateException e) {
                    zzo.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                this.f23599Oooo.addView((View) interfaceC1722jo);
                interfaceC1722jo.o0OoOo0(this.f23604Oooo0O0);
            }
        }
        if (z) {
            OooOOo0("default");
            C1847n1 c1847n1 = this.f23606Oooo0o;
            if (c1847n1 != null) {
                ((m10) c1847n1.f21381OooOo0o).f21015OooO0OO.o0000Ooo(new C2007rd(25));
            }
        }
        this.f23608Oooo0oO = null;
        this.f23609Oooo0oo = null;
        this.f23599Oooo = null;
        this.f23607Oooo0o0 = null;
    }
}
