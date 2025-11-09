package o00000oO;

import OooOooo.o000Oo0;
import Oooo000.OooO0OO;
import Oooo00O.OooO0O0;
import Oooo00O.OooOo00;
import Oooo00O.o000000O;
import Oooo00O.o0000OO0;
import Oooo00O.o00oO0o;
import OoooOOO.o00O0OO0;
import OoooOOO.o00OO;
import OoooOOO.o0O;
import OoooOOO.o0O000O;
import OoooOOO.o0O000o0;
import OoooOOO.o0O0O0o0;
import OoooOOO.o0OO000;
import OoooOOO.o0OO0oO0;
import OoooOOO.o0OOo000;
import OoooOOO.o0oo0000;
import OoooOOO.oO00000o;
import OoooOOO.oO0000o0;
import OoooOOO.oO00OOo0;
import OoooOOO.oO0O000o;
import OoooOOO.oO0O0OoO;
import OoooOOO.oOO0000;
import OoooOOO.oOo0000O;
import OoooOOO.oOo000Oo;
import OoooOOO.oOo000o0;
import OoooOOO.oOo00o0o;
import OoooOOO.oOo0o0oO;
import OoooOOO.oo0O;
import OoooOOo.oOO0O00O;
import OoooOoo.oOO0Oo00;
import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.OooO00o;
import com.google.android.gms.common.api.internal.OooO0o;
import com.google.android.gms.common.api.internal.Oooo0;
import com.google.android.gms.common.api.internal.o0OoOo0;
import com.google.android.gms.common.api.internal.o0ooOOo;
import com.google.android.gms.internal.measurement.o0000oo;
import com.google.android.gms.internal.measurement.o000OOo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import o0000ooO.o0O0OO0;
import o000Ooo0.OooOO0;
import o000ooo.o0000O00;
import o000ooo0.OooOO0O;
import o00O0oOo.o00O00O;
import o00O0oOo.oo0o0Oo;
import o00O0oo0.o0Oo0oo;
import o00OO0.OooO;
import oo00o.OooOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OooOOO0 implements Runnable {

    /* renamed from: OooOo */
    public final Object f29281OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f29282OooOo0O;

    /* renamed from: OooOo0o */
    public Object f29283OooOo0o;

    public /* synthetic */ OooOOO0(int i, Object obj, Object obj2) {
        this.f29282OooOo0O = i;
        this.f29283OooOo0o = obj;
        this.f29281OooOo = obj2;
    }

    private final void OooO() {
        OooOo00 oooOo00;
        o0OoOo0 o0oooo0 = (o0OoOo0) this.f29281OooOo;
        Oooo0 oooo0 = (Oooo0) ((OooO0o) o0oooo0.f16751OooOoOO).f16707OooOooo.get((OooO00o) o0oooo0.f16746OooOo);
        if (oooo0 == null) {
            return;
        }
        o000Oo0 o000oo02 = (o000Oo0) this.f29283OooOo0o;
        if (!o000oo02.OooOO0()) {
            oooo0.OooOOO0(o000oo02, null);
            return;
        }
        o0oooo0.f16747OooOo0O = true;
        OooO0OO oooO0OO = (OooO0OO) o0oooo0.f16748OooOo0o;
        if (oooO0OO.requiresSignIn()) {
            if (!o0oooo0.f16747OooOo0O || (oooOo00 = (OooOo00) o0oooo0.f16750OooOoO0) == null) {
                return;
            }
            oooO0OO.getRemoteService(oooOo00, (Set) o0oooo0.f16749OooOoO);
            return;
        }
        try {
            oooO0OO.getRemoteService(null, oooO0OO.OooO00o());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            oooO0OO.disconnect("Failed to get service from broker.");
            oooo0.OooOOO0(new o000Oo0(10), null);
        }
    }

    private final void OooO00o() throws NumberFormatException {
        oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f29281OooOo;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        o0o.OooOO0O();
        o0o.OooOO0O();
        o00OO o00ooOooO0O0 = o00OO.OooO0O0(o0o.OooOOOO().getString("dma_consent_settings", null));
        o00OO o00oo = (o00OO) this.f29283OooOo0o;
        int i = o00ooOooO0O0.f14136OooO00o;
        int i2 = o00oo.f14136OooO00o;
        boolean zOooOO0o = oO00000o.OooOO0o(i2, i);
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (!zOooOO0o) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14400Oooo00O.OooO0OO(Integer.valueOf(i2), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = o0o.OooOOOO().edit();
        editorEdit.putString("dma_consent_settings", o00oo.f14137OooO0O0);
        editorEdit.apply();
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(o00oo, "Setting DMA consent(FE)");
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        if (o0oo0oo02.OooOOOo().OooOo0()) {
            oOo000o0 ooo000o0OooOOOo = o0oo0oo02.OooOOOo();
            ooo000o0OooOOOo.OooOO0O();
            ooo000o0OooOOOo.OooOO0o();
            ooo000o0OooOOOo.OooOoO0(new oOo000Oo(ooo000o0OooOOOo, 1));
            return;
        }
        oOo000o0 ooo000o0OooOOOo2 = o0oo0oo02.OooOOOo();
        ooo000o0OooOOOo2.OooOO0O();
        ooo000o0OooOOOo2.OooOO0o();
        if (ooo000o0OooOOOo2.OooOo00()) {
            ooo000o0OooOOOo2.OooOoO0(new oOo00o0o(ooo000o0OooOOOo2, ooo000o0OooOOOo2.OooOoOO(false)));
        }
    }

    private final void OooO0O0() {
        oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f29283OooOo0o;
        oo0o0ooo.OooOO0O();
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        o0O o0o = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        SparseArray sparseArrayOooOOo0 = o0o.OooOOo0();
        for (oOo0o0oO ooo0o0oo : (List) this.f29281OooOo) {
            int i = ooo0o0oo.zzc;
            if (!sparseArrayOooOOo0.contains(i) || ((Long) sparseArrayOooOOo0.get(i)).longValue() < ooo0o0oo.zzb) {
                oo0o0ooo.Oooo0().add(ooo0o0oo);
            }
        }
        oo0o0ooo.Oooo0O0();
    }

    private final void OooO0OO() {
        oOo000o0 ooo000o0 = (oOo000o0) this.f29281OooOo;
        o0O000o0 o0o000o0 = ooo000o0.f14857OooOoO0;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) ooo000o0.f14574OooOo0O;
        if (o0o000o0 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to send current screen to service");
            return;
        }
        try {
            oO00OOo0 oo00ooo0 = (oO00OOo0) this.f29283OooOo0o;
            if (oo00ooo0 == null) {
                o0o000o0.o0000Ooo(0L, null, null, o0oo0oo0.f14516OooOo0O.getPackageName());
            } else {
                o0o000o0.o0000Ooo(oo00ooo0.f14660OooO0OO, oo00ooo0.f14658OooO00o, oo00ooo0.f14659OooO0O0, o0oo0oo0.f14516OooOo0O.getPackageName());
            }
            ooo000o0.OooOo();
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Failed to send current screen to the service");
        }
    }

    private final void OooO0Oo() {
        ((oOo0000O) this.f29281OooOo).f14850OooOo.OooOo0O((ComponentName) this.f29283OooOo0o);
    }

    private final void OooO0o() {
        oOO0000 ooo0000 = (oOO0000) this.f29283OooOo0o;
        ooo0000.OooOoo0();
        ooo0000.OooO0O0().OooOO0O();
        if (ooo0000.f14808Oooo0OO == null) {
            ooo0000.f14808Oooo0OO = new ArrayList();
        }
        ooo0000.f14808Oooo0OO.add((Runnable) this.f29281OooOo);
        ooo0000.OooOOo0();
    }

    private final void OooO0o0() {
        oOo000o0 ooo000o0 = ((oOo0000O) this.f29281OooOo).f14850OooOo;
        ooo000o0.f14857OooOoO0 = null;
        if (((o000Oo0) this.f29283OooOo0o).OooO0o0() != 7777) {
            ooo000o0.OooOoO();
            return;
        }
        if (ooo000o0.f14860OooOoo0 == null) {
            ooo000o0.f14860OooOoo0 = Executors.newScheduledThreadPool(1);
        }
        ooo000o0.f14860OooOoo0.schedule(new Oooo.OooOOO(this, 6), ((Long) o0O000O.f14272OoooOoO.OooO00o(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final /* synthetic */ void OooO0oO() {
        OooOO0 oooOO0 = (OooOO0) this.f29283OooOo0o;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((oO0O000o) ((Service) oooOO0.f30538OooOo0o)).OooO0OO((JobParameters) this.f29281OooOo);
    }

    private final void OooO0oo() {
        Context context = (Context) this.f29283OooOo0o;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f29281OooOo;
        try {
            oOO0O00O.OooO0O0(context);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final void OooOO0() {
        OooOo00 o0000oo02;
        Set set;
        oOO0Oo00 ooo0oo00 = (oOO0Oo00) this.f29283OooOo0o;
        o000Oo0 o000oo0OooO0o0 = ooo0oo00.OooO0o0();
        boolean zOooOO0 = o000oo0OooO0o0.OooOO0();
        o0ooOOo o0ooooo = (o0ooOOo) this.f29281OooOo;
        if (zOooOO0) {
            o00oO0o o00oo0oOooO0o = ooo0oo00.OooO0o();
            o000000O.OooO0oo(o00oo0oOooO0o);
            o000Oo0 o000oo0OooO0o02 = o00oo0oOooO0o.OooO0o0();
            if (!o000oo0OooO0o02.OooOO0()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(o000oo0OooO0o02)), new Exception());
                o0ooooo.f16758OooOoo.OooO0O0(o000oo0OooO0o02);
                o0ooooo.f16759OooOoo0.disconnect();
                return;
            }
            o0OoOo0 o0oooo0 = o0ooooo.f16758OooOoo;
            IBinder iBinder = o00oo0oOooO0o.f13827OooOo0o;
            if (iBinder == null) {
                o0000oo02 = null;
            } else {
                int i = OooO0O0.f13733OooOo0o;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                o0000oo02 = iInterfaceQueryLocalInterface instanceof OooOo00 ? (OooOo00) iInterfaceQueryLocalInterface : new o0000OO0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
            }
            o0oooo0.getClass();
            if (o0000oo02 == null || (set = o0ooooo.f16755OooOoO) == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                o0oooo0.OooO0O0(new o000Oo0(4));
            } else {
                o0oooo0.f16750OooOoO0 = o0000oo02;
                o0oooo0.f16749OooOoO = set;
                if (o0oooo0.f16747OooOo0O) {
                    ((OooO0OO) o0oooo0.f16748OooOo0o).getRemoteService(o0000oo02, set);
                }
            }
        } else {
            o0ooooo.f16758OooOoo.OooO0O0(o000oo0OooO0o0);
        }
        o0ooooo.f16759OooOoo0.disconnect();
    }

    private final void OooOO0O() {
        ((o0000O00) this.f29281OooOo).f31124OooO0OO.OooO00o((Activity) this.f29283OooOo0o);
    }

    private final void OooOO0o() {
        try {
            OooOOo0();
        } catch (Error e) {
            synchronized (((o0O0OO0) this.f29281OooOo).f29720OooOo0o) {
                ((o0O0OO0) this.f29281OooOo).f29718OooOo = 1;
                throw e;
            }
        }
    }

    private final void OooOOO() {
        ((oo0o0Oo) this.f29281OooOo).OooOoo0((o00O00O) this.f29283OooOo0o);
    }

    private final void OooOOO0() {
        o000Oo0O.OooOo00 oooOo00 = (o000Oo0O.OooOo00) this.f29281OooOo;
        HashMap map = (HashMap) oooOo00.f30372OooOo0o;
        int size = map.size();
        OooOO0O oooOO0O = (OooOO0O) this.f29283OooOo0o;
        if (size > 0) {
            oooOO0O.onSignalsCollected(new JSONObject(map).toString());
            return;
        }
        String str = (String) oooOo00.f30370OooOo;
        if (str == null) {
            oooOO0O.onSignalsCollected("");
        } else {
            oooOO0O.onSignalsCollectionFailed(str);
        }
    }

    private final void OooOOOO() {
        ((oo0o0Oo) this.f29283OooOo0o).OooOoo0((o0Oo0oo) this.f29281OooOo);
    }

    private final void OooOOOo() {
        ((OooO) ((o00OO0.OooOO0) this.f29283OooOo0o)).OooO0oO((o00OO0.OooO0O0) this.f29281OooOo, OooOo.f33195OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0043, code lost:
    
        if (r1 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f29283OooOo0o).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x005d, code lost:
    
        o0000ooO.o0O0OO0.f29717OooOoOO.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f29283OooOo0o), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007a, code lost:
    
        r10.f29283OooOo0o = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooOOo0() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f29281OooOo     // Catch: java.lang.Throwable -> L58
            o0000ooO.o0O0OO0 r2 = (o0000ooO.o0O0OO0) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f29720OooOo0o     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f29281OooOo     // Catch: java.lang.Throwable -> L20
            o0000ooO.o0O0OO0 r0 = (o0000ooO.o0O0OO0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f29718OooOo     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f29722OooOoO0     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f29722OooOoO0 = r6     // Catch: java.lang.Throwable -> L20
            r0.f29718OooOo = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f29281OooOo     // Catch: java.lang.Throwable -> L20
            o0000ooO.o0O0OO0 r4 = (o0000ooO.o0O0OO0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f29720OooOo0o     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f29283OooOo0o = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f29281OooOo     // Catch: java.lang.Throwable -> L20
            o0000ooO.o0O0OO0 r0 = (o0000ooO.o0O0OO0) r0     // Catch: java.lang.Throwable -> L20
            r0.f29718OooOo = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f29283OooOo0o     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f29283OooOo0o = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = o0000ooO.o0O0OO0.f29717OooOoOO     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f29283OooOo0o     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f29283OooOo0o = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00000oO.OooOOO0.OooOOo0():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:639|(1:641)(25:643|1003|644|645|(1:648)(21:650|(1:652)|1013|653|(7:655|(1:657)(1:659)|995|660|999|661|662)|667|(2:669|(2:671|(2:673|(2:675|(2:677|(2:679|(1:681)(1:682))(1:683))(1:684))(1:685))(1:686))(1:687))(1:688)|689|997|690|(1:692)(1:693)|694|(1:696)|700|(1:702)(7:704|(0)(1:707)|(3:1001|709|(1:711)(1:712))|(2:718|(1:720)(4:721|(3:724|(1:1034)(1:1035)|722)|1033|727))(1:727)|(1:729)(1:730)|731|(30:733|(1:735)(1:736)|737|(1:739)|740|(1:742)(1:743)|744|(2:746|(2:751|(1:753)(1:754))(1:(3:750|751|(0)(0))(1:755)))(0)|756|(19:761|(1:763)|(1:779)|780|(1:782)|783|(2:788|(2:794|(2:802|(2:803|(1:1030)(2:805|(2:1031|807)(1:1032)))))(1:793))(1:787)|808|(3:812|(1:814)|815)|816|(1:818)|819|(1:823)|824|(3:826|(7:828|(1:830)(1:831)|832|(1:834)|835|(4:839|(1:841)|842|(1:844))|845)|846)(9:847|(3:849|(2:852|(5:854|(1:856)(1:857)|858|(1:860)|861))|862)(1:863)|864|(1:866)|867|1020|868|873|(5:875|(1:877)(1:878)|(1:882)|(1:884)|885))|886|(3:888|(1:890)(1:891)|(5:893|(1:895)|896|(1:898)|899))|900|901)(1:760)|764|(1:775)(1:777)|776|(0)|780|(0)|783|(3:785|788|(3:791|794|(5:796|798|800|802|(3:803|(0)(0)|1032)))(0))(0)|808|(4:810|812|(0)|815)(0)|816|(0)|819|(2:821|823)|824|(0)(0)|886|(0)|900|901)(2:902|903))|703|(0)|(0)(0)|(0)(0)|731|(0)(0))|649|1013|653|(0)(0)|667|(0)(0)|689|997|690|(0)(0)|694|(0)|700|(0)(0)|703|(0)|(0)(0)|(0)(0)|731|(0)(0))|642|667|(0)(0)|689|997|690|(0)(0)|694|(0)|700|(0)(0)|703|(0)|(0)(0)|(0)(0)|731|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:643|(2:1003|644)|645|(1:648)(21:650|(1:652)|1013|653|(7:655|(1:657)(1:659)|995|660|999|661|662)|667|(2:669|(2:671|(2:673|(2:675|(2:677|(2:679|(1:681)(1:682))(1:683))(1:684))(1:685))(1:686))(1:687))(1:688)|689|997|690|(1:692)(1:693)|694|(1:696)|700|(1:702)(7:704|(0)(1:707)|(3:1001|709|(1:711)(1:712))|(2:718|(1:720)(4:721|(3:724|(1:1034)(1:1035)|722)|1033|727))(1:727)|(1:729)(1:730)|731|(30:733|(1:735)(1:736)|737|(1:739)|740|(1:742)(1:743)|744|(2:746|(2:751|(1:753)(1:754))(1:(3:750|751|(0)(0))(1:755)))(0)|756|(19:761|(1:763)|(1:779)|780|(1:782)|783|(2:788|(2:794|(2:802|(2:803|(1:1030)(2:805|(2:1031|807)(1:1032)))))(1:793))(1:787)|808|(3:812|(1:814)|815)|816|(1:818)|819|(1:823)|824|(3:826|(7:828|(1:830)(1:831)|832|(1:834)|835|(4:839|(1:841)|842|(1:844))|845)|846)(9:847|(3:849|(2:852|(5:854|(1:856)(1:857)|858|(1:860)|861))|862)(1:863)|864|(1:866)|867|1020|868|873|(5:875|(1:877)(1:878)|(1:882)|(1:884)|885))|886|(3:888|(1:890)(1:891)|(5:893|(1:895)|896|(1:898)|899))|900|901)(1:760)|764|(1:775)(1:777)|776|(0)|780|(0)|783|(3:785|788|(3:791|794|(5:796|798|800|802|(3:803|(0)(0)|1032)))(0))(0)|808|(4:810|812|(0)|815)(0)|816|(0)|819|(2:821|823)|824|(0)(0)|886|(0)|900|901)(2:902|903))|703|(0)|(0)(0)|(0)(0)|731|(0)(0))|649|1013|653|(0)(0)|667|(0)(0)|689|997|690|(0)(0)|694|(0)|700|(0)(0)|703|(0)|(0)(0)|(0)(0)|731|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x032b, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x03ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x03f0, code lost:
    
        OoooOOO.o0OO0oO0.OooOOO0(r15);
        r15.f14393OooOoOO.OooO0Oo(OoooOOO.o0O0O0o0.OooOOoo(r8), "Fetching Google App Id failed with exception. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:1001:0x0435 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x070b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0307 A[Catch: NameNotFoundException -> 0x032b, TryCatch #10 {NameNotFoundException -> 0x032b, blocks: (B:653:0x02fc, B:655:0x0307, B:657:0x0313), top: B:1013:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x03e0 A[Catch: IllegalStateException -> 0x03ef, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x03ef, blocks: (B:690:0x03ce, B:694:0x03dc, B:696:0x03e0), top: B:997:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:888:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x09d2  */
    /* JADX WARN: Type inference failed for: r1v65, types: [OoooOOO.oO000o00] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, Oooo.OooOOOO, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 3122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00000oO.OooOOO0.run():void");
    }

    public String toString() {
        switch (this.f29282OooOo0O) {
            case 0:
                Oooo.OooOo00 oooOo00 = new Oooo.OooOo00(OooOOO0.class.getSimpleName(), 21);
                OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(24, false);
                ((OooO0oO.OooOOO0) oooOo00.f13713OooOoO0).f13278OooOo = oooOOO0;
                oooOo00.f13713OooOoO0 = oooOOO0;
                oooOOO0.f13280OooOo0o = (OooO0oO.OooOOO0) this.f29281OooOo;
                return oooOo00.toString();
            case 23:
                Runnable runnable = (Runnable) this.f29283OooOo0o;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((o0O0OO0) this.f29281OooOo).f29718OooOo;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ OooOOO0(Object obj, boolean z, Object obj2, int i) {
        this.f29282OooOo0O = i;
        this.f29283OooOo0o = obj2;
        this.f29281OooOo = obj;
    }

    public OooOOO0(oo0O oo0o, o0oo0000 o0oo0000Var) {
        this.f29282OooOo0O = 4;
        this.f29283OooOo0o = o0oo0000Var;
        Objects.requireNonNull(oo0o);
        this.f29281OooOo = oo0o;
    }

    public OooOOO0(o0OO000 o0oo000, o000OOo o000ooo2, o0OO000 o0oo0002) {
        this.f29282OooOo0O = 5;
        this.f29283OooOo0o = o000ooo2;
        this.f29281OooOo = o0oo000;
    }

    public OooOOO0(o0OO0oO0 o0oo0oo0, oO0000o0 oo0000o0) {
        this.f29282OooOo0O = 6;
        this.f29283OooOo0o = oo0000o0;
        Objects.requireNonNull(o0oo0oo0);
        this.f29281OooOo = o0oo0oo0;
    }

    public OooOOO0(o0OOo000 o0ooo000, o00O0OO0 o00o0oo0) {
        this.f29282OooOo0O = 7;
        this.f29283OooOo0o = o00o0oo0;
        Objects.requireNonNull(o0ooo000);
        this.f29281OooOo = o0ooo000;
    }

    public OooOOO0(oO0O0OoO oo0o0ooo, o00OO o00oo) {
        this.f29282OooOo0O = 10;
        this.f29283OooOo0o = o00oo;
        Objects.requireNonNull(oo0o0ooo);
        this.f29281OooOo = oo0o0ooo;
    }

    public OooOOO0(oO0O0OoO oo0o0ooo, o0000oo o0000ooVar) {
        this.f29282OooOo0O = 8;
        this.f29283OooOo0o = o0000ooVar;
        Objects.requireNonNull(oo0o0ooo);
        this.f29281OooOo = oo0o0ooo;
    }

    public OooOOO0(oO0O0OoO oo0o0ooo, Boolean bool) {
        this.f29282OooOo0O = 9;
        this.f29283OooOo0o = bool;
        Objects.requireNonNull(oo0o0ooo);
        this.f29281OooOo = oo0o0ooo;
    }

    public OooOOO0(oOo0000O ooo0000o, o000Oo0 o000oo02) {
        this.f29282OooOo0O = 16;
        this.f29283OooOo0o = o000oo02;
        Objects.requireNonNull(ooo0000o);
        this.f29281OooOo = ooo0000o;
    }

    public OooOOO0(oOo000o0 ooo000o0, oO00OOo0 oo00ooo0) {
        this.f29282OooOo0O = 14;
        this.f29283OooOo0o = oo00ooo0;
        Objects.requireNonNull(ooo000o0);
        this.f29281OooOo = ooo000o0;
    }

    public OooOOO0(AppMeasurementDynamiteService appMeasurementDynamiteService, OooO0oO.OooOOO0 oooOOO0) {
        this.f29282OooOo0O = 11;
        this.f29283OooOo0o = oooOOO0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f29281OooOo = appMeasurementDynamiteService;
    }

    public OooOOO0(OooOO0 oooOO0, oOO0000 ooo0000, Runnable runnable) {
        this.f29282OooOo0O = 17;
        this.f29283OooOo0o = ooo0000;
        this.f29281OooOo = runnable;
        Objects.requireNonNull(oooOO0);
    }

    public OooOOO0(o0O0OO0 o0o0oo0) {
        this.f29282OooOo0O = 23;
        this.f29281OooOo = o0o0oo0;
    }
}
