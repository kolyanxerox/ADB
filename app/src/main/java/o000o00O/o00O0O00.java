package o000o00o;

import android.util.Log;
import androidx.datastore.core.DataStore;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o00O0O00 {

    /* renamed from: OooO */
    public boolean f30849OooO;

    /* renamed from: OooO00o */
    public final o000o0O.oo000o f30850OooO00o;

    /* renamed from: OooO0O0 */
    public final o00O0000 f30851OooO0O0;

    /* renamed from: OooO0OO */
    public final o000O0O0 f30852OooO0OO;

    /* renamed from: OooO0Oo */
    public final oo0o0O0 f30853OooO0Oo;

    /* renamed from: OooO0o */
    public final o0000O f30854OooO0o;

    /* renamed from: OooO0o0 */
    public final DataStore f30855OooO0o0;

    /* renamed from: OooO0oO */
    public final o00O0O0O.OooOOO0 f30856OooO0oO;

    /* renamed from: OooO0oo */
    public o000O0o f30857OooO0oo;

    /* renamed from: OooOO0 */
    public String f30858OooOO0;

    public o00O0O00(o000o0O.oo000o sessionsSettings, o00O0000 sessionGenerator, o000O0O0 sessionFirelogPublisher, oo0o0O0 timeProvider, DataStore sessionDataStore, o0000O processDataManager, o00O0O0O.OooOOO0 backgroundDispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.OooOo.OooO0o0(timeProvider, "timeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.OooOo.OooO0o0(processDataManager, "processDataManager");
        kotlin.jvm.internal.OooOo.OooO0o0(backgroundDispatcher, "backgroundDispatcher");
        this.f30850OooO00o = sessionsSettings;
        this.f30851OooO0O0 = sessionGenerator;
        this.f30852OooO0OO = sessionFirelogPublisher;
        this.f30853OooO0Oo = timeProvider;
        this.f30855OooO0o0 = sessionDataStore;
        this.f30854OooO0o = processDataManager;
        this.f30856OooO0oO = backgroundDispatcher;
        o00O00O o00o00o = o00O00O.f30839OooOo0O;
        this.f30858OooOO0 = "";
        o00O0oOo.o0000OO0.OooOo0(o00O0oOo.o0000OO0.OooO0O0(backgroundDispatcher), null, new o00O00(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object OooO00o(o000o00o.o00O0O00 r4, java.lang.String r5, o000o00o.o00O00O r6, o00O0O0O.OooO0OO r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.o00O0O00.OooO00o(o000o00o.o00O0O00, java.lang.String, o000o00o.o00O00O, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final void OooO0O0() {
        this.f30849OooO = false;
        if (this.f30857OooO0oo == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f30854OooO0o.OooO00o());
        o00O0oOo.o0000OO0.OooOo0(o00O0oOo.o0000OO0.OooO0O0(this.f30856OooO0oO), null, new o00O00OO(this, null), 3);
    }

    public final boolean OooO0OO(o000O0o o000o0o2) {
        Map map = o000o0o2.f30788OooO0OO;
        boolean z = true;
        o0000O o0000o2 = this.f30854OooO0o;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + o0000o2.OooO00o());
            return true;
        }
        o0000o2.getClass();
        o0000O0 o0000o02 = (o0000O0) map.get(o0000o2.OooO00o());
        if (o0000o02 != null && o0000o02.f30757OooO00o == o0000o2.f30753OooO0OO) {
            if (kotlin.jvm.internal.OooOo.OooO00o(o0000o02.f30758OooO0O0, (String) o0000o2.f30754OooO0Oo.getValue())) {
                z = false;
            }
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + o0000o2.OooO00o() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0Oo(o000o00o.o000O0o r12) {
        /*
            r11 = this;
            o000o00o.o00O0OO0 r0 = r12.f30787OooO0O0
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            o000o00o.o000O0 r12 = r12.f30786OooO00o
            if (r0 == 0) goto L74
            o000o00o.oo0o0O0 r4 = r11.f30853OooO0Oo
            o000o00o.o00O0OO0 r4 = r4.OooO00o()
            int r5 = o00O0oOO.OooOO0O.f31462OooOoO0
            long r4 = r4.f30860OooO00o
            long r6 = r0.f30860OooO00o
            long r4 = r4 - r6
            o00O0oOO.OooOOO r0 = o00O0oOO.OooOOO.f31464OooOo
            long r4 = Oooo0oO.o00000.OooOOO0(r4, r0)
            o000o0O.oo000o r0 = r11.f30850OooO00o
            o000o0O.o0O0O00 r6 = r0.f30945OooO00o
            o00O0oOO.OooOO0O r6 = r6.OooO0O0()
            r7 = 0
            if (r6 == 0) goto L37
            long r9 = r6.f31463OooOo0O
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L37
            boolean r6 = o00O0oOO.OooOO0O.OooO0o0(r9)
            if (r6 != 0) goto L37
            goto L54
        L37:
            o000o0O.o0O0O00 r0 = r0.f30946OooO0O0
            o00O0oOO.OooOO0O r0 = r0.OooO0O0()
            if (r0 == 0) goto L4c
            long r9 = r0.f31463OooOo0O
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4c
            boolean r0 = o00O0oOO.OooOO0O.OooO0o0(r9)
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            r0 = 30
            o00O0oOO.OooOOO r6 = o00O0oOO.OooOOO.f31466OooOoO
            long r9 = Oooo0oO.o00000.OooOO0o(r0, r6)
        L54:
            int r0 = o00O0oOO.OooOO0O.OooO0OO(r4, r9)
            if (r0 <= 0) goto L5b
            r3 = 1
        L5b:
            if (r3 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f30778OooO00o
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L73:
            return r3
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f30778OooO00o
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.o00O0O00.OooO0Oo(o000o00o.o000O0o):boolean");
    }
}
