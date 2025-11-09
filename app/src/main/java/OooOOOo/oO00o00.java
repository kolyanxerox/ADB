package OoooOOO;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.e91;
import com.google.android.gms.internal.ads.h61;
import com.google.android.gms.internal.ads.h91;
import com.google.android.gms.internal.ads.n51;
import com.google.android.gms.internal.ads.y81;
import com.google.android.gms.internal.measurement.o0000oo;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class oO00o00 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f14676OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14677OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f14678OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ boolean f14679OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f14680OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ Object f14681OooOoOO;

    /* renamed from: OooOoo0 */
    public final /* synthetic */ Object f14682OooOoo0;

    public /* synthetic */ oO00o00(n51 n51Var, Pair pair, y81 y81Var, e91 e91Var, IOException iOException, boolean z) {
        this.f14678OooOo0o = n51Var;
        this.f14676OooOo = pair;
        this.f14680OooOoO0 = y81Var;
        this.f14682OooOoo0 = e91Var;
        this.f14681OooOoOO = iOException;
        this.f14679OooOoO = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        oOO00OO ooo00oo;
        o0O000o0 o0o000o0;
        String str;
        o0OO0oO0 o0oo0oo0;
        AtomicReference atomicReference;
        oOo000o0 ooo000o0;
        o0O000o0 o0o000o02;
        switch (this.f14677OooOo0O) {
            case 0:
                String str2 = (String) this.f14678OooOo0o;
                o0000oo o0000ooVar = (o0000oo) this.f14682OooOoo0;
                oOo000o0 ooo000o02 = (oOo000o0) this.f14681OooOoOO;
                Bundle bundle = new Bundle();
                try {
                    try {
                        o0o000o0 = ooo000o02.f14857OooOoO0;
                        str = (String) this.f14676OooOo;
                        o0oo0oo0 = (o0OO0oO0) ooo000o02.f14574OooOo0O;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (o0o000o0 == null) {
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14393OooOoOO.OooO0Oo(str2, "Failed to get user properties; not connected to service", str);
                        ooo00oo = o0oo0oo0.f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo);
                        ooo00oo.OoooOOO(o0000ooVar, bundle);
                        return;
                    }
                    List<oOO000o> listO00000O = o0o000o0.o00000O(str2, str, this.f14679OooOoO, (oOO0) this.f14680OooOoO0);
                    Bundle bundle2 = new Bundle();
                    if (listO00000O != null) {
                        for (oOO000o ooo000o : listO00000O) {
                            String str3 = ooo000o.zze;
                            if (str3 != null) {
                                bundle2.putString(ooo000o.zzb, str3);
                            } else {
                                Long l = ooo000o.zzd;
                                if (l != null) {
                                    bundle2.putLong(ooo000o.zzb, l.longValue());
                                } else {
                                    Double d = ooo000o.zzg;
                                    if (d != null) {
                                        bundle2.putDouble(ooo000o.zzb, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        ooo000o02.OooOo();
                        oOO00OO ooo00oo2 = o0oo0oo0.f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo2);
                        ooo00oo2.OoooOOO(o0000ooVar, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) ooo000o02.f14574OooOo0O).f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o02);
                        o0o0o0o02.f14393OooOoOO.OooO0Oo(str2, "Failed to get user properties; remote exception", e);
                        ooo00oo = ((o0OO0oO0) ooo000o02.f14574OooOo0O).f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo);
                        ooo00oo.OoooOOO(o0000ooVar, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        oOO00OO ooo00oo3 = ((o0OO0oO0) ooo000o02.f14574OooOo0O).f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo3);
                        ooo00oo3.OoooOOO(o0000ooVar, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f14682OooOoo0;
                synchronized (atomicReference2) {
                    try {
                        try {
                            ooo000o0 = (oOo000o0) this.f14681OooOoOO;
                            o0o000o02 = ooo000o0.f14857OooOoO0;
                        } catch (RemoteException e3) {
                            o0O0O0o0 o0o0o0o03 = ((o0OO0oO0) ((oOo000o0) this.f14681OooOoOO).f14574OooOo0O).f14520OooOoOO;
                            o0OO0oO0.OooOOO0(o0o0o0o03);
                            o0o0o0o03.f14393OooOoOO.OooO0o0("(legacy) Failed to get user properties; remote exception", null, (String) this.f14678OooOo0o, e3);
                            ((AtomicReference) this.f14682OooOoo0).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f14682OooOoo0;
                        }
                        if (o0o000o02 == null) {
                            o0O0O0o0 o0o0o0o04 = ((o0OO0oO0) ooo000o0.f14574OooOo0O).f14520OooOoOO;
                            o0OO0oO0.OooOOO0(o0o0o0o04);
                            o0o0o0o04.f14393OooOoOO.OooO0o0("(legacy) Failed to get user properties; not connected to service", null, (String) this.f14678OooOo0o, (String) this.f14676OooOo);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(o0o000o02.o00000O((String) this.f14678OooOo0o, (String) this.f14676OooOo, this.f14679OooOoO, (oOO0) this.f14680OooOoO0));
                        } else {
                            atomicReference2.set(o0o000o02.OooOo0(null, (String) this.f14678OooOo0o, (String) this.f14676OooOo, this.f14679OooOoO));
                        }
                        ooo000o0.OooOo();
                        atomicReference = (AtomicReference) this.f14682OooOoo0;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f14682OooOoo0).notify();
                        throw th3;
                    }
                }
            default:
                h61 h61Var = (h61) ((n51) this.f14678OooOo0o).f21414OooO0O0.f19276OooOooO;
                Pair pair = (Pair) this.f14676OooOo;
                h61Var.OooO0o0(((Integer) pair.first).intValue(), (h91) pair.second, (y81) this.f14680OooOoO0, (e91) this.f14682OooOoo0, (IOException) this.f14681OooOoOO, this.f14679OooOoO);
                return;
        }
    }

    public oO00o00(oOo000o0 ooo000o0, String str, String str2, oOO0 ooo0, boolean z, o0000oo o0000ooVar) {
        this.f14678OooOo0o = str;
        this.f14676OooOo = str2;
        this.f14680OooOoO0 = ooo0;
        this.f14679OooOoO = z;
        this.f14682OooOoo0 = o0000ooVar;
        this.f14681OooOoOO = ooo000o0;
    }

    public oO00o00(oOo000o0 ooo000o0, AtomicReference atomicReference, String str, String str2, oOO0 ooo0, boolean z) {
        this.f14682OooOoo0 = atomicReference;
        this.f14678OooOo0o = str;
        this.f14676OooOo = str2;
        this.f14680OooOoO0 = ooo0;
        this.f14679OooOoO = z;
        this.f14681OooOoOO = ooo000o0;
    }
}
