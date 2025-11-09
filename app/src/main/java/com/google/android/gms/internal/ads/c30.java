package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3912zo;

/* loaded from: classes2.dex */
public final class c30 extends AbstractBinderC2181w2 implements InterfaceC2154vc {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f17670OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Object f17671OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f17672OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C2274yl f17673OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ jf0 f17674OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ d30 f17675OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(long j, C2274yl c2274yl, d30 d30Var, jf0 jf0Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f17671OooOo0O = obj;
        this.f17672OooOo0o = str;
        this.f17670OooOo = j;
        this.f17674OooOoO0 = jf0Var;
        this.f17673OooOoO = c2274yl;
        this.f17675OooOoOO = d30Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            zzf();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2154vc
    public final void zze(String str) {
        synchronized (this.f17671OooOo0O) {
            d30 d30Var = this.f17675OooOoOO;
            String str2 = this.f17672OooOo0o;
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            d30Var.OooO0Oo(str2, (int) (SystemClock.elapsedRealtime() - this.f17670OooOo), str, false);
            this.f17675OooOoOO.OooOO0o.OooO00o(this.f17672OooOo0o, C3912zo.a.f13038g);
            this.f17675OooOoOO.f18152OooOOOO.OooO00o(this.f17672OooOo0o, C3912zo.a.f13038g);
            nf0 nf0Var = this.f17675OooOoOO.f18153OooOOOo;
            jf0 jf0Var = this.f17674OooOoO0;
            jf0Var.OooO0o0(str);
            jf0Var.OooOO0(false);
            nf0Var.OooO0O0(jf0Var.zzm());
            this.f17673OooOoO.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2154vc
    public final void zzf() {
        synchronized (this.f17671OooOo0O) {
            d30 d30Var = this.f17675OooOoOO;
            String str = this.f17672OooOo0o;
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            d30Var.OooO0Oo(str, (int) (SystemClock.elapsedRealtime() - this.f17670OooOo), "", true);
            this.f17675OooOoOO.OooOO0o.OooO0OO(this.f17672OooOo0o);
            this.f17675OooOoOO.f18152OooOOOO.OooO0o(this.f17672OooOo0o);
            nf0 nf0Var = this.f17675OooOoOO.f18153OooOOOo;
            jf0 jf0Var = this.f17674OooOoO0;
            jf0Var.OooOO0(true);
            nf0Var.OooO0O0(jf0Var.zzm());
            this.f17673OooOoO.zzc(Boolean.TRUE);
        }
    }
}
