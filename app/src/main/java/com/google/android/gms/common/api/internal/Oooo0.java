package com.google.android.gms.common.api.internal;

import OooOooo.o000O0;
import OooOooo.o000Oo0;
import Oooo00O.o000000O;
import OoooOoO.oOO0O0;
import OoooOoo.oOO0O0O;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Oooo0 implements Oooo000.OooOO0O, Oooo000.OooOOO0 {

    /* renamed from: OooOo */
    public final OooO00o f16713OooOo;

    /* renamed from: OooOo0o */
    public final Oooo000.OooO0OO f16715OooOo0o;

    /* renamed from: OooOoO0 */
    public final OooO0oO.OooOOO0 f16717OooOoO0;

    /* renamed from: OooOoo */
    public final o0ooOOo f16719OooOoo;

    /* renamed from: OooOoo0 */
    public final int f16720OooOoo0;

    /* renamed from: OooOooO */
    public boolean f16721OooOooO;

    /* renamed from: Oooo00o */
    public final /* synthetic */ OooO0o f16725Oooo00o;

    /* renamed from: OooOo0O */
    public final LinkedList f16714OooOo0O = new LinkedList();

    /* renamed from: OooOoO */
    public final HashSet f16716OooOoO = new HashSet();

    /* renamed from: OooOoOO */
    public final HashMap f16718OooOoOO = new HashMap();

    /* renamed from: OooOooo */
    public final ArrayList f16722OooOooo = new ArrayList();

    /* renamed from: Oooo000 */
    public o000Oo0 f16723Oooo000 = null;

    /* renamed from: Oooo00O */
    public int f16724Oooo00O = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(OooO0o oooO0o, Oooo000.OooOO0 oooOO0) {
        this.f16725Oooo00o = oooO0o;
        Looper looper = oooO0o.f16711Oooo00o.getLooper();
        Oooo.OooOo00 oooOo00OooO00o = oooOO0.OooO00o();
        o000OO.o0OoOo0 o0oooo0 = new o000OO.o0OoOo0((String) oooOo00OooO00o.f13710OooOo, (ArraySet) oooOo00OooO00o.f13712OooOo0o, (String) oooOo00OooO00o.f13713OooOoO0);
        o0OOO0 o0ooo0 = (o0OOO0) oooOO0.f13724OooOo.f13280OooOo0o;
        o000000O.OooO0oo(o0ooo0);
        Oooo000.OooO0OO OooO0OO2 = o0ooo0.OooO0OO(oooOO0.f13725OooOo0O, looper, o0oooo0, oooOO0.f13728OooOoO0, this, this);
        String str = oooOO0.f13726OooOo0o;
        if (str != null && (OooO0OO2 instanceof Oooo00O.OooOO0O)) {
            ((Oooo00O.OooOO0O) OooO0OO2).setAttributionTag(str);
        }
        if (str != null && (OooO0OO2 instanceof OooOOO)) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo(OooO0OO2);
            throw null;
        }
        this.f16715OooOo0o = OooO0OO2;
        this.f16713OooOo = oooOO0.f13727OooOoO;
        this.f16717OooOoO0 = new OooO0oO.OooOOO0(19);
        this.f16720OooOoo0 = oooOO0.f13729OooOoOO;
        if (!OooO0OO2.requiresSignIn()) {
            this.f16719OooOoo = null;
            return;
        }
        OoooO0.OooOO0O oooOO0O = oooO0o.f16711Oooo00o;
        Oooo.OooOo00 oooOo00OooO00o2 = oooOO0.OooO00o();
        this.f16719OooOoo = new o0ooOOo(oooO0o.f16701OooOoO, oooOO0O, new o000OO.o0OoOo0((String) oooOo00OooO00o2.f13710OooOo, (ArraySet) oooOo00OooO00o2.f13712OooOo0o, (String) oooOo00OooO00o2.f13713OooOoO0));
    }

    @Override // Oooo000.OooOOO0
    public final void OooO(o000Oo0 o000oo02) {
        OooOOO0(o000oo02, null);
    }

    public final void OooO00o(o000Oo0 o000oo02) {
        HashSet hashSet = this.f16716OooOoO;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (o000000O.OooOO0o(o000oo02, o000Oo0.RESULT_SUCCESS)) {
                this.f16715OooOo0o.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void OooO0O0(Status status) {
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        OooO0OO(status, null, false);
    }

    public final void OooO0OO(Status status, RuntimeException runtimeException, boolean z) {
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f16714OooOo0O.iterator();
        while (it.hasNext()) {
            o00Oo0 o00oo0 = (o00Oo0) it.next();
            if (!z || o00oo0.f16731OooO00o == 2) {
                if (status != null) {
                    o00oo0.OooO0OO(status);
                } else {
                    o00oo0.OooO0Oo(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void OooO0Oo() {
        LinkedList linkedList = this.f16714OooOo0O;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o00Oo0 o00oo0 = (o00Oo0) arrayList.get(i);
            if (!this.f16715OooOo0o.isConnected()) {
                return;
            }
            if (OooO0oo(o00oo0)) {
                linkedList.remove(o00oo0);
            }
        }
    }

    public final void OooO0o(int i) {
        OooO0o oooO0o = this.f16725Oooo00o;
        o000000O.OooO0OO(oooO0o.f16711Oooo00o);
        this.f16723Oooo000 = null;
        this.f16721OooOooO = true;
        String lastDisconnectMessage = this.f16715OooOo0o.getLastDisconnectMessage();
        OooO0oO.OooOOO0 oooOOO0 = this.f16717OooOoO0;
        oooOOO0.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        oooOOO0.OooO(true, new Status(20, sb.toString(), null, null));
        OoooO0.OooOO0O oooOO0O = oooO0o.f16711Oooo00o;
        OooO00o oooO00o = this.f16713OooOo;
        oooOO0O.sendMessageDelayed(Message.obtain(oooOO0O, 9, oooO00o), 5000L);
        OoooO0.OooOO0O oooOO0O2 = oooO0o.f16711Oooo00o;
        oooOO0O2.sendMessageDelayed(Message.obtain(oooOO0O2, 11, oooO00o), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        ((SparseIntArray) oooO0o.f16705OooOoo0.f13280OooOo0o).clear();
        Iterator it = this.f16718OooOoOO.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void OooO0o0() {
        OooO0o oooO0o = this.f16725Oooo00o;
        o000000O.OooO0OO(oooO0o.f16711Oooo00o);
        this.f16723Oooo000 = null;
        OooO00o(o000Oo0.RESULT_SUCCESS);
        if (this.f16721OooOooO) {
            OoooO0.OooOO0O oooOO0O = oooO0o.f16711Oooo00o;
            OooO00o oooO00o = this.f16713OooOo;
            oooOO0O.removeMessages(11, oooO00o);
            oooO0o.f16711Oooo00o.removeMessages(9, oooO00o);
            this.f16721OooOooO = false;
        }
        Iterator it = this.f16718OooOoOO.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        OooO0Oo();
        OooO0oO();
    }

    public final void OooO0oO() {
        OooO0o oooO0o = this.f16725Oooo00o;
        OoooO0.OooOO0O oooOO0O = oooO0o.f16711Oooo00o;
        OooO00o oooO00o = this.f16713OooOo;
        oooOO0O.removeMessages(12, oooO00o);
        OoooO0.OooOO0O oooOO0O2 = oooO0o.f16711Oooo00o;
        oooOO0O2.sendMessageDelayed(oooOO0O2.obtainMessage(12, oooO00o), oooO0o.f16699OooOo0O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0oo(com.google.android.gms.common.api.internal.o00Oo0 r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.Oooo0.OooO0oo(com.google.android.gms.common.api.internal.o00Oo0):boolean");
    }

    public final boolean OooOO0(o000Oo0 o000oo02) {
        synchronized (OooO0o.f16697Oooo0o0) {
            this.f16725Oooo00o.getClass();
        }
        return false;
    }

    public final void OooOO0O() {
        OooO0o oooO0o = this.f16725Oooo00o;
        o000000O.OooO0OO(oooO0o.f16711Oooo00o);
        Oooo000.OooO0OO oooO0OO = this.f16715OooOo0o;
        if (oooO0OO.isConnected() || oooO0OO.isConnecting()) {
            return;
        }
        try {
            OooO0oO.OooOOO0 oooOOO0 = oooO0o.f16705OooOoo0;
            Context context = oooO0o.f16701OooOoO;
            oooOOO0.getClass();
            o000000O.OooO0oo(context);
            int iOooO0OO = 0;
            if (oooO0OO.requiresGooglePlayServices()) {
                int minApkVersion = oooO0OO.getMinApkVersion();
                SparseIntArray sparseIntArray = (SparseIntArray) oooOOO0.f13280OooOo0o;
                int i = sparseIntArray.get(minApkVersion, -1);
                if (i != -1) {
                    iOooO0OO = i;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= sparseIntArray.size()) {
                            iOooO0OO = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i2);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (iOooO0OO == -1) {
                        iOooO0OO = ((o000O0) oooOOO0.f13278OooOo).OooO0OO(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iOooO0OO);
                }
            }
            if (iOooO0OO != 0) {
                o000Oo0 o000oo02 = new o000Oo0(iOooO0OO, null);
                Log.w("GoogleApiManager", "The service for " + oooO0OO.getClass().getName() + " is not available: " + o000oo02.toString());
                OooOOO0(o000oo02, null);
                return;
            }
            OooO00o oooO00o = this.f16713OooOo;
            o0OoOo0 o0oooo0 = new o0OoOo0();
            o0oooo0.f16751OooOoOO = oooO0o;
            o0oooo0.f16750OooOoO0 = null;
            o0oooo0.f16749OooOoO = null;
            o0oooo0.f16747OooOo0O = false;
            o0oooo0.f16748OooOo0o = oooO0OO;
            o0oooo0.f16746OooOo = oooO00o;
            if (oooO0OO.requiresSignIn()) {
                o0ooOOo o0ooooo = this.f16719OooOoo;
                o000000O.OooO0oo(o0ooooo);
                oOO0O0O ooo0o0o = o0ooooo.f16759OooOoo0;
                if (ooo0o0o != null) {
                    ooo0o0o.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(o0ooooo));
                o000OO.o0OoOo0 o0oooo02 = o0ooooo.f16757OooOoOO;
                o0oooo02.f30184OooOo = numValueOf;
                OoooO0.OooOO0O oooOO0O = o0ooooo.f16753OooOo;
                o0ooooo.f16759OooOoo0 = (oOO0O0O) o0ooooo.f16756OooOoO0.OooO0OO(o0ooooo.f16754OooOo0o, oooOO0O.getLooper(), o0oooo02, (oOO0O0) o0oooo02.f30190OooOoo0, o0ooooo, o0ooooo);
                o0ooooo.f16758OooOoo = o0oooo0;
                Set set = o0ooooo.f16755OooOoO;
                if (set == null || set.isEmpty()) {
                    oooOO0O.post(new Oooo.OooOOO(o0ooooo, 14));
                } else {
                    oOO0O0O ooo0o0o2 = o0ooooo.f16759OooOoo0;
                    ooo0o0o2.getClass();
                    ooo0o0o2.connect(new Oooo00O.Oooo000(ooo0o0o2));
                }
            }
            try {
                oooO0OO.connect(o0oooo0);
            } catch (SecurityException e) {
                OooOOO0(new o000Oo0(10), e);
            }
        } catch (IllegalStateException e2) {
            OooOOO0(new o000Oo0(10), e2);
        }
    }

    public final void OooOO0o(o00Oo0 o00oo0) {
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        boolean zIsConnected = this.f16715OooOo0o.isConnected();
        LinkedList linkedList = this.f16714OooOo0O;
        if (zIsConnected) {
            if (OooO0oo(o00oo0)) {
                OooO0oO();
                return;
            } else {
                linkedList.add(o00oo0);
                return;
            }
        }
        linkedList.add(o00oo0);
        o000Oo0 o000oo02 = this.f16723Oooo000;
        if (o000oo02 == null || !o000oo02.OooO()) {
            OooOO0O();
        } else {
            OooOOO0(this.f16723Oooo000, null);
        }
    }

    @Override // Oooo000.OooOO0O
    public final void OooOOO(int i) {
        Looper looperMyLooper = Looper.myLooper();
        OooO0o oooO0o = this.f16725Oooo00o;
        if (looperMyLooper == oooO0o.f16711Oooo00o.getLooper()) {
            OooO0o(i);
        } else {
            oooO0o.f16711Oooo00o.post(new Oooo000(this, i, 0));
        }
    }

    public final void OooOOO0(o000Oo0 o000oo02, RuntimeException runtimeException) {
        oOO0O0O ooo0o0o;
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        o0ooOOo o0ooooo = this.f16719OooOoo;
        if (o0ooooo != null && (ooo0o0o = o0ooooo.f16759OooOoo0) != null) {
            ooo0o0o.disconnect();
        }
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        this.f16723Oooo000 = null;
        ((SparseIntArray) this.f16725Oooo00o.f16705OooOoo0.f13280OooOo0o).clear();
        OooO00o(o000oo02);
        if ((this.f16715OooOo0o instanceof Oooo0.OooO0OO) && o000oo02.OooO0o0() != 24) {
            OooO0o oooO0o = this.f16725Oooo00o;
            oooO0o.f16700OooOo0o = true;
            OoooO0.OooOO0O oooOO0O = oooO0o.f16711Oooo00o;
            oooOO0O.sendMessageDelayed(oooOO0O.obtainMessage(19), 300000L);
        }
        if (o000oo02.OooO0o0() == 4) {
            OooO0O0(OooO0o.f16695Oooo0OO);
            return;
        }
        if (this.f16714OooOo0O.isEmpty()) {
            this.f16723Oooo000 = o000oo02;
            return;
        }
        if (runtimeException != null) {
            o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
            OooO0OO(null, runtimeException, false);
            return;
        }
        if (!this.f16725Oooo00o.f16708Oooo0) {
            OooO0O0(OooO0o.OooO0OO(this.f16713OooOo, o000oo02));
            return;
        }
        OooO0OO(OooO0o.OooO0OO(this.f16713OooOo, o000oo02), null, true);
        if (this.f16714OooOo0O.isEmpty() || OooOO0(o000oo02) || this.f16725Oooo00o.OooO0O0(o000oo02, this.f16720OooOoo0)) {
            return;
        }
        if (o000oo02.OooO0o0() == 18) {
            this.f16721OooOooO = true;
        }
        if (!this.f16721OooOooO) {
            OooO0O0(OooO0o.OooO0OO(this.f16713OooOo, o000oo02));
            return;
        }
        OooO0o oooO0o2 = this.f16725Oooo00o;
        OooO00o oooO00o = this.f16713OooOo;
        OoooO0.OooOO0O oooOO0O2 = oooO0o2.f16711Oooo00o;
        oooOO0O2.sendMessageDelayed(Message.obtain(oooOO0O2, 9, oooO00o), 5000L);
    }

    public final void OooOOOO(o000Oo0 o000oo02) {
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        Oooo000.OooO0OO oooO0OO = this.f16715OooOo0o;
        oooO0OO.disconnect("onSignInFailed for " + oooO0OO.getClass().getName() + " with " + String.valueOf(o000oo02));
        OooOOO0(o000oo02, null);
    }

    public final void OooOOOo() {
        o000000O.OooO0OO(this.f16725Oooo00o.f16711Oooo00o);
        Status status = OooO0o.f16694Oooo0O0;
        OooO0O0(status);
        this.f16717OooOoO0.OooO(false, status);
        for (OooOOO0 oooOOO0 : (OooOOO0[]) this.f16718OooOoOO.keySet().toArray(new OooOOO0[0])) {
            OooOO0o(new o0Oo0oo(new TaskCompletionSource()));
        }
        OooO00o(new o000Oo0(4));
        Oooo000.OooO0OO oooO0OO = this.f16715OooOo0o;
        if (oooO0OO.isConnected()) {
            oooO0OO.onUserSignOut(new o000Ooo0.OooOO0(this, 17));
        }
    }

    @Override // Oooo000.OooOO0O
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        OooO0o oooO0o = this.f16725Oooo00o;
        if (looperMyLooper == oooO0o.f16711Oooo00o.getLooper()) {
            OooO0o0();
        } else {
            oooO0o.f16711Oooo00o.post(new Oooo.OooOOO(this, 12));
        }
    }
}
