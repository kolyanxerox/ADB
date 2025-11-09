package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q00 extends AbstractBinderC2181w2 implements InterfaceC1415ba {

    /* renamed from: OooOo, reason: collision with root package name */
    public C1439bz f23469OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f23470OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2065sy f23471OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public C1917oy f23472OooOoO0;

    public q00(Context context, C2065sy c2065sy, C1439bz c1439bz, C1917oy c1917oy) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f23470OooOo0O = context;
        this.f23471OooOo0o = c2065sy;
        this.f23469OooOo = c1439bz;
        this.f23472OooOoO0 = c1917oy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void OooO0oo(String str) {
        C1917oy c1917oy = this.f23472OooOoO0;
        if (c1917oy != null) {
            synchronized (c1917oy) {
                c1917oy.OooOO0o.OooO(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean OooOO0o(Oooo0o.OooO0O0 oooO0O0) throws SecurityException {
        C1439bz c1439bz;
        InterfaceC1722jo interfaceC1722jo;
        Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        if (!(objO000O0oO instanceof ViewGroup) || (c1439bz = this.f23469OooOo) == null || !c1439bz.OooO0OO((ViewGroup) objO000O0oO, false)) {
            return false;
        }
        C2065sy c2065sy = this.f23471OooOo0o;
        synchronized (c2065sy) {
            interfaceC1722jo = c2065sy.f24187OooOO0;
        }
        interfaceC1722jo.Oooo00O(new p80(this, 16));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean OooOOO0(Oooo0o.OooO0O0 oooO0O0) throws SecurityException {
        C1439bz c1439bz;
        Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        if (!(objO000O0oO instanceof ViewGroup) || (c1439bz = this.f23469OooOo) == null || !c1439bz.OooO0OO((ViewGroup) objO000O0oO, true)) {
            return false;
        }
        this.f23471OooOo0o.OooOOO0().Oooo00O(new p80(this, 16));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void o00000O0(Oooo0o.OooO0O0 oooO0O0) throws SecurityException {
        C1917oy c1917oy;
        Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        if (!(objO000O0oO instanceof View) || this.f23471OooOo0o.OooOOOO() == null || (c1917oy = this.f23472OooOoO0) == null) {
            return;
        }
        c1917oy.OooO0o0((View) objO000O0oO);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws SecurityException {
        C2065sy c2065sy = this.f23471OooOo0o;
        switch (i) {
            case 1:
                String string = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1707j9 interfaceC1707j9Zzg = zzg(string2);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1707j9Zzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strOooO00o = c2065sy.OooO00o();
                parcel2.writeNoException();
                parcel2.writeString(strOooO00o);
                return true;
            case 5:
                String string3 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                OooO0oo(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                zzeb zzebVarOooO = c2065sy.OooO();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarOooO);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                Oooo0o.OooO0O0 oooO0O0Zzh = zzh();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzh);
                return true;
            case 10:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooOOO0 = OooOOO0(oooO0O0O000O0o0);
                parcel2.writeNoException();
                parcel2.writeInt(zOooOOO0 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o00000O0(oooO0O0O000O0o02);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                InterfaceC1634h9 interfaceC1634h9Zzf = zzf();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1634h9Zzf);
                return true;
            case 17:
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooOO0o = OooOO0o(oooO0O0O000O0o03);
                parcel2.writeNoException();
                parcel2.writeInt(zOooOO0o ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final InterfaceC1634h9 zzf() {
        InterfaceC1634h9 interfaceC1634h9;
        try {
            C1991qy c1991qy = this.f23472OooOoO0.f23155OooOoo;
            synchronized (c1991qy) {
                interfaceC1634h9 = c1991qy.f23708OooO00o;
            }
            return interfaceC1634h9;
        } catch (NullPointerException e) {
            zzv.zzp().OooO0oo("InternalNativeCustomTemplateAdShim.getMediaContent", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final InterfaceC1707j9 zzg(String str) {
        SimpleArrayMap simpleArrayMap;
        C2065sy c2065sy = this.f23471OooOo0o;
        synchronized (c2065sy) {
            simpleArrayMap = c2065sy.f24198OooOo0O;
        }
        return (InterfaceC1707j9) simpleArrayMap.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final Oooo0o.OooO0O0 zzh() {
        return new Oooo0o.OooO0OO(this.f23470OooOo0O);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final String zzi() {
        return this.f23471OooOo0o.OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final String zzj(String str) {
        SimpleArrayMap simpleArrayMap;
        C2065sy c2065sy = this.f23471OooOo0o;
        synchronized (c2065sy) {
            simpleArrayMap = c2065sy.f24199OooOo0o;
        }
        return (String) simpleArrayMap.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final List zzk() {
        SimpleArrayMap simpleArrayMap;
        SimpleArrayMap simpleArrayMap2;
        C2065sy c2065sy = this.f23471OooOo0o;
        try {
            synchronized (c2065sy) {
                simpleArrayMap = c2065sy.f24198OooOo0O;
            }
            synchronized (c2065sy) {
                simpleArrayMap2 = c2065sy.f24199OooOo0o;
            }
            String[] strArr = new String[simpleArrayMap.size() + simpleArrayMap2.size()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMap.size(); i2++) {
                strArr[i] = (String) simpleArrayMap.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMap2.size(); i3++) {
                strArr[i] = (String) simpleArrayMap2.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            zzv.zzp().OooO0oo("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void zzl() {
        C1917oy c1917oy = this.f23472OooOoO0;
        if (c1917oy != null) {
            c1917oy.OooOOOo();
        }
        this.f23472OooOoO0 = null;
        this.f23469OooOo = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void zzm() {
        String str;
        try {
            C2065sy c2065sy = this.f23471OooOo0o;
            synchronized (c2065sy) {
                str = c2065sy.f24200OooOoO0;
            }
            if (Objects.equals(str, "Google")) {
                zzo.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            C1917oy c1917oy = this.f23472OooOoO0;
            if (c1917oy != null) {
                c1917oy.OooOOo0(str, false);
            }
        } catch (NullPointerException e) {
            zzv.zzp().OooO0oo("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void zzo() {
        C1917oy c1917oy = this.f23472OooOoO0;
        if (c1917oy != null) {
            synchronized (c1917oy) {
                if (c1917oy.f23151OooOo0o) {
                    return;
                }
                c1917oy.OooOO0o.zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean zzq() {
        C1917oy c1917oy = this.f23472OooOoO0;
        if (c1917oy != null && !c1917oy.f23141OooOOO.OooO0OO()) {
            return false;
        }
        C2065sy c2065sy = this.f23471OooOo0o;
        return c2065sy.OooOO0o() != null && c2065sy.OooOOO0() == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean zzt() {
        C2065sy c2065sy = this.f23471OooOo0o;
        f60 f60VarOooOOOO = c2065sy.OooOOOO();
        if (f60VarOooOOOO == null) {
            zzo.zzj("Trying to start OMID session before creation.");
            return false;
        }
        ((C1658hx) zzv.zzB()).OooOO0O(f60VarOooOOOO.f18791OooO00o);
        if (c2065sy.OooOO0o() == null) {
            return true;
        }
        c2065sy.OooOO0o().OooO0o("onSdkLoaded", new ArrayMap());
        return true;
    }
}
