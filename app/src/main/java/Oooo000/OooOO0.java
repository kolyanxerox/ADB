package Oooo000;

import Oooo00O.o000000O;
import OoooOOO.C0001o0;
import android.content.Context;
import android.os.Build;
import androidx.collection.ArraySet;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class OooOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final OooO0oO.OooOOO0 f13724OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f13725OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f13726OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.OooO00o f13727OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0O0 f13728OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f13729OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.OooO0o f13730OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final C0001o0 f13731OooOoo0;

    public OooOO0(Context context, OooO0oO.OooOOO0 oooOOO0, OooO0O0 oooO0O0, OooO oooO) {
        o000000O.OooO(context, "Null context is not permitted.");
        o000000O.OooO(oooOOO0, "Api must not be null.");
        o000000O.OooO(oooO, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        o000000O.OooO(applicationContext, "The provided context did not have an application context.");
        this.f13725OooOo0O = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f13726OooOo0o = attributionTag;
        this.f13724OooOo = oooOOO0;
        this.f13728OooOoO0 = oooO0O0;
        this.f13727OooOoO = new com.google.android.gms.common.api.internal.OooO00o(oooOOO0, oooO0O0, attributionTag);
        com.google.android.gms.common.api.internal.OooO0o oooO0oOooO0o0 = com.google.android.gms.common.api.internal.OooO0o.OooO0o0(applicationContext);
        this.f13730OooOoo = oooO0oOooO0o0;
        this.f13729OooOoOO = oooO0oOooO0o0.f16704OooOoo.getAndIncrement();
        this.f13731OooOoo0 = oooO.f13721OooO00o;
        OoooO0.OooOO0O oooOO0O = oooO0oOooO0o0.f16711Oooo00o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(7, this));
    }

    public final Oooo.OooOo00 OooO00o() {
        Oooo.OooOo00 oooOo00 = new Oooo.OooOo00(4);
        Set set = Collections.EMPTY_SET;
        if (((ArraySet) oooOo00.f13712OooOo0o) == null) {
            oooOo00.f13712OooOo0o = new ArraySet();
        }
        ((ArraySet) oooOo00.f13712OooOo0o).addAll(set);
        Context context = this.f13725OooOo0O;
        oooOo00.f13713OooOoO0 = context.getClass().getName();
        oooOo00.f13710OooOo = context.getPackageName();
        return oooOo00;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task OooO0O0(int r13, Oooooo.o0OOO0o r14) {
        /*
            r12 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.android.gms.common.api.internal.OooO0o r2 = r12.f13730OooOoo
            r2.getClass()
            OoooO0.OooOO0O r9 = r2.f16711Oooo00o
            int r3 = r14.f15085OooO0O0
            if (r3 == 0) goto L89
            boolean r1 = r2.OooO00o()
            if (r1 != 0) goto L17
            goto L5e
        L17:
            Oooo00O.Oooo000 r1 = Oooo00O.Oooo000.OooO0O0()
            java.lang.Object r1 = r1.f13781OooOo0O
            Oooo00O.Oooo0 r1 = (Oooo00O.Oooo0) r1
            com.google.android.gms.common.api.internal.OooO00o r4 = r12.f13727OooOoO
            r5 = 1
            if (r1 == 0) goto L60
            boolean r6 = r1.OooO0oO()
            if (r6 == 0) goto L5e
            boolean r1 = r1.OooO()
            java.util.concurrent.ConcurrentHashMap r6 = r2.f16707OooOooo
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.common.api.internal.Oooo0 r6 = (com.google.android.gms.common.api.internal.Oooo0) r6
            if (r6 == 0) goto L5c
            Oooo000.OooO0OO r7 = r6.f16715OooOo0o
            boolean r8 = r7 instanceof Oooo00O.OooOO0O
            if (r8 == 0) goto L5e
            Oooo00O.OooOO0O r7 = (Oooo00O.OooOO0O) r7
            boolean r8 = r7.hasConnectionInfo()
            if (r8 == 0) goto L5c
            boolean r8 = r7.isConnecting()
            if (r8 != 0) goto L5c
            Oooo00O.OooOOO0 r1 = com.google.android.gms.common.api.internal.o00Ooo.OooO00o(r6, r7, r3)
            if (r1 == 0) goto L5e
            int r7 = r6.f16724Oooo00O
            int r7 = r7 + r5
            r6.f16724Oooo00O = r7
            boolean r5 = r1.OooOO0()
            goto L60
        L5c:
            r5 = r1
            goto L60
        L5e:
            r1 = 0
            goto L77
        L60:
            com.google.android.gms.common.api.internal.o00Ooo r1 = new com.google.android.gms.common.api.internal.o00Ooo
            r6 = 0
            if (r5 == 0) goto L6b
            long r10 = java.lang.System.currentTimeMillis()
            goto L6c
        L6b:
            r10 = r6
        L6c:
            if (r5 == 0) goto L72
            long r6 = android.os.SystemClock.elapsedRealtime()
        L72:
            r7 = r6
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r7)
        L77:
            if (r1 == 0) goto L89
            com.google.android.gms.tasks.Task r3 = r0.getTask()
            r9.getClass()
            OooOOo0.o00Ooo r4 = new OooOOo0.o00Ooo
            r5 = 3
            r4.<init>(r9, r5)
            r3.addOnCompleteListener(r4, r1)
        L89:
            com.google.android.gms.common.api.internal.o0OOO0o r1 = new com.google.android.gms.common.api.internal.o0OOO0o
            OoooOOO.o0 r3 = r12.f13731OooOoo0
            r1.<init>(r13, r14, r0, r3)
            java.util.concurrent.atomic.AtomicInteger r13 = r2.f16706OooOooO
            com.google.android.gms.common.api.internal.o00oO0o r14 = new com.google.android.gms.common.api.internal.o00oO0o
            int r13 = r13.get()
            r14.<init>(r1, r13, r12)
            r13 = 4
            android.os.Message r13 = r9.obtainMessage(r13, r14)
            r9.sendMessage(r13)
            com.google.android.gms.tasks.Task r13 = r0.getTask()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo000.OooOO0.OooO0O0(int, Oooooo.o0OOO0o):com.google.android.gms.tasks.Task");
    }
}
