package com.google.android.gms.internal.ads;

import android.view.View;
import com.ironsource.C3007ch;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fz */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC1586fz implements View.OnClickListener {

    /* renamed from: OooOo */
    public InterfaceC2263ya f19144OooOo;

    /* renamed from: OooOo0O */
    public final z00 f19145OooOo0O;

    /* renamed from: OooOo0o */
    public final Oooo0OO.o00Ooo f19146OooOo0o;

    /* renamed from: OooOoO */
    public String f19147OooOoO;

    /* renamed from: OooOoO0 */
    public C1895ob f19148OooOoO0;

    /* renamed from: OooOoOO */
    public Long f19149OooOoOO;

    /* renamed from: OooOoo0 */
    public WeakReference f19150OooOoo0;

    public ViewOnClickListenerC1586fz(z00 z00Var, Oooo0OO.o00Ooo o00ooo2) {
        this.f19145OooOo0O = z00Var;
        this.f19146OooOo0o = o00ooo2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f19150OooOoo0;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f19147OooOoO != null && this.f19149OooOoOO != null) {
            HashMap map = new HashMap();
            map.put(C3007ch.f7763x, this.f19147OooOoO);
            ((Oooo0OO.oo000o) this.f19146OooOo0o).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f19149OooOoOO.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f19145OooOo0O.OooO0O0(map);
        }
        this.f19147OooOoO = null;
        this.f19149OooOoOO = null;
        WeakReference weakReference2 = this.f19150OooOoo0;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f19150OooOoo0 = null;
    }
}
