package com.google.android.gms.common.api.internal;

import OooOooo.o000O0;
import OooOooo.o000Oo0;
import Oooo00O.o000OO;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.collection.ArraySet;
import androidx.core.app.PendingIntentCompat;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class OooO0o implements Handler.Callback {

    /* renamed from: Oooo0o */
    public static OooO0o f16696Oooo0o;

    /* renamed from: OooOo */
    public Oooo00O.o000oOoO f16698OooOo;

    /* renamed from: OooOo0O */
    public long f16699OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f16700OooOo0o;

    /* renamed from: OooOoO */
    public final Context f16701OooOoO;

    /* renamed from: OooOoO0 */
    public Oooo0.OooO0O0 f16702OooOoO0;

    /* renamed from: OooOoOO */
    public final o000O0 f16703OooOoOO;

    /* renamed from: OooOoo */
    public final AtomicInteger f16704OooOoo;

    /* renamed from: OooOoo0 */
    public final OooO0oO.OooOOO0 f16705OooOoo0;

    /* renamed from: OooOooO */
    public final AtomicInteger f16706OooOooO;

    /* renamed from: OooOooo */
    public final ConcurrentHashMap f16707OooOooo;

    /* renamed from: Oooo0 */
    public volatile boolean f16708Oooo0;

    /* renamed from: Oooo000 */
    public final ArraySet f16709Oooo000;

    /* renamed from: Oooo00O */
    public final ArraySet f16710Oooo00O;

    /* renamed from: Oooo00o */
    public final OoooO0.OooOO0O f16711Oooo00o;

    /* renamed from: Oooo0O0 */
    public static final Status f16694Oooo0O0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: Oooo0OO */
    public static final Status f16695Oooo0OO = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: Oooo0o0 */
    public static final Object f16697Oooo0o0 = new Object();

    public OooO0o(Context context, Looper looper) {
        o000O0 o000o0 = o000O0.f13666OooO0Oo;
        this.f16699OooOo0O = WorkRequest.MIN_BACKOFF_MILLIS;
        this.f16700OooOo0o = false;
        this.f16704OooOoo = new AtomicInteger(1);
        this.f16706OooOooO = new AtomicInteger(0);
        this.f16707OooOooo = new ConcurrentHashMap(5, 0.75f, 1);
        this.f16709Oooo000 = new ArraySet();
        this.f16710Oooo00O = new ArraySet();
        this.f16708Oooo0 = true;
        this.f16701OooOoO = context;
        OoooO0.OooOO0O oooOO0O = new OoooO0.OooOO0O(looper, this);
        Looper.getMainLooper();
        this.f16711Oooo00o = oooOO0O;
        this.f16703OooOoOO = o000o0;
        this.f16705OooOoo0 = new OooO0oO.OooOOO0(10);
        PackageManager packageManager = context.getPackageManager();
        if (Oooo0OO.o00oO0o.f13850OooO0oO == null) {
            Oooo0OO.o00oO0o.f13850OooO0oO = Boolean.valueOf(Oooo0OO.o00oO0o.OooO0oo() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (Oooo0OO.o00oO0o.f13850OooO0oO.booleanValue()) {
            this.f16708Oooo0 = false;
        }
        oooOO0O.sendMessage(oooOO0O.obtainMessage(6));
    }

    public static Status OooO0OO(OooO00o oooO00o, o000Oo0 o000oo02) {
        return new Status(17, androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("API: ", (String) oooO00o.f16686OooO0O0.f13278OooOo, " is not available on this device. Connection failed with: ", String.valueOf(o000oo02)), o000oo02.OooO0oO(), o000oo02);
    }

    public static OooO0o OooO0o0(Context context) {
        OooO0o oooO0o;
        HandlerThread handlerThread;
        synchronized (f16697Oooo0o0) {
            if (f16696Oooo0o == null) {
                synchronized (o000OO.f13812OooO0oO) {
                    try {
                        handlerThread = o000OO.f13811OooO;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            o000OO.f13811OooO = handlerThread2;
                            handlerThread2.start();
                            handlerThread = o000OO.f13811OooO;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = o000O0.f13665OooO0OO;
                f16696Oooo0o = new OooO0o(applicationContext, looper);
            }
            oooO0o = f16696Oooo0o;
        }
        return oooO0o;
    }

    public final boolean OooO00o() {
        if (this.f16700OooOo0o) {
            return false;
        }
        Oooo00O.Oooo0 oooo0 = (Oooo00O.Oooo0) Oooo00O.Oooo000.OooO0O0().f13781OooOo0O;
        if (oooo0 != null && !oooo0.OooO0oO()) {
            return false;
        }
        int i = ((SparseIntArray) this.f16705OooOoo0.f13280OooOo0o).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean OooO0O0(o000Oo0 o000oo02, int i) throws Resources.NotFoundException {
        PendingIntent activity;
        o000O0 o000o0 = this.f16703OooOoOO;
        o000o0.getClass();
        Context context = this.f16701OooOoO;
        if (!Oooo0o0.OooO.OooOOo0(context)) {
            if (o000oo02.OooO()) {
                activity = o000oo02.OooO0oO();
            } else {
                Intent intentOooO0O0 = o000o0.OooO0O0(context, null, o000oo02.OooO0o0());
                activity = intentOooO0O0 == null ? null : PendingIntentCompat.getActivity(context, 0, intentOooO0O0, 134217728, false);
            }
            if (activity != null) {
                int iOooO0o0 = o000oo02.OooO0o0();
                int i2 = GoogleApiActivity.f16681OooOo0o;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                o000o0.OooO0oo(context, iOooO0o0, PendingIntent.getActivity(context, 0, intent, OoooO00.OooOo00.f13899OooO00o | 134217728));
                return true;
            }
        }
        return false;
    }

    public final Oooo0 OooO0Oo(Oooo000.OooOO0 oooOO0) {
        ConcurrentHashMap concurrentHashMap = this.f16707OooOooo;
        OooO00o oooO00o = oooOO0.f13727OooOoO;
        Oooo0 oooo0 = (Oooo0) concurrentHashMap.get(oooO00o);
        if (oooo0 == null) {
            oooo0 = new Oooo0(this, oooOO0);
            concurrentHashMap.put(oooO00o, oooo0);
        }
        if (oooo0.f16715OooOo0o.requiresSignIn()) {
            this.f16710Oooo00O.add(oooO00o);
        }
        oooo0.OooOO0O();
        return oooo0;
    }

    public final void OooO0o(o000Oo0 o000oo02, int i) {
        if (OooO0O0(o000oo02, i)) {
            return;
        }
        OoooO0.OooOO0O oooOO0O = this.f16711Oooo00o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(5, i, 0, o000oo02));
    }

    /* JADX WARN: Removed duplicated region for block: B:378:0x030c  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.OooO0o.handleMessage(android.os.Message):boolean");
    }
}
