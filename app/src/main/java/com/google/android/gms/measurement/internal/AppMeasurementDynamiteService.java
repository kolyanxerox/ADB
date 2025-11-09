package com.google.android.gms.measurement.internal;

import Oooo.OooOo00;
import Oooo00O.o000000O;
import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import OoooOOO.o00OOOO0;
import OoooOOO.o00OOOOo;
import OoooOOO.o0O00OO;
import OoooOOO.o0O0O0o0;
import OoooOOO.o0O0OOOo;
import OoooOOO.o0O0oo0o;
import OoooOOO.o0OO0o;
import OoooOOO.o0OO0o00;
import OoooOOO.o0OO0oO0;
import OoooOOO.o0OOOO0o;
import OoooOOO.o0oOOo;
import OoooOOO.oO0000Oo;
import OoooOOO.oO000O0O;
import OoooOOO.oO000OOo;
import OoooOOO.oO00O0oO;
import OoooOOO.oO00OOO;
import OoooOOO.oO00OOo0;
import OoooOOO.oO00o000;
import OoooOOO.oO0O0OoO;
import OoooOOO.oO0OO0O;
import OoooOOO.oO0OOo0o;
import OoooOOO.oO0Oo0oo;
import OoooOOO.oO0Ooooo;
import OoooOOO.oO0o0o;
import OoooOOO.oOO00OO;
import OoooOOO.ooo0o;
import OoooOOO.ooooO000;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.o0000O0O;
import com.google.android.gms.internal.measurement.o0000OO0;
import com.google.android.gms.internal.measurement.o0000Ooo;
import com.google.android.gms.internal.measurement.o0000oo;
import com.google.android.gms.internal.measurement.o000O00;
import com.google.android.gms.internal.measurement.o000O000;
import com.google.android.gms.internal.measurement.o000O0o;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o00000oO.OooOOO0;
import o000OOoO.OooO;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends o0000Ooo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public o0OO0oO0 f27227OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayMap f27228OooOo0o;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f27227OooOo0O = null;
        this.f27228OooOo0o = new ArrayMap();
    }

    public final void OooOOO(String str, o0000oo o0000ooVar) {
        zzb();
        oOO00OO ooo00oo = this.f27227OooOo0O.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        ooo00oo.OoooO0(str, o0000ooVar);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        o0oOOo o0oooo = this.f27227OooOo0O.f14526Oooo0;
        o0OO0oO0.OooOO0(o0oooo);
        o0oooo.OooOO0o(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOoO0(str, bundle, str2);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOO0o();
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new OooOOO0(oo0o0ooo, (Boolean) null));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        o0oOOo o0oooo = this.f27227OooOo0O.f14526Oooo0;
        o0OO0oO0.OooOO0(o0oooo);
        o0oooo.OooOOO0(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void generateEventId(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oOO00OO ooo00oo = this.f27227OooOo0O.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        long jOooooOo = ooo00oo.OooooOo();
        zzb();
        oOO00OO ooo00oo2 = this.f27227OooOo0O.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo2);
        ooo00oo2.OoooO0O(o0000ooVar, jOooooOo);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getAppInstanceId(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        o0OO0o00 o0oo0o00 = this.f27227OooOo0O.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new o0OO0o(this, o0000ooVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getCachedAppInstanceId(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        OooOOO((String) oo0o0ooo.f14730OooOoo0.get(), o0000ooVar);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getConditionalUserProperties(String str, String str2, o0000oo o0000ooVar) throws RemoteException {
        zzb();
        o0OO0o00 o0oo0o00 = this.f27227OooOo0O.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new o0OOOO0o((Object) this, (Object) o0000ooVar, str, (Object) str2, 4));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getCurrentScreenClass(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO00o000 oo00o000 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        oO00OOo0 oo00ooo0 = oo00o000.f14683OooOo;
        OooOOO(oo00ooo0 != null ? oo00ooo0.f14659OooO0O0 : null, o0000ooVar);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getCurrentScreenName(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO00o000 oo00o000 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        oO00OOo0 oo00ooo0 = oo00o000.f14683OooOo;
        OooOOO(oo00ooo0 != null ? oo00ooo0.f14658OooO00o : null, o0000ooVar);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getGmpAppId(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        OooOOO(oo0o0ooo.OooOoO(), o0000ooVar);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getMaxUserProperties(String str, o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        o000000O.OooO0o0(str);
        ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).getClass();
        zzb();
        oOO00OO ooo00oo = this.f27227OooOo0O.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        ooo00oo.OoooO(o0000ooVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getSessionId(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new OooOOO0(oo0o0ooo, o0000ooVar));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getTestFlag(o0000oo o0000ooVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            oOO00OO ooo00oo = this.f27227OooOo0O.f14523OooOooO;
            o0OO0oO0.OooOO0O(ooo00oo);
            oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo);
            AtomicReference atomicReference = new AtomicReference();
            o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            ooo00oo.OoooO0((String) o0oo0o00.OooOo0(atomicReference, 15000L, "String test flag value", new oO0Oo0oo(oo0o0ooo, atomicReference, 1)), o0000ooVar);
            return;
        }
        if (i == 1) {
            oOO00OO ooo00oo2 = this.f27227OooOo0O.f14523OooOooO;
            o0OO0oO0.OooOO0O(ooo00oo2);
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            AtomicReference atomicReference2 = new AtomicReference();
            o0OO0o00 o0oo0o002 = ((o0OO0oO0) oo0o0ooo2.f14574OooOo0O).f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o002);
            ooo00oo2.OoooO0O(o0000ooVar, ((Long) o0oo0o002.OooOo0(atomicReference2, 15000L, "long test flag value", new oO0Oo0oo(oo0o0ooo2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            oOO00OO ooo00oo3 = this.f27227OooOo0O.f14523OooOooO;
            o0OO0oO0.OooOO0O(ooo00oo3);
            oO0O0OoO oo0o0ooo3 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo3);
            AtomicReference atomicReference3 = new AtomicReference();
            o0OO0o00 o0oo0o003 = ((o0OO0oO0) oo0o0ooo3.f14574OooOo0O).f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o003);
            double dDoubleValue = ((Double) o0oo0o003.OooOo0(atomicReference3, 15000L, "double test flag value", new oO0Oo0oo(oo0o0ooo3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, dDoubleValue);
            try {
                o0000ooVar.o0000oO0(bundle);
                return;
            } catch (RemoteException e) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ooo00oo3.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            oOO00OO ooo00oo4 = this.f27227OooOo0O.f14523OooOooO;
            o0OO0oO0.OooOO0O(ooo00oo4);
            oO0O0OoO oo0o0ooo4 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo4);
            AtomicReference atomicReference4 = new AtomicReference();
            o0OO0o00 o0oo0o004 = ((o0OO0oO0) oo0o0ooo4.f14574OooOo0O).f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o004);
            ooo00oo4.OoooO(o0000ooVar, ((Integer) o0oo0o004.OooOo0(atomicReference4, 15000L, "int test flag value", new oO0Oo0oo(oo0o0ooo4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        oOO00OO ooo00oo5 = this.f27227OooOo0O.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo5);
        oO0O0OoO oo0o0ooo5 = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo5);
        AtomicReference atomicReference5 = new AtomicReference();
        o0OO0o00 o0oo0o005 = ((o0OO0oO0) oo0o0ooo5.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o005);
        ooo00oo5.o000oOoO(o0000ooVar, ((Boolean) o0oo0o005.OooOo0(atomicReference5, 15000L, "boolean test flag value", new oO0Oo0oo(oo0o0ooo5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void getUserProperties(String str, String str2, boolean z, o0000oo o0000ooVar) throws RemoteException {
        zzb();
        o0OO0o00 o0oo0o00 = this.f27227OooOo0O.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO0Ooooo(this, o0000ooVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void initialize(OooO0O0 oooO0O0, o000O0o o000o0o2, long j) throws RemoteException {
        o0OO0oO0 o0oo0oo0 = this.f27227OooOo0O;
        if (o0oo0oo0 == null) {
            Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
            o000000O.OooO0oo(context);
            this.f27227OooOo0O = o0OO0oO0.OooOOoo(context, o000o0o2, Long.valueOf(j));
        } else {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0O0("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void isDataCollectionEnabled(o0000oo o0000ooVar) throws RemoteException {
        zzb();
        o0OO0o00 o0oo0o00 = this.f27227OooOo0O.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new o0OO0o(this, o0000ooVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOOOo(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void logEventAndBundle(String str, String str2, Bundle bundle, o0000oo o0000ooVar, long j) throws RemoteException {
        zzb();
        o000000O.OooO0o0(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        o00OOOOo o00ooooo = new o00OOOOo(str2, new o00OOOO0(bundle), "app", j);
        o0OO0o00 o0oo0o00 = this.f27227OooOo0O.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new o0OOOO0o(this, o0000ooVar, o00ooooo, str));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void logHealthData(int i, @NonNull String str, @NonNull OooO0O0 oooO0O0, @NonNull OooO0O0 oooO0O02, @NonNull OooO0O0 oooO0O03) throws RemoteException {
        zzb();
        Object objO000O0oO = oooO0O0 == null ? null : OooO0OO.o000O0oO(oooO0O0);
        Object objO000O0oO2 = oooO0O02 == null ? null : OooO0OO.o000O0oO(oooO0O02);
        Object objO000O0oO3 = oooO0O03 != null ? OooO0OO.o000O0oO(oooO0O03) : null;
        o0O0O0o0 o0o0o0o0 = this.f27227OooOo0O.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.OooOo00(i, true, false, str, objO000O0oO, objO000O0oO2, objO000O0oO3);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityCreated(@NonNull OooO0O0 oooO0O0, @NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivityCreatedByScionActivityInfo(o000O00.OooO0o0(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityCreatedByScionActivityInfo(o000O00 o000o002, Bundle bundle, long j) {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO0OOo0o oo0ooo0o = oo0o0ooo.f14725OooOo;
        if (oo0ooo0o != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
            oo0ooo0o.OooO00o(o000o002, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityDestroyed(@NonNull OooO0O0 oooO0O0, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivityDestroyedByScionActivityInfo(o000O00.OooO0o0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityDestroyedByScionActivityInfo(o000O00 o000o002, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO0OOo0o oo0ooo0o = oo0o0ooo.f14725OooOo;
        if (oo0ooo0o != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
            oo0ooo0o.OooO0O0(o000o002);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityPaused(@NonNull OooO0O0 oooO0O0, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivityPausedByScionActivityInfo(o000O00.OooO0o0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityPausedByScionActivityInfo(o000O00 o000o002, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO0OOo0o oo0ooo0o = oo0o0ooo.f14725OooOo;
        if (oo0ooo0o != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
            oo0ooo0o.OooO0OO(o000o002);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityResumed(@NonNull OooO0O0 oooO0O0, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivityResumedByScionActivityInfo(o000O00.OooO0o0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityResumedByScionActivityInfo(o000O00 o000o002, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO0OOo0o oo0ooo0o = oo0o0ooo.f14725OooOo;
        if (oo0ooo0o != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
            oo0ooo0o.OooO0Oo(o000o002);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivitySaveInstanceState(OooO0O0 oooO0O0, o0000oo o0000ooVar, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivitySaveInstanceStateByScionActivityInfo(o000O00.OooO0o0(activity), o0000ooVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivitySaveInstanceStateByScionActivityInfo(o000O00 o000o002, o0000oo o0000ooVar, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oO0OOo0o oo0ooo0o = oo0o0ooo.f14725OooOo;
        Bundle bundle = new Bundle();
        if (oo0ooo0o != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
            oo0ooo0o.OooO0o0(o000o002, bundle);
        }
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = this.f27227OooOo0O.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityStarted(@NonNull OooO0O0 oooO0O0, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivityStartedByScionActivityInfo(o000O00.OooO0o0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityStartedByScionActivityInfo(o000O00 o000o002, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        if (oo0o0ooo.f14725OooOo != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityStopped(@NonNull OooO0O0 oooO0O0, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        onActivityStoppedByScionActivityInfo(o000O00.OooO0o0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void onActivityStoppedByScionActivityInfo(o000O00 o000o002, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        if (oo0o0ooo.f14725OooOo != null) {
            oO0O0OoO oo0o0ooo2 = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo2);
            oo0o0ooo2.OooOooO();
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void performAction(Bundle bundle, o0000oo o0000ooVar, long j) throws RemoteException {
        zzb();
        o0000ooVar.o0000oO0(null);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void registerOnMeasurementEventListener(o0000OO0 o0000oo02) throws RemoteException {
        Object ooooo000;
        zzb();
        ArrayMap arrayMap = this.f27228OooOo0o;
        synchronized (arrayMap) {
            try {
                ooooo000 = (oO0000Oo) arrayMap.get(Integer.valueOf(o0000oo02.zzf()));
                if (ooooo000 == null) {
                    ooooo000 = new ooooO000(this, o0000oo02);
                    arrayMap.put(Integer.valueOf(o0000oo02.zzf()), ooooo000);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOO0o();
        if (oo0o0ooo.f14726OooOoO.add(ooooo000)) {
            return;
        }
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14396OooOooO.OooO0O0("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.f14730OooOoo0.set(null);
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO0o0o(oo0o0ooo, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void retrieveAndUploadBatches(o0000O0O o0000o0o2) throws MalformedURLException {
        oO00OOO oo00ooo;
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOO0o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        if (o0oo0o00.OooOOo0()) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        if (Thread.currentThread() == o0oo0o002.f14508OooOoO0) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0O0("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (OooO.OooO0o0()) {
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14393OooOoOO.OooO0O0("Cannot retrieve and upload batches from main thread");
            return;
        }
        o0O0O0o0 o0o0o0o04 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o04);
        o0o0o0o04.f14398Oooo0.OooO0O0("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            o0O0O0o0 o0o0o0o05 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o05);
            o0o0o0o05.f14398Oooo0.OooO0O0("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            o0OO0o00 o0oo0o003 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o003);
            o0oo0o003.OooOo0(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "[sgtm] Getting upload batches", new oO0Oo0oo(oo0o0ooo, atomicReference, 6, false));
            oO0OO0O oo0oo0o = (oO0OO0O) atomicReference.get();
            if (oo0oo0o == null) {
                break;
            }
            List list = oo0oo0o.zza;
            if (list.isEmpty()) {
                break;
            }
            o0O0O0o0 o0o0o0o06 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o06);
            o0o0o0o06.f14398Oooo0.OooO0OO(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ooo0o ooo0oVar = (ooo0o) it.next();
                try {
                    URL url = new URI(ooo0oVar.zzc).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    o0O00OO o0o00ooOooOOo = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).OooOOo();
                    o0o00ooOooOOo.OooOO0o();
                    o000000O.OooO0oo(o0o00ooOooOOo.f14340OooOoo0);
                    String str = o0o00ooOooOOo.f14340OooOoo0;
                    o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
                    o0O0O0o0 o0o0o0o07 = o0oo0oo02.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o07);
                    o0O0oo0o o0o0oo0o = o0o0o0o07.f14398Oooo0;
                    Long lValueOf = Long.valueOf(ooo0oVar.zza);
                    o0o0oo0o.OooO0o0("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, ooo0oVar.zzc, Integer.valueOf(ooo0oVar.zzb.length));
                    if (!TextUtils.isEmpty(ooo0oVar.zzg)) {
                        o0O0O0o0 o0o0o0o08 = o0oo0oo02.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o08);
                        o0o0o0o08.f14398Oooo0.OooO0Oo(lValueOf, "[sgtm] Uploading data from app. row_id", ooo0oVar.zzg);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = ooo0oVar.zzd;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    oO00O0oO oo00o0oo = o0oo0oo02.f14530Oooo0O0;
                    o0OO0oO0.OooOOO0(oo00o0oo);
                    byte[] bArr = ooo0oVar.zzb;
                    OooOo00 oooOo00 = new OooOo00(oo0o0ooo, atomicReference2, ooo0oVar, 12);
                    oo00o0oo.OooOOO0();
                    o000000O.OooO0oo(url);
                    o000000O.OooO0oo(bArr);
                    o0OO0o00 o0oo0o004 = ((o0OO0oO0) oo00o0oo.f14574OooOo0O).f14522OooOoo0;
                    o0OO0oO0.OooOOO0(o0oo0o004);
                    o0oo0o004.OooOo0o(new o0O0OOOo(oo00o0oo, str, url, bArr, map, oooOo00));
                    try {
                        oOO00OO ooo00oo = o0oo0oo02.f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo);
                        o0OO0oO0 o0oo0oo03 = (o0OO0oO0) ooo00oo.f14574OooOo0O;
                        o0oo0oo03.f14527Oooo000.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    o0oo0oo03.f14527Oooo000.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        o0O0O0o0 o0o0o0o09 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o09);
                        o0o0o0o09.f14396OooOooO.OooO0O0("[sgtm] Interrupted waiting for uploading batch");
                    }
                    oo00ooo = atomicReference2.get() == null ? oO00OOO.UNKNOWN : (oO00OOO) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    o0O0O0o0 o0o0o0o010 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o010);
                    o0o0o0o010.f14393OooOoOO.OooO0o0("[sgtm] Bad upload url for row_id", ooo0oVar.zzc, Long.valueOf(ooo0oVar.zza), e);
                    oo00ooo = oO00OOO.FAILURE;
                }
                if (oo00ooo != oO00OOO.SUCCESS) {
                    if (oo00ooo == oO00OOO.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        o0O0O0o0 o0o0o0o011 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o011);
        o0o0o0o011.f14398Oooo0.OooO0Oo(Integer.valueOf(size), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i));
        try {
            o0000o0o2.zze();
        } catch (RemoteException e2) {
            o0OO0oO0 o0oo0oo04 = this.f27227OooOo0O;
            o000000O.OooO0oo(o0oo0oo04);
            o0O0O0o0 o0o0o0o012 = o0oo0oo04.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o012);
            o0o0o0o012.f14396OooOooO.OooO0OO(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            o0O0O0o0 o0o0o0o0 = this.f27227OooOo0O.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Conditional user property must not be null");
        } else {
            oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOo(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOooo(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setCurrentScreen(@NonNull OooO0O0 oooO0O0, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        o000000O.OooO0oo(activity);
        setCurrentScreenByScionActivityInfo(o000O00.OooO0o0(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.o0000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.o000O00 r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.o000O00, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOO0o();
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO000O0O(oo0o0ooo, z));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO000OOo(oo0o0ooo, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setEventInterceptor(o0000OO0 o0000oo02) throws RemoteException {
        zzb();
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(this, o0000oo02);
        o0OO0o00 o0oo0o00 = this.f27227OooOo0O.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        if (!o0oo0o00.OooOOo0()) {
            o0OO0o00 o0oo0o002 = this.f27227OooOo0O.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o002);
            o0oo0o002.OooOo00(new OooOOO0(this, oooOOO0));
            return;
        }
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOO0O();
        oo0o0ooo.OooOO0o();
        OooO0oO.OooOOO0 oooOOO02 = oo0o0ooo.f14727OooOoO0;
        if (oooOOO0 != oooOOO02) {
            o000000O.OooOO0O(oooOOO02 == null, "EventInterceptor already set.");
        }
        oo0o0ooo.f14727OooOoO0 = oooOOO0;
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setInstanceIdProvider(o000O000 o000o0002) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        Boolean boolValueOf = Boolean.valueOf(z);
        oo0o0ooo.OooOO0o();
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new OooOOO0(oo0o0ooo, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO0o0o(oo0o0ooo, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        Uri data = intent.getData();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        if (data == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14400Oooo00O.OooO0O0("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14400Oooo00O.OooO0O0("[sgtm] Preview Mode was not enabled.");
            o0oo0oo0.f14519OooOoO0.f14120OooOo = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o03);
        o0o0o0o03.f14400Oooo00O.OooO0OO(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        o0oo0oo0.f14519OooOoO0.f14120OooOo = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        zzb();
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        if (str != null && TextUtils.isEmpty(str)) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0O0("User ID must be non-empty or null");
        } else {
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(new OooOOO0(13, oo0o0ooo, str));
            oo0o0ooo.OooOo0(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull OooO0O0 oooO0O0, boolean z, long j) throws SecurityException, RemoteException {
        zzb();
        Object objO000O0oO = OooO0OO.o000O0oO(oooO0O0);
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOo0(str, str2, objO000O0oO, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public void unregisterOnMeasurementEventListener(o0000OO0 o0000oo02) throws RemoteException {
        Object ooooo000;
        zzb();
        ArrayMap arrayMap = this.f27228OooOo0o;
        synchronized (arrayMap) {
            ooooo000 = (oO0000Oo) arrayMap.remove(Integer.valueOf(o0000oo02.zzf()));
        }
        if (ooooo000 == null) {
            ooooo000 = new ooooO000(this, o0000oo02);
        }
        oO0O0OoO oo0o0ooo = this.f27227OooOo0O.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOO0o();
        if (oo0o0ooo.f14726OooOoO.remove(ooooo000)) {
            return;
        }
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14396OooOooO.OooO0O0("OnEventListener had not been registered");
    }

    public final void zzb() {
        if (this.f27227OooOo0O == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
