package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z80 extends zzbt {

    /* renamed from: OooOo */
    public final ud0 f26118OooOo;

    /* renamed from: OooOo0O */
    public final Context f26119OooOo0O;

    /* renamed from: OooOo0o */
    public final C2130up f26120OooOo0o;

    /* renamed from: OooOoO */
    public zzbl f26121OooOoO;

    /* renamed from: OooOoO0 */
    public final oO000O0O f26122OooOoO0;

    public z80(C2130up c2130up, Context context, String str) {
        ud0 ud0Var = new ud0();
        this.f26118OooOo = ud0Var;
        this.f26122OooOoO0 = new oO000O0O();
        this.f26120OooOo0o = c2130up;
        ud0Var.f24627OooO0OO = str;
        this.f26119OooOo0O = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() {
        oO000O0O oo000o0o = this.f26122OooOoO0;
        oo000o0o.getClass();
        C2213wy c2213wy = new C2213wy(oo000o0o);
        ArrayList arrayList = new ArrayList();
        if (c2213wy.f25423OooO0OO != null) {
            arrayList.add(Integer.toString(6));
        }
        if (c2213wy.f25421OooO00o != null) {
            arrayList.add(Integer.toString(1));
        }
        if (c2213wy.f25422OooO0O0 != null) {
            arrayList.add(Integer.toString(2));
        }
        SimpleArrayMap simpleArrayMap = c2213wy.f25425OooO0o;
        if (!simpleArrayMap.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (c2213wy.f25426OooO0o0 != null) {
            arrayList.add(Integer.toString(7));
        }
        ud0 ud0Var = this.f26118OooOo;
        ud0Var.f24629OooO0o = arrayList;
        ArrayList arrayList2 = new ArrayList(simpleArrayMap.size());
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            arrayList2.add((String) simpleArrayMap.keyAt(i));
        }
        ud0Var.f24631OooO0oO = arrayList2;
        if (ud0Var.f24626OooO0O0 == null) {
            ud0Var.f24626OooO0O0 = zzs.zzc();
        }
        zzbl zzblVar = this.f26121OooOoO;
        return new a90(this.f26119OooOo0O, this.f26120OooOo0o, this.f26118OooOo, c2213wy, zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(InterfaceC1524ea interfaceC1524ea) {
        this.f26122OooOoO0.f22430OooOo0o = interfaceC1524ea;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(InterfaceC1598ga interfaceC1598ga) {
        this.f26122OooOoO0.f22429OooOo0O = interfaceC1598ga;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, InterfaceC1819ma interfaceC1819ma, InterfaceC1708ja interfaceC1708ja) {
        oO000O0O oo000o0o = this.f26122OooOoO0;
        ((SimpleArrayMap) oo000o0o.f22433OooOoOO).put(str, interfaceC1819ma);
        if (interfaceC1708ja != null) {
            ((SimpleArrayMap) oo000o0o.f22434OooOoo0).put(str, interfaceC1708ja);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(InterfaceC1601gd interfaceC1601gd) {
        this.f26122OooOoO0.f22431OooOoO = interfaceC1601gd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(InterfaceC1930pa interfaceC1930pa, zzs zzsVar) {
        this.f26122OooOoO0.f22432OooOoO0 = interfaceC1930pa;
        this.f26118OooOo.f24626OooO0O0 = zzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(InterfaceC2041sa interfaceC2041sa) {
        this.f26122OooOoO0.f22428OooOo = interfaceC2041sa;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) {
        this.f26121OooOoO = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        ud0 ud0Var = this.f26118OooOo;
        ud0Var.f24633OooOO0 = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            ud0Var.f24630OooO0o0 = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(C1418bd c1418bd) {
        ud0 ud0Var = this.f26118OooOo;
        ud0Var.f24635OooOOO = c1418bd;
        ud0Var.f24628OooO0Oo = new zzga(false, true, false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(C1414b9 c1414b9) {
        this.f26118OooOo.f24632OooO0oo = c1414b9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        ud0 ud0Var = this.f26118OooOo;
        ud0Var.f24634OooOO0O = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            ud0Var.f24630OooO0o0 = publisherAdViewOptions.zzc();
            ud0Var.OooOO0o = publisherAdViewOptions.zza();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcqVar) {
        this.f26118OooOo.OooOo0 = zzcqVar;
    }
}
