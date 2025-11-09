package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;

/* renamed from: com.google.android.gms.internal.ads.au */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1398au implements wk0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f17113OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f17114OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f17115OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f17116OooO0Oo;

    public /* synthetic */ C1398au(Object obj, Object obj2, Object obj3, int i) {
        this.f17113OooO00o = i;
        this.f17114OooO0O0 = obj;
        this.f17115OooO0OO = obj2;
        this.f17116OooO0Oo = obj3;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final Object apply(Object obj) {
        switch (this.f17113OooO00o) {
            case 0:
                kd0 kd0Var = (kd0) obj;
                zzau zzauVar = new zzau((Context) this.f17114OooO0O0);
                zzauVar.zzp(kd0Var.f20512OooOoo0);
                zzauVar.zzq(kd0Var.f20511OooOoo.toString());
                zzauVar.zzo(((VersionInfoParcel) this.f17115OooO0OO).afmaVersion);
                zzauVar.zzn(((vd0) this.f17116OooO0Oo).f24955OooO0o);
                return zzauVar;
            case 1:
                kd0 kd0Var2 = (kd0) this.f17115OooO0OO;
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f17114OooO0O0;
                if (kd0Var2.f20522Oooo0o) {
                    interfaceC1722jo.OooOo00();
                }
                interfaceC1722jo.o0ooOO0();
                interfaceC1722jo.onPause();
                return ((C2167vp) this.f17116OooO0Oo).o00Ooo();
            case 2:
                kd0 kd0Var3 = (kd0) this.f17115OooO0OO;
                InterfaceC1722jo interfaceC1722jo2 = (InterfaceC1722jo) this.f17114OooO0O0;
                if (kd0Var3.f20522Oooo0o) {
                    interfaceC1722jo2.OooOo00();
                }
                interfaceC1722jo2.o0ooOO0();
                interfaceC1722jo2.onPause();
                return ((C1431bq) this.f17116OooO0Oo).o00o0O();
            default:
                kd0 kd0Var4 = (kd0) this.f17115OooO0OO;
                InterfaceC1722jo interfaceC1722jo3 = (InterfaceC1722jo) this.f17114OooO0O0;
                if (kd0Var4.f20522Oooo0o) {
                    interfaceC1722jo3.OooOo00();
                }
                interfaceC1722jo3.o0ooOO0();
                interfaceC1722jo3.onPause();
                return ((C1540eq) this.f17116OooO0Oo).o00ooo();
        }
    }
}
