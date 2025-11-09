package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.us */
/* loaded from: classes2.dex */
public final class C2133us implements InterfaceC1656hv, InterfaceC1399av {

    /* renamed from: OooOo */
    public final kd0 f24775OooOo;

    /* renamed from: OooOo0O */
    public final Context f24776OooOo0O;

    /* renamed from: OooOo0o */
    public final InterfaceC1722jo f24777OooOo0o;

    /* renamed from: OooOoO */
    public f60 f24778OooOoO;

    /* renamed from: OooOoO0 */
    public final VersionInfoParcel f24779OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f24780OooOoOO;

    /* renamed from: OooOoo0 */
    public final e60 f24781OooOoo0;

    public C2133us(Context context, InterfaceC1722jo interfaceC1722jo, kd0 kd0Var, VersionInfoParcel versionInfoParcel, e60 e60Var) {
        this.f24776OooOo0O = context;
        this.f24777OooOo0o = interfaceC1722jo;
        this.f24775OooOo = kd0Var;
        this.f24779OooOoO0 = versionInfoParcel;
        this.f24781OooOoo0 = e60Var;
    }

    public final synchronized void OooO00o() {
        int i;
        int i2;
        try {
            if (this.f24775OooOo.f20526OoooO && this.f24777OooOo0o != null) {
                if (((C1658hx) zzv.zzB()).OooOO0o(this.f24776OooOo0O)) {
                    VersionInfoParcel versionInfoParcel = this.f24779OooOoO0;
                    String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                    wd0 wd0Var = this.f24775OooOo.o000oOoO;
                    String str2 = wd0Var.OooO00o() + (-1) != 1 ? "javascript" : null;
                    if (wd0Var.OooO00o() == 1) {
                        i = 2;
                        i2 = 3;
                    } else if (this.f24775OooOo.f20492OooO0o0 == 1) {
                        i = 3;
                        i2 = 1;
                    } else {
                        i = 1;
                        i2 = 1;
                    }
                    this.f24778OooOoO = ((C1658hx) zzv.zzB()).OooO0OO(i, i2, this.f24777OooOo0o.OooOOo(), str, str2, this.f24775OooOo.f20557ooOO);
                    View viewOooO0oO = this.f24777OooOo0o.OooO0oO();
                    f60 f60Var = this.f24778OooOoO;
                    if (f60Var != null) {
                        yg0 yg0Var = f60Var.f18791OooO00o;
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0ooo)).booleanValue()) {
                            ((C1658hx) zzv.zzB()).OooOO0(yg0Var, this.f24777OooOo0o.OooOOo());
                            ArrayList arrayListOooOo = this.f24777OooOo0o.OooOo();
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
                        this.f24777OooOo0o.Oooo0oo(this.f24778OooOoO);
                        ((C1658hx) zzv.zzB()).OooOO0O(yg0Var);
                        this.f24780OooOoOO = true;
                        this.f24777OooOo0o.OooO0o("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final synchronized void OoooOOO() {
        boolean z;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue()) {
            e60 e60Var = this.f24781OooOoo0;
            synchronized (e60Var) {
                z = e60Var.f18505OooO0o != null;
            }
        }
        if (z) {
            this.f24781OooOoo0.OooO0OO();
        } else {
            if (this.f24780OooOoOO) {
                return;
            }
            OooO00o();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final synchronized void zzr() {
        boolean z;
        InterfaceC1722jo interfaceC1722jo;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue()) {
            e60 e60Var = this.f24781OooOoo0;
            synchronized (e60Var) {
                z = e60Var.f18505OooO0o != null;
            }
        }
        if (z) {
            this.f24781OooOoo0.OooO0O0();
            return;
        }
        if (!this.f24780OooOoOO) {
            OooO00o();
        }
        if (!this.f24775OooOo.f20526OoooO || this.f24778OooOoO == null || (interfaceC1722jo = this.f24777OooOo0o) == null) {
            return;
        }
        interfaceC1722jo.OooO0o("onSdkImpression", new ArrayMap());
    }
}
