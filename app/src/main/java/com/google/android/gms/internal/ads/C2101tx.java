package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.tx */
/* loaded from: classes2.dex */
public final class C2101tx implements InterfaceC1656hv, zzr, InterfaceC1399av {

    /* renamed from: OooOo, reason: collision with root package name */
    public final kd0 f24520OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f24521OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC1722jo f24522OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final EnumC2035s4 f24523OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final VersionInfoParcel f24524OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final e60 f24525OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public f60 f24526OooOoo0;

    public C2101tx(Context context, InterfaceC1722jo interfaceC1722jo, kd0 kd0Var, VersionInfoParcel versionInfoParcel, EnumC2035s4 enumC2035s4, e60 e60Var) {
        this.f24521OooOo0O = context;
        this.f24522OooOo0o = interfaceC1722jo;
        this.f24520OooOo = kd0Var;
        this.f24524OooOoO0 = versionInfoParcel;
        this.f24523OooOoO = enumC2035s4;
        this.f24525OooOoOO = e60Var;
    }

    public final boolean OooO00o() {
        dh0 dh0Var;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue()) {
            return false;
        }
        e60 e60Var = this.f24525OooOoOO;
        synchronized (e60Var) {
            dh0Var = e60Var.f18505OooO0o;
        }
        return dh0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        InterfaceC1722jo interfaceC1722jo;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOo)).booleanValue()) {
            EnumC2035s4 enumC2035s4 = EnumC2035s4.REWARD_BASED_VIDEO_AD;
            EnumC2035s4 enumC2035s42 = this.f24523OooOoO;
            if (enumC2035s42 != enumC2035s4 && enumC2035s42 != EnumC2035s4.INTERSTITIAL && enumC2035s42 != EnumC2035s4.APP_OPEN) {
                return;
            }
        }
        kd0 kd0Var = this.f24520OooOo;
        if (kd0Var.f20526OoooO && (interfaceC1722jo = this.f24522OooOo0o) != null && ((C1658hx) zzv.zzB()).OooOO0o(this.f24521OooOo0O)) {
            if (OooO00o()) {
                this.f24525OooOoOO.OooO0OO();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.f24524OooOoO0;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            wd0 wd0Var = kd0Var.o000oOoO;
            int i = 1;
            String str2 = wd0Var.OooO00o() + (-1) != 1 ? "javascript" : null;
            int i2 = 2;
            if (wd0Var.OooO00o() == 1) {
                i = 3;
            } else {
                i2 = kd0Var.f20533OoooOo0 == 2 ? 4 : 1;
            }
            this.f24526OooOoo0 = ((C1658hx) zzv.zzB()).OooO0OO(i2, i, interfaceC1722jo.OooOOo(), str, str2, kd0Var.f20557ooOO);
            View viewOooO0oO = interfaceC1722jo.OooO0oO();
            f60 f60Var = this.f24526OooOoo0;
            if (f60Var != null) {
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0ooo)).booleanValue();
                yg0 yg0Var = f60Var.f18791OooO00o;
                if (zBooleanValue) {
                    ((C1658hx) zzv.zzB()).OooOO0(yg0Var, interfaceC1722jo.OooOOo());
                    ArrayList arrayListOooOo = interfaceC1722jo.OooOo();
                    int size = arrayListOooOo.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayListOooOo.get(i3);
                        i3++;
                        ((C1658hx) zzv.zzB()).getClass();
                        C1658hx.OooOOOo(new z50(yg0Var, (View) obj, 0));
                    }
                } else {
                    ((C1658hx) zzv.zzB()).OooOO0(yg0Var, viewOooO0oO);
                }
                interfaceC1722jo.Oooo0oo(this.f24526OooOoo0);
                ((C1658hx) zzv.zzB()).OooOO0O(yg0Var);
                interfaceC1722jo.OooO0o("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        InterfaceC1722jo interfaceC1722jo;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo)).booleanValue() || (interfaceC1722jo = this.f24522OooOo0o) == null) {
            return;
        }
        if (this.f24526OooOoo0 != null || OooO00o()) {
            if (this.f24526OooOoo0 != null) {
                interfaceC1722jo.OooO0o("onSdkImpression", new ArrayMap());
            } else {
                this.f24525OooOoOO.OooO0O0();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        this.f24526OooOoo0 = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        InterfaceC1722jo interfaceC1722jo;
        if (OooO00o()) {
            this.f24525OooOoOO.OooO0O0();
        } else {
            if (this.f24526OooOoo0 == null || (interfaceC1722jo = this.f24522OooOo0o) == null) {
                return;
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo)).booleanValue()) {
                interfaceC1722jo.OooO0o("onSdkImpression", new ArrayMap());
            }
        }
    }
}
