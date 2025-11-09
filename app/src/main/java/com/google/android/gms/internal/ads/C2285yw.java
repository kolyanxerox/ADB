package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.yw */
/* loaded from: classes2.dex */
public final class C2285yw extends p11 implements InterfaceC1481d3 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final WeakHashMap f26031OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final kd0 f26032OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Context f26033OooOoO0;

    public C2285yw(Context context, Set set, kd0 kd0Var) {
        super(set);
        this.f26031OooOo = new WeakHashMap(1);
        this.f26033OooOoO0 = context;
        this.f26032OooOoO = kd0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final synchronized void Ooooo00(C1444c3 c1444c3) {
        o0000Ooo(new sj0(c1444c3, 16));
    }

    public final synchronized void o00000oo(View view) {
        try {
            ViewOnAttachStateChangeListenerC1517e3 viewOnAttachStateChangeListenerC1517e3 = (ViewOnAttachStateChangeListenerC1517e3) this.f26031OooOo.get(view);
            if (viewOnAttachStateChangeListenerC1517e3 == null) {
                ViewOnAttachStateChangeListenerC1517e3 viewOnAttachStateChangeListenerC1517e32 = new ViewOnAttachStateChangeListenerC1517e3(this.f26033OooOoO0, view);
                viewOnAttachStateChangeListenerC1517e32.f18476Oooo00O.add(this);
                viewOnAttachStateChangeListenerC1517e32.OooO0OO(3);
                this.f26031OooOo.put(view, viewOnAttachStateChangeListenerC1517e32);
                viewOnAttachStateChangeListenerC1517e3 = viewOnAttachStateChangeListenerC1517e32;
            }
            if (this.f26032OooOoO.f20532OoooOOo) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o000O0)).booleanValue()) {
                    viewOnAttachStateChangeListenerC1517e3.f18472OooOooO.zza(((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17808o000O00O)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC1517e3.f18472OooOooO.zza(ViewOnAttachStateChangeListenerC1517e3.f18463Oooo0O0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
