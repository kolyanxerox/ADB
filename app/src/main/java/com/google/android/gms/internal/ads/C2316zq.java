package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.zq */
/* loaded from: classes2.dex */
public final class C2316zq implements InterfaceC1436bv {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26359OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f26360OooOo0o;

    public /* synthetic */ C2316zq(Object obj, int i) {
        this.f26359OooOo0O = i;
        this.f26360OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final void OooOO0(Context context) throws yd0 {
        switch (this.f26359OooOo0O) {
            case 0:
                try {
                    try {
                        ((ee0) this.f26360OooOo0o).f18580OooO00o.zzo();
                        return;
                    } catch (Throwable th) {
                        throw new yd0(th);
                    }
                } catch (yd0 e) {
                    zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
                    return;
                }
            default:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f26360OooOo0o;
                if (interfaceC1722jo != null) {
                    interfaceC1722jo.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final void OooOOO(Context context) throws yd0 {
        switch (this.f26359OooOo0O) {
            case 0:
                try {
                    try {
                        ((ee0) this.f26360OooOo0o).f18580OooO00o.zzE();
                        return;
                    } catch (Throwable th) {
                        throw new yd0(th);
                    }
                } catch (yd0 e) {
                    zzo.zzk("Cannot invoke onPause for the mediation adapter.", e);
                    return;
                }
            default:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f26360OooOo0o;
                if (interfaceC1722jo != null) {
                    interfaceC1722jo.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final void Oooo000(Context context) throws yd0 {
        switch (this.f26359OooOo0O) {
            case 0:
                InterfaceC2230xe interfaceC2230xe = ((ee0) this.f26360OooOo0o).f18580OooO00o;
                try {
                    try {
                        interfaceC2230xe.OooO0oO();
                        if (context != null) {
                            try {
                                interfaceC2230xe.o000O0(new Oooo0o.OooO0OO(context));
                                return;
                            } catch (Throwable th) {
                                throw new yd0(th);
                            }
                        }
                        return;
                    } finally {
                        yd0 yd0Var = new yd0(th);
                    }
                } catch (yd0 e) {
                    zzo.zzk("Cannot invoke onResume for the mediation adapter.", e);
                    return;
                }
            default:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f26360OooOo0o;
                if (interfaceC1722jo != null) {
                    interfaceC1722jo.onResume();
                    return;
                }
                return;
        }
    }
}
