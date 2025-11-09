package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3912zo;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.c1 */
/* loaded from: classes2.dex */
public final class RunnableC1442c1 implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f17644OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f17645OooOo0o;

    public /* synthetic */ RunnableC1442c1(Context context, String str) {
        this.f17644OooOo0O = 12;
        this.f17645OooOo0o = context;
    }

    private final void OooO00o() {
        oOo0o00 ooo0o00 = (oOo0o00) this.f17645OooOo0o;
        synchronized (ooo0o00) {
            try {
                com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = (com.google.android.gms.internal.measurement.o0OOO00) ooo0o00.f22922OooOoO0;
                if (o0ooo00.f26563OooOo0O) {
                    InterfaceC1371a3 interfaceC1371a3 = (InterfaceC1371a3) o0ooo00.f26564OooOo0o;
                    byte[] bArr = (byte[]) ooo0o00.f22919OooOo;
                    C2255y2 c2255y2 = (C2255y2) interfaceC1371a3;
                    Parcel parcelOooO = c2255y2.OooO();
                    parcelOooO.writeByteArray(bArr);
                    c2255y2.o000OO0O(parcelOooO, 5);
                    C2255y2 c2255y22 = (C2255y2) ((InterfaceC1371a3) ((com.google.android.gms.internal.measurement.o0OOO00) ooo0o00.f22922OooOoO0).f26564OooOo0o);
                    Parcel parcelOooO2 = c2255y22.OooO();
                    parcelOooO2.writeInt(0);
                    c2255y22.o000OO0O(parcelOooO2, 6);
                    InterfaceC1371a3 interfaceC1371a32 = (InterfaceC1371a3) ((com.google.android.gms.internal.measurement.o0OOO00) ooo0o00.f22922OooOoO0).f26564OooOo0o;
                    int i = ooo0o00.f22921OooOo0o;
                    C2255y2 c2255y23 = (C2255y2) interfaceC1371a32;
                    Parcel parcelOooO3 = c2255y23.OooO();
                    parcelOooO3.writeInt(i);
                    c2255y23.o000OO0O(parcelOooO3, 7);
                    C2255y2 c2255y24 = (C2255y2) ((InterfaceC1371a3) ((com.google.android.gms.internal.measurement.o0OOO00) ooo0o00.f22922OooOoO0).f26564OooOo0o);
                    Parcel parcelOooO4 = c2255y24.OooO();
                    parcelOooO4.writeIntArray(null);
                    c2255y24.o000OO0O(parcelOooO4, 4);
                    C2255y2 c2255y25 = (C2255y2) ((InterfaceC1371a3) ((com.google.android.gms.internal.measurement.o0OOO00) ooo0o00.f22922OooOoO0).f26564OooOo0o);
                    c2255y25.o000OO0O(c2255y25.OooO(), 3);
                }
            } catch (RemoteException e) {
                zzo.zzf("Clearcut log failed", e);
            }
        }
    }

    private final void OooO0O0() {
        LinkedHashMap linkedHashMap;
        OooOOOo.o0ooOOo o0ooooo = (OooOOOo.o0ooOOo) this.f17645OooOo0o;
        while (true) {
            try {
                C1669i7 c1669i7 = (C1669i7) ((ArrayBlockingQueue) o0ooooo.f13431OooO0O0).take();
                C1595g7 c1595g7OooO00o = c1669i7.OooO00o();
                if (!TextUtils.isEmpty(c1595g7OooO00o.f19246OooOo0o)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) o0ooooo.f13432OooO0OO;
                    synchronized (c1669i7.f19971OooO0OO) {
                        zzv.zzp().OooO0OO();
                        linkedHashMap = c1669i7.f19970OooO0O0;
                    }
                    o0ooooo.OooO0o(o0ooooo.OooO0Oo(linkedHashMap2, linkedHashMap), c1595g7OooO00o);
                }
            } catch (InterruptedException e) {
                zzo.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void OooO0OO() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j;
        long j2;
        long j3;
        long j4;
        C2017rn c2017rn = (C2017rn) this.f17645OooOo0o;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(c2017rn.f23914OooOoO)));
        try {
            jLongValue = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17744Oooo0OO)).longValue() * 1000;
            jIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17726OooOOoo)).intValue();
            zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue();
        } catch (Exception e) {
            zzo.zzj("Failed to preload url " + c2017rn.f23914OooOoO + " Exception: " + e.getMessage());
            zzv.zzp().OooO0oO("VideoStreamExoPlayerCache.preload", e);
            c2017rn.OooO0oO();
            c2017rn.OooOO0O(c2017rn.f23914OooOoO, strConcat, C3912zo.a.f13038g, C2017rn.OooOo00(e, C3912zo.a.f13038g));
        }
        synchronized (c2017rn) {
            try {
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                if (System.currentTimeMillis() - c2017rn.f23919OooOooO > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (c2017rn.f23916OooOoOO) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!c2017rn.f23918OooOoo0) {
                    b61 b61Var = c2017rn.f23915OooOoO0.f26219OooOoo0;
                    if (!(b61Var != null)) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jO0000oO = b61Var.o0000oO();
                    if (jO0000oO > 0) {
                        long jO0000O00 = c2017rn.f23915OooOoO0.f26219OooOoo0.o0000O00();
                        if (jO0000O00 != c2017rn.f23920OooOooo) {
                            boolean z = jO0000O00 > 0;
                            String str = c2017rn.f23914OooOoO;
                            if (zBooleanValue) {
                                C2313zn c2313zn = c2017rn.f23915OooOoO0;
                                j4 = (c2313zn.f26230Oooo0oO == null || !c2313zn.f26230Oooo0oO.f25018Oooo0O0) ? c2313zn.f26223Oooo000 : 0L;
                            } else {
                                j4 = -1;
                            }
                            long jOooOo0 = zBooleanValue ? c2017rn.f23915OooOoO0.OooOo0() : -1L;
                            j = jIntValue;
                            j2 = jO0000oO;
                            j3 = jO0000O00;
                            zzf.zza.post(new RunnableC1685in(c2017rn, str, strConcat, j3, j2, j4, jOooOo0, zBooleanValue ? c2017rn.f23915OooOoO0.OooOOo0() : -1L, z, C2313zn.f26210Oooo.get(), C2313zn.f26211OoooO00.get()));
                            c2017rn.f23920OooOooo = j3;
                        } else {
                            j = jIntValue;
                            j2 = jO0000oO;
                            j3 = jO0000O00;
                        }
                        if (j3 >= j2) {
                            zzf.zza.post(new RunnableC1832mn(c2017rn, c2017rn.f23914OooOoO, strConcat, j2));
                        } else if (c2017rn.f23915OooOoO0.f26223Oooo000 >= j && j3 > 0) {
                        }
                    }
                    zzs.zza.postDelayed(new RunnableC1442c1(c2017rn, 15), ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17746Oooo0o0)).longValue());
                    return;
                }
                zzv.zzz().f19387OooOo0O.remove(c2017rn.f23917OooOoo);
            } finally {
            }
        }
    }

    private final void OooO0Oo() {
        C1947pr c1947pr = ((C1762kr) this.f17645OooOo0o).f20661OooOo0o.f20938OooO0Oo;
        synchronized (c1947pr) {
            c1947pr.OooO0o0();
            c1947pr.f23407OooOooO = true;
        }
    }

    private final void OooO0o() {
        C2246xu c2246xu = (C2246xu) this.f17645OooOo0o;
        synchronized (c2246xu) {
            zzo.zzg("Timeout waiting for show call succeed to be called.");
            c2246xu.OoooOOo(new C2027rx("Timeout for show call succeed."));
            c2246xu.f25802OooOoO = true;
        }
    }

    private final void OooO0o0() {
        C1435bu c1435bu = (C1435bu) this.f17645OooOo0o;
        synchronized (c1435bu) {
            try {
                if (c1435bu.f17602OooOoO.isDone()) {
                    return;
                }
                c1435bu.f17602OooOoO.OooO0o(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        String packageName;
        boolean z = false;
        switch (this.f17644OooOo0O) {
            case 0:
                synchronized (((C1479d1) this.f17645OooOo0o).f18122Oooo0) {
                    if (((C1479d1) this.f17645OooOo0o).f18126Oooo0O0) {
                        return;
                    }
                    ((C1479d1) this.f17645OooOo0o).f18126Oooo0O0 = true;
                    try {
                        C1479d1.OooO00o((C1479d1) this.f17645OooOo0o);
                    } catch (Exception e) {
                        ((C1479d1) this.f17645OooOo0o).f18117OooOoOO.OooO0oO(2023, -1L, e);
                    }
                    synchronized (((C1479d1) this.f17645OooOo0o).f18122Oooo0) {
                        ((C1479d1) this.f17645OooOo0o).f18126Oooo0O0 = false;
                    }
                    return;
                }
            case 1:
                if (((C1515e1) this.f17645OooOo0o).f18449OooO0O0 != null) {
                    return;
                }
                synchronized (C1515e1.f18445OooO0OO) {
                    if (((C1515e1) this.f17645OooOo0o).f18449OooO0O0 != null) {
                        return;
                    }
                    try {
                        zBooleanValue = ((Boolean) AbstractC1448c7.f17863o00O00o0.OooOOO()).booleanValue();
                    } catch (IllegalStateException unused) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        try {
                            C1515e1.f18446OooO0Oo = ij0.OooO00o(((C1515e1) this.f17645OooOo0o).f18448OooO00o.f24814OooO00o, "ADSHIELD");
                            z = zBooleanValue;
                        } catch (Throwable unused2) {
                        }
                    } else {
                        z = zBooleanValue;
                    }
                    ((C1515e1) this.f17645OooOo0o).f18449OooO0O0 = Boolean.valueOf(z);
                    C1515e1.f18445OooO0OO.open();
                    return;
                }
            case 2:
                ((ViewOnAttachStateChangeListenerC1370a2) this.f17645OooOo0o).OooO0OO();
                return;
            case 3:
                C1922p2 c1922p2 = (C1922p2) this.f17645OooOo0o;
                try {
                    C2143v1 c2143v1 = c1922p2.f23179OooO00o;
                    DexClassLoader dexClassLoader = c2143v1.f24816OooO0OO;
                    byte[] bArr = c2143v1.f24819OooO0o0;
                    String str = c1922p2.f23180OooO0O0;
                    c2143v1.f24817OooO0Oo.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(o0O.OooOOoo(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        C2143v1 c2143v12 = c1922p2.f23179OooO00o;
                        byte[] bArr2 = c2143v12.f24819OooO0o0;
                        String str2 = c1922p2.f23181OooO0OO;
                        c2143v12.f24817OooO0Oo.getClass();
                        c1922p2.f23182OooO0Oo = clsLoadClass.getMethod(new String(o0O.OooOOoo(str2, bArr2), "UTF-8"), c1922p2.f23184OooO0o0);
                    }
                } catch (C1884o1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } catch (Throwable th) {
                    c1922p2.f23183OooO0o.countDown();
                    throw th;
                }
                c1922p2.f23183OooO0o.countDown();
                return;
            case 4:
                ((ViewOnAttachStateChangeListenerC1517e3) this.f17645OooOo0o).OooO0OO(3);
                return;
            case 5:
                synchronized (((C1701j3) this.f17645OooOo0o).f20161OooOo) {
                    C1701j3 c1701j3 = (C1701j3) this.f17645OooOo0o;
                    if (c1701j3.f20165OooOoO0 && c1701j3.f20164OooOoO) {
                        c1701j3.f20165OooOoO0 = false;
                        zzo.zze("App went background");
                        ArrayList arrayList = ((C1701j3) this.f17645OooOo0o).f20166OooOoOO;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            try {
                                ((InterfaceC1738k3) obj).zza(false);
                            } catch (Exception e2) {
                                zzo.zzh("", e2);
                            }
                        }
                    } else {
                        zzo.zze("App is still foreground");
                    }
                }
                return;
            case 6:
                C1592g4.OooO0O0((C1592g4) this.f17645OooOo0o);
                return;
            case 7:
                OooO00o();
                return;
            case 8:
                OooO0O0();
                return;
            case 9:
                C1853n7 c1853n7 = (C1853n7) this.f17645OooOo0o;
                Context context = c1853n7.f21425OooOo0o;
                if (c1853n7.f21426OooOoO != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null) {
                    return;
                }
                CustomTabsClient.bindCustomTabsService(context, packageName, c1853n7);
                return;
            case 10:
                ((C2001r7) this.f17645OooOo0o).OooO0Oo();
                return;
            case 11:
                OooOooo.o000OO00 o000oo002 = (OooOooo.o000OO00) this.f17645OooOo0o;
                if (((C1666i4) o000oo002.f13676OooOo0o) == null) {
                    return;
                }
                ((C1666i4) o000oo002.f13676OooOo0o).disconnect();
                Binder.flushPendingCommands();
                return;
            case 12:
                Context context2 = (Context) this.f17645OooOo0o;
                AbstractC1448c7.OooO00o(context2);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17771o00000)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOo)).booleanValue());
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17821o000OOo)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                o000Ooo.o00oO0o o00oo0o = com.google.android.gms.internal.measurement.o00O00OO.OooO0o0(context2, bundle).f26526OooO0O0;
                try {
                    InterfaceC1650hp interfaceC1650hp = (InterfaceC1650hp) com.google.android.gms.ads.internal.util.client.zzs.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new C2007rd(7));
                    Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(context2);
                    BinderC2006rc binderC2006rc = new BinderC2006rc(o00oo0o);
                    C1576fp c1576fp = (C1576fp) interfaceC1650hp;
                    Parcel parcelOooO = c1576fp.OooO();
                    AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                    AbstractC2218x2.OooO0o0(parcelOooO, binderC2006rc);
                    c1576fp.o000OO0O(parcelOooO, 2);
                    return;
                } catch (RemoteException | zzr | NullPointerException e3) {
                    zzo.zzl("#007 Could not call remote method.", e3);
                    return;
                }
            case 13:
                ((AbstractC1684im) this.f17645OooOo0o).OooOo0o();
                return;
            case 14:
                zzv.zzz().f19387OooOo0O.remove((C1574fn) this.f17645OooOo0o);
                return;
            case 15:
                OooO0OO();
                return;
            case 16:
                InterfaceC1722jo interfaceC1722jo = ((AbstractC1870no) this.f17645OooOo0o).f21527OooOo0O;
                interfaceC1722jo.ooOO();
                zzm zzmVarZzL = interfaceC1722jo.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzz();
                    return;
                }
                return;
            case 17:
                int i2 = AbstractC1870no.f21525Ooooo0o;
                OooOOOo.o0ooOOo o0oooooOooO0OO = zzv.zzp().OooO0OO();
                HashSet hashSet = (HashSet) o0oooooOooO0OO.f13436OooO0oO;
                String str3 = (String) this.f17645OooOo0o;
                if (hashSet.contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) o0oooooOooO0OO.f13434OooO0o);
                linkedHashMap.put("ue", str3);
                o0oooooOooO0OO.OooO0o(o0oooooOooO0OO.OooO0Oo((LinkedHashMap) o0oooooOooO0OO.f13432OooO0OO, linkedHashMap), null);
                return;
            case 18:
                d60 d60VarZzB = zzv.zzB();
                yg0 yg0Var = ((f60) this.f17645OooOo0o).f18791OooO00o;
                ((C1658hx) d60VarZzB).getClass();
                C1658hx.OooOOOo(new b60(yg0Var, 1));
                return;
            case 19:
                ((C1762kr) this.f17645OooOo0o).f20661OooOo0o.f20938OooO0Oo.OooO00o();
                return;
            case 20:
                OooO0Oo();
                return;
            case 21:
                C1505ds c1505ds = (C1505ds) this.f17645OooOo0o;
                InterfaceC1930pa interfaceC1930pa = c1505ds.f18400OooOOOO.f25424OooO0Oo;
                if (interfaceC1930pa == null) {
                    return;
                }
                try {
                    interfaceC1930pa.o0000o0o((zzby) c1505ds.f18403OooOOo0.zzb(), new Oooo0o.OooO0OO(c1505ds.f18396OooOO0));
                    return;
                } catch (RemoteException e4) {
                    zzo.zzh("RemoteException when notifyAdLoad is called", e4);
                    return;
                }
            case 22:
                Runnable runnable = (Runnable) ((AtomicReference) this.f17645OooOo0o).getAndSet(null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                ((C1727jt) this.f17645OooOo0o).f20385OooOo0O = false;
                return;
            case 24:
                C2208wt c2208wt = (C2208wt) this.f17645OooOo0o;
                af0.OoooOO0(c2208wt.f25399OooOo);
                c2208wt.f25405OooOoo = true;
                return;
            case 25:
                OooO0o0();
                return;
            case 26:
                OooO0o();
                return;
            case 27:
                ((InterfaceC2176vy) this.f17645OooOo0o).zzq();
                return;
            case 28:
                ViewTreeObserverOnGlobalLayoutListenerC1403az viewTreeObserverOnGlobalLayoutListenerC1403az = (ViewTreeObserverOnGlobalLayoutListenerC1403az) this.f17645OooOo0o;
                if (viewTreeObserverOnGlobalLayoutListenerC1403az.f17131OooOoOO == null) {
                    View view = new View(viewTreeObserverOnGlobalLayoutListenerC1403az.f17126OooOo.getContext());
                    viewTreeObserverOnGlobalLayoutListenerC1403az.f17131OooOoOO = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (viewTreeObserverOnGlobalLayoutListenerC1403az.f17126OooOo != viewTreeObserverOnGlobalLayoutListenerC1403az.f17131OooOoOO.getParent()) {
                    viewTreeObserverOnGlobalLayoutListenerC1403az.f17126OooOo.addView(viewTreeObserverOnGlobalLayoutListenerC1403az.f17131OooOoOO);
                    return;
                }
                return;
            default:
                l00 l00Var = (l00) this.f17645OooOo0o;
                try {
                    l00Var.getClass();
                    Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
                    l00Var.o000O0oO();
                    C1917oy c1917oy = l00Var.f20751OooOo;
                    if (c1917oy != null) {
                        c1917oy.OooOOOo();
                    }
                    l00Var.f20751OooOo = null;
                    l00Var.f20752OooOo0O = null;
                    l00Var.f20753OooOo0o = null;
                    l00Var.f20755OooOoO0 = true;
                    return;
                } catch (RemoteException e5) {
                    zzo.zzl("#007 Could not call remote method.", e5);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC1442c1(Object obj, int i) {
        this.f17644OooOo0O = i;
        this.f17645OooOo0o = obj;
    }
}
