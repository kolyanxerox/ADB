package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzj;

/* loaded from: classes2.dex */
public final class o50 extends Oooo0o.OooO {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final SparseArray f22336OooO0oo;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Context f22337OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1618gu f22338OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final m50 f22339OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final TelephonyManager f22340OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public EnumC1852n6 f22341OooO0oO;

    static {
        SparseArray sparseArray = new SparseArray();
        f22336OooO0oo = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC1446c5.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC1446c5 enumC1446c5 = EnumC1446c5.CONNECTING;
        sparseArray.put(iOrdinal, enumC1446c5);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC1446c5);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC1446c5);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC1446c5.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC1446c5 enumC1446c52 = EnumC1446c5.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC1446c52);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC1446c52);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC1446c52);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC1446c52);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC1446c52);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC1446c5.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC1446c5);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC1446c5);
    }

    public o50(Context context, C1618gu c1618gu, m50 m50Var, C1548ey c1548ey, zzj zzjVar) {
        super(c1548ey, zzjVar);
        this.f22337OooO0OO = context;
        this.f22338OooO0Oo = c1618gu;
        this.f22339OooO0o = m50Var;
        this.f22340OooO0o0 = (TelephonyManager) context.getSystemService("phone");
    }
}
